package com.alipay.api.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alipay.api.*;
import com.alipay.api.internal.parser.xml.ObjectXmlParser;
import com.alipay.api.internal.util.*;

import java.io.IOException;
import java.security.Security;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

/**
 * Created by scvzerng on 2017/8/1.
 */
public class DefaultFastJSONAlipayClient implements FastJSONAlipayClient {
    private String serverUrl;
    private String appId;
    private String privateKey;
    private String prodCode;
    private String format         = AlipayConstants.FORMAT_JSON;
    private String sign_type      = AlipayConstants.SIGN_TYPE_RSA;

    private String encryptType    = AlipayConstants.ENCRYPT_TYPE_AES;

    private String encryptKey;

    private String alipayPublicKey;

    private String charset;

    private int    connectTimeout = 3000;
    private int    readTimeout    = 15000;

    static {
        //清除安全设置
        Security.setProperty("jdk.certpath.disabledAlgorithms", "");
    }

    public DefaultFastJSONAlipayClient(String serverUrl, String appId, String privateKey) {
        this.serverUrl = serverUrl;
        this.appId = appId;
        this.privateKey = privateKey;
        this.alipayPublicKey = null;
    }

    public DefaultFastJSONAlipayClient(String serverUrl, String appId, String privateKey, String format) {
        this(serverUrl, appId, privateKey);
        this.format = format;
    }

