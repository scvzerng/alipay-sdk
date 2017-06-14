package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayCouponTemplateCreateResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.coupon.template.create request
 * 
 * @author auto create
 * @since 1.0, 2015-04-23 17:54:31
 */
public class AlipayCouponTemplateCreateRequest implements AlipayRequest<AlipayCouponTemplateCreateResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 红包使用地址
	 */
	private String activeUrl;

	/** 
	* 平均红包面额（单位为元）
	 */
	private String amount;

	/** 
	* 红包名称
	 */
	private String couponName;

	/** 
	* 红包发放总金额（保证金总额，单位为元）
	 */
	private String custGuaranteeAmount;

	/** 
	* 领用规则ID（线下提前沟通）
	 */
	private String drawBizRuleId;

	/** 
	* 红包使用开始时间（绝对时间指定具体日期时间，相对时间为数字天数）
	 */
	private String gmtCouActive;

	/** 
	* 红包使用结束时间（绝对时间为具体日期时间，相对时间为数字天数）
	 */
	private String gmtCouExpired;

	/** 
	* 使用结束时间类型（"A"=绝对时间，"R"=相对时间）
	 */
	private String gmtCouRel;

	/** 
	* 领用结束时间
	 */
	private String gmtDrawEnd;

	/** 
	* 是否允许累加使用（"Y"=允许，"N"=不允许）
	 */
	private String isAllowAddUp;

	/** 
	* 预估发行红包个数
	 */
	private String maxPublishNum;

	/** 
	* 模板创建幂等控制业务号（每个幂等业务号多次调用的参数必需一致，一个幂等业务号多次调用传递不同的业务参数不保证幂等性）
	 */
	private String outOrderNo;

	/** 
	* 使用规则ID（线下提前沟通）
	 */
	private String payBizRuleId;

	/** 
	* 保证金账号（红包发放出资支付宝账号）
	 */
	private String promiseAccount;

	/** 
	* 红包活动地址
	 */
	private String publishUrl;

	/** 
	* 发行人账号（支付宝登录ID）
	 */
	private String publisherEmail;

	/** 
	* 发行人名称
	 */
	private String publisherName;

	/** 
	* 指定交易商户列表（最多支持5个，以分号分隔）
	 */
	private String sellers;

	/** 
	* 红包模板名称
	 */
	private String templateName;

	public void setActiveUrl(String activeUrl) {
		this.activeUrl = activeUrl;
	}
	public String getActiveUrl() {
		return this.activeUrl;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount() {
		return this.amount;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}
	public String getCouponName() {
		return this.couponName;
	}

	public void setCustGuaranteeAmount(String custGuaranteeAmount) {
		this.custGuaranteeAmount = custGuaranteeAmount;
	}
	public String getCustGuaranteeAmount() {
		return this.custGuaranteeAmount;
	}

	public void setDrawBizRuleId(String drawBizRuleId) {
		this.drawBizRuleId = drawBizRuleId;
	}
	public String getDrawBizRuleId() {
		return this.drawBizRuleId;
	}

	public void setGmtCouActive(String gmtCouActive) {
		this.gmtCouActive = gmtCouActive;
	}
	public String getGmtCouActive() {
		return this.gmtCouActive;
	}

	public void setGmtCouExpired(String gmtCouExpired) {
		this.gmtCouExpired = gmtCouExpired;
	}
	public String getGmtCouExpired() {
		return this.gmtCouExpired;
	}

	public void setGmtCouRel(String gmtCouRel) {
		this.gmtCouRel = gmtCouRel;
	}
	public String getGmtCouRel() {
		return this.gmtCouRel;
	}

	public void setGmtDrawEnd(String gmtDrawEnd) {
		this.gmtDrawEnd = gmtDrawEnd;
	}
	public String getGmtDrawEnd() {
		return this.gmtDrawEnd;
	}

	public void setIsAllowAddUp(String isAllowAddUp) {
		this.isAllowAddUp = isAllowAddUp;
	}
	public String getIsAllowAddUp() {
		return this.isAllowAddUp;
	}

	public void setMaxPublishNum(String maxPublishNum) {
		this.maxPublishNum = maxPublishNum;
	}
	public String getMaxPublishNum() {
		return this.maxPublishNum;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo() {
		return this.outOrderNo;
	}

	public void setPayBizRuleId(String payBizRuleId) {
		this.payBizRuleId = payBizRuleId;
	}
	public String getPayBizRuleId() {
		return this.payBizRuleId;
	}

	public void setPromiseAccount(String promiseAccount) {
		this.promiseAccount = promiseAccount;
	}
	public String getPromiseAccount() {
		return this.promiseAccount;
	}

	public void setPublishUrl(String publishUrl) {
		this.publishUrl = publishUrl;
	}
	public String getPublishUrl() {
		return this.publishUrl;
	}

	public void setPublisherEmail(String publisherEmail) {
		this.publisherEmail = publisherEmail;
	}
	public String getPublisherEmail() {
		return this.publisherEmail;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherName() {
		return this.publisherName;
	}

	public void setSellers(String sellers) {
		this.sellers = sellers;
	}
	public String getSellers() {
		return this.sellers;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	public String getTemplateName() {
		return this.templateName;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.coupon.template.create";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("active_url", this.activeUrl);
		txtParams.put("amount", this.amount);
		txtParams.put("coupon_name", this.couponName);
		txtParams.put("cust_guarantee_amount", this.custGuaranteeAmount);
		txtParams.put("draw_biz_rule_id", this.drawBizRuleId);
		txtParams.put("gmt_cou_active", this.gmtCouActive);
		txtParams.put("gmt_cou_expired", this.gmtCouExpired);
		txtParams.put("gmt_cou_rel", this.gmtCouRel);
		txtParams.put("gmt_draw_end", this.gmtDrawEnd);
		txtParams.put("is_allow_add_up", this.isAllowAddUp);
		txtParams.put("max_publish_num", this.maxPublishNum);
		txtParams.put("out_order_no", this.outOrderNo);
		txtParams.put("pay_biz_rule_id", this.payBizRuleId);
		txtParams.put("promise_account", this.promiseAccount);
		txtParams.put("publish_url", this.publishUrl);
		txtParams.put("publisher_email", this.publisherEmail);
		txtParams.put("publisher_name", this.publisherName);
		txtParams.put("sellers", this.sellers);
		txtParams.put("template_name", this.templateName);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayCouponTemplateCreateResponse> getResponseClass() {
		return AlipayCouponTemplateCreateResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
