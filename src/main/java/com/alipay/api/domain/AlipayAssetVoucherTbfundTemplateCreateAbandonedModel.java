package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝现金红包模板创建
 *
 * @author auto create
 * @since 1.0, 2016-08-30 17:18:21
 */
public class AlipayAssetVoucherTbfundTemplateCreateAbandonedModel extends AlipayObject {

	private static final long serialVersionUID = 4699997371592831542L;

	/**
	 * 模板过期时间
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 异步通知url（以http://或https://开头）
	 */
	@ApiField("notify_url")
	private String notifyUrl;

	/**
	 * 幂等业务号（同时也是业务通知标识）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 发行方名称
	 */
	@ApiField("publisher_name")
	private String publisherName;

	/**
	 * 模板金额（单位：元）
	 */
	@ApiField("template_amount")
	private String templateAmount;

	/**
	 * 模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	/**
	 * 出资方支付宝用户ID（模板充值过程需要使用该支付宝账号登录支付）
	 */
	@ApiField("user_id")
	private String userId;

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}
	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPublisherName() {
		return this.publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getTemplateAmount() {
		return this.templateAmount;
	}
	public void setTemplateAmount(String templateAmount) {
		this.templateAmount = templateAmount;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