    public DefaultFastJSONAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset) {
        this(serverUrl, appId, privateKey);
        this.format = format;
        this.charset = charset;
    }

    public DefaultFastJSONAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPulicKey) {
        this(serverUrl, appId, privateKey);
        this.format = format;
        this.charset = charset;
        this.alipayPublicKey = alipayPulicKey;
    }

    public DefaultFastJSONAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPulicKey, String signType) {

        this(serverUrl, appId, privateKey, format, charset, alipayPulicKey);

        this.sign_type = signType;
    }

    public DefaultFastJSONAlipayClient(String serverUrl, String appId, String privateKey, String format,
                               String charset, String alipayPulicKey, String signType,
                               String encryptKey, String encryptType) {

        this(serverUrl, appId, privateKey, format, charset, alipayPulicKey, signType);

        this.encryptType = encryptType;
        this.encryptKey = encryptKey;
    }

    @Override
    public <T extends AlipayResponse> T execute(AlipayRequest<T> request, SerializerFeature... features) throws AlipayApiException {
        return _execute(request, new FastJSONParser<T>(request.getResponseClass()));
    }





  private void clearIdentity(AlipayRequest<?> request){
      if(request.getBizModel()!=null) {
          request.getBizModel().setIdentity(null);
      }
  }

    /**
     * 组装接口参数，处理加密、签名逻辑
     *
     * @param request
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> RequestParametersHolder getRequestHolderWithSign(AlipayRequest<?> request,SerializerFeature...features) throws AlipayApiException {
        clearIdentity(request);
        RequestParametersHolder requestHolder = new RequestParametersHolder();
        AlipayHashMap appParams = new AlipayHashMap(request.getTextParams());

        // 仅当API包含biz_content参数且值为空时，序列化bizModel填充bizContent
        try {


            if (request.getClass().getMethod("getBizContent") != null
                    && StringUtils.isEmpty(appParams.get(AlipayConstants.BIZ_CONTENT_KEY))
                    && request.getBizModel() != null) {
                appParams.put(AlipayConstants.BIZ_CONTENT_KEY,
                        JSON.toJSONString(request.getBizModel(), new ValueFilter() {
                            @Override
                            public Object process(Object object, String name, Object value) {
                                return value instanceof Number ?value.toString():value;
                            }
                        },features));
            }
        } catch (NoSuchMethodException e) {
            // 找不到getBizContent则什么都不做
        } catch (SecurityException e) {
            AlipayLogger.logBizError(e);
        }

        // 只有新接口和设置密钥才能支持加密
        if (request.isNeedEncrypt()) {

            if (StringUtils.isEmpty(appParams.get(AlipayConstants.BIZ_CONTENT_KEY))) {

                throw new AlipayApiException("当前API不支持加密请求");
            }

            // 需要加密必须设置密钥和加密算法
            if (!StringUtils.areNotEmpty(this.encryptKey, this.encryptType)) {

                throw new AlipayApiException("API请求要求加密，则必须设置密钥和密钥类型：encryptKey=" + encryptKey
                        + ",encryptType=" + encryptType);
            }

            String encryptContent = AlipayEncrypt.encryptContent(
                    appParams.get(AlipayConstants.BIZ_CONTENT_KEY), this.encryptType, this.encryptKey,
                    this.charset);

            appParams.put(AlipayConstants.BIZ_CONTENT_KEY, encryptContent);
        }

        requestHolder.setApplicationParams(appParams);

        if (StringUtils.isEmpty(charset)) {
            charset = AlipayConstants.CHARSET_UTF8;
        }

        AlipayHashMap protocalMustParams = new AlipayHashMap();
        protocalMustParams.put(AlipayConstants.METHOD, request.getApiMethodName());
        protocalMustParams.put(AlipayConstants.VERSION, request.getApiVersion());
        protocalMustParams.put(AlipayConstants.APP_ID, this.appId);
        protocalMustParams.put(AlipayConstants.SIGN_TYPE, this.sign_type);
        protocalMustParams.put(AlipayConstants.TERMINAL_TYPE, request.getTerminalType());
        protocalMustParams.put(AlipayConstants.TERMINAL_INFO, request.getTerminalInfo());
        protocalMustParams.put(AlipayConstants.NOTIFY_URL, request.getNotifyUrl());
        protocalMustParams.put(AlipayConstants.RETURN_URL, request.getReturnUrl());
        protocalMustParams.put(AlipayConstants.CHARSET, charset);

        if (request.isNeedEncrypt()) {
            protocalMustParams.put(AlipayConstants.ENCRYPT_TYPE, this.encryptType);
        }

        Long timestamp = System.currentTimeMillis();
        DateFormat df = new SimpleDateFormat(AlipayConstants.DATE_TIME_FORMAT);
        df.setTimeZone(TimeZone.getTimeZone(AlipayConstants.DATE_TIMEZONE));
        protocalMustParams.put(AlipayConstants.TIMESTAMP, df.format(new Date(timestamp)));
        requestHolder.setProtocalMustParams(protocalMustParams);

        AlipayHashMap protocalOptParams = new AlipayHashMap();
        protocalOptParams.put(AlipayConstants.FORMAT, format);
        protocalOptParams.put(AlipayConstants.ALIPAY_SDK, AlipayConstants.SDK_VERSION);
        protocalOptParams.put(AlipayConstants.PROD_CODE, request.getProdCode());
        requestHolder.setProtocalOptParams(protocalOptParams);

        if (!StringUtils.isEmpty(this.sign_type)) {

            String signContent = AlipaySignature.getSignatureContent(requestHolder);
            protocalMustParams.put(AlipayConstants.SIGN,
                    AlipaySignature.rsaSign(signContent, privateKey, charset, this.sign_type));

        } else {
            protocalMustParams.put(AlipayConstants.SIGN, "");
        }
        return requestHolder;
    }

    /**
     * 获取POST请求的base url
     *
     * @param requestHolder
     * @return
     * @throws AlipayApiException
     */
    private String getRequestUrl(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer(serverUrl);
        try {
            String sysMustQuery = WebUtils.buildQuery(requestHolder.getProtocalMustParams(),
                    charset);
            String sysOptQuery = WebUtils.buildQuery(requestHolder.getProtocalOptParams(), charset);

            urlSb.append("?");
            urlSb.append(sysMustQuery);
            if (sysOptQuery != null & sysOptQuery.length() > 0) {
                urlSb.append("&");
                urlSb.append(sysOptQuery);
            }
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

        return urlSb.toString();
    }

    /**
     * GET模式下获取跳转链接
     *
     * @param requestHolder
     * @return
     * @throws AlipayApiException
     */
    private String getRedirectUrl(RequestParametersHolder requestHolder) throws AlipayApiException {
        StringBuffer urlSb = new StringBuffer(serverUrl);
        try {
            Map<String, String> sortedMap = AlipaySignature.getSortedMap(requestHolder);
            String sortedQuery = WebUtils.buildQuery(sortedMap, charset);
            String sign = requestHolder.getProtocalMustParams().get(AlipayConstants.SIGN);
            urlSb.append("?");
            urlSb.append(sortedQuery);
            if (sign != null & sign.length() > 0) {
                Map<String, String> signMap = new HashMap<String, String>();
                signMap.put(AlipayConstants.SIGN, sign);
                String signQuery = WebUtils.buildQuery(signMap, charset);
                urlSb.append("&");
                urlSb.append(signQuery);
            }
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }

        return urlSb.toString();
    }



    private <T extends AlipayResponse> T _execute(AlipayRequest<T> request, AlipayParser<T> parser) throws AlipayApiException {

        Map<String, Object> rt = doPost(request);
        if (rt == null) {
            return null;
        }

        T tRsp = null;

        try {

            // 若需要解密则先解密
            ResponseEncryptItem responseItem = encryptResponse(request, rt, parser);

            // 解析实际串
            tRsp = parser.parse(responseItem.getRealContent());
            tRsp.setBody(responseItem.getRealContent());

            // 验签是对请求返回原始串
            checkResponseSign(request, parser, responseItem.getRespContent(), tRsp.isSuccess());

        } catch (RuntimeException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"));
            throw e;
        } catch (AlipayApiException e) {

            AlipayLogger.logBizError((String) rt.get("rsp"));
            throw new AlipayApiException(e);
        }

        tRsp.setParams((AlipayHashMap) rt.get("textParams"));
        if (!tRsp.isSuccess()) {
            AlipayLogger.logErrorScene(rt, tRsp, "");
        }
        return tRsp;
    }

    /**
     *
     *
     * @param request
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> Map<String, Object> doPost(AlipayRequest<T> request,SerializerFeature... features) throws AlipayApiException {
        Map<String, Object> result = new HashMap<String, Object>();
        RequestParametersHolder requestHolder = getRequestHolderWithSign(request,features);

        String url = getRequestUrl(requestHolder);

        // 打印完整请求报文
        if (AlipayLogger.isBizDebugEnabled()) {
            AlipayLogger.logBizDebug(getRedirectUrl(requestHolder));
        }

        String rsp = null;
        try {
            if (request instanceof AlipayUploadRequest) {
                AlipayUploadRequest<T> uRequest = (AlipayUploadRequest<T>) request;
                Map<String, FileItem> fileParams = AlipayUtils.cleanupMap(uRequest.getFileParams());
                rsp = WebUtils.doPost(url, requestHolder.getApplicationParams(), fileParams,
                        charset, connectTimeout, readTimeout);
            } else {
                rsp = WebUtils.doPost(url, requestHolder.getApplicationParams(), charset,
                        connectTimeout, readTimeout);
            }
        } catch (IOException e) {
            throw new AlipayApiException(e);
        }
        result.put("rsp", rsp);
        result.put("textParams", requestHolder.getApplicationParams());
        result.put("protocalMustParams", requestHolder.getProtocalMustParams());
        result.put("protocalOptParams", requestHolder.getProtocalOptParams());
        result.put("url", url);
        return result;
    }

    /**
     *  检查响应签名
     *
     * @param request
     * @param parser
     * @param responseBody
     * @param responseIsSucess
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> void checkResponseSign(AlipayRequest<T> request,
                                                              AlipayParser<T> parser,
                                                              String responseBody,
                                                              boolean responseIsSucess) throws AlipayApiException {
        // 针对成功结果且有支付宝公钥的进行验签
        if (!StringUtils.isEmpty(this.alipayPublicKey)) {

            SignItem signItem = parser.getSignItem(request, responseBody);

            if (signItem == null) {

                throw new AlipayApiException("sign check fail: Body is Empty!");
            }

            if (responseIsSucess
                    || (!responseIsSucess && !StringUtils.isEmpty(signItem.getSign()))) {

                boolean rsaCheckContent = AlipaySignature.rsaCheck(signItem.getSignSourceDate(),
                        signItem.getSign(), this.alipayPublicKey, this.charset, this.sign_type);

                if (!rsaCheckContent) {

                    // 针对JSON \/问题，替换/后再尝试做一次验证
                    if (!StringUtils.isEmpty(signItem.getSignSourceDate())
                            && signItem.getSignSourceDate().contains("\\/")) {

                        String srouceData = signItem.getSignSourceDate().replace("\\/", "/");

                        boolean jsonCheck = AlipaySignature.rsaCheck(srouceData, signItem.getSign(),
                                this.alipayPublicKey, this.charset, this.sign_type);

                        if (!jsonCheck) {
                            throw new AlipayApiException(
                                    "sign check fail: check Sign and Data Fail！JSON also！");
                        }
                    } else {

                        throw new AlipayApiException("sign check fail: check Sign and Data Fail!");
                    }
                }
            }

        }
    }

    /**
     *  解密响应
     *
     * @param request
     * @param rt
     * @param parser
     * @return
     * @throws AlipayApiException
     */
    private <T extends AlipayResponse> ResponseEncryptItem encryptResponse(AlipayRequest<T> request,
                                                                           Map<String, Object> rt,
                                                                           AlipayParser<T> parser) throws AlipayApiException {

        String responseBody = (String) rt.get("rsp");

        String realBody = null;

        // 解密
        if (request.isNeedEncrypt()) {

            // 解密原始串
            realBody = parser.encryptSourceData(request, responseBody, this.format,
                    this.encryptType, this.encryptKey, this.charset);
        } else {

            // 解析原内容串
            realBody = (String) rt.get("rsp");
        }

        return new ResponseEncryptItem(responseBody, realBody);

    }

}
