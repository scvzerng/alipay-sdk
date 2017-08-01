package com.alipay.api.fastjson;

import com.alipay.api.*;
import com.alipay.api.internal.mapping.Converter;
import com.alipay.api.internal.parser.json.JsonConverter;

/**
 *
 * fastjson解析器
 * Created by scvzerng on 2017/8/1.
 */
public class FastJSONParser <T extends AlipayResponse> implements AlipayParser<T> {

    private Class<T> clazz;

    public FastJSONParser(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T parse(String rsp) throws AlipayApiException {
        Converter converter = new FastJSONConverter();
        return converter.toResponse(rsp, clazz);
    }

    public Class<T> getResponseClass() {
        return clazz;
    }

    /**
     * @see com.alipay.api.AlipayParser#getSignItem(com.alipay.api.AlipayRequest, String)
     */
    public SignItem getSignItem(AlipayRequest<?> request, String responseBody)
            throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.getSignItem(request, responseBody);
    }

    /**
     * @see com.alipay.api.AlipayParser#encryptSourceData(com.alipay.api.AlipayRequest, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
     */
    public String encryptSourceData(AlipayRequest<?> request, String body, String format,
                                    String encryptType, String encryptKey, String charset)
            throws AlipayApiException {

        Converter converter = new JsonConverter();

        return converter.encryptSourceData(request, body, format, encryptType, encryptKey,
                charset);
    }
}
