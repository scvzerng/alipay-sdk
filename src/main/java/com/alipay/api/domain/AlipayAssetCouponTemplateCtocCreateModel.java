package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 新增的红包大促红包活动模板类型，支持不冻结资金和专用红包发放资金账户的红包模板创建
 *
 * @author auto create
 * @since 1.0, 2015-10-12 14:48:14
 */
public class AlipayAssetCouponTemplateCtocCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7516167879316968676L;

	/**
	 * 可选参数，pc 红包使用地址
	 */
	@ApiField("active_url")
	private String activeUrl;

	/**
	 * 可选参数，APP红包使用地址
	 */
	@ApiField("app_active_url")
	private String appActiveUrl;

	/**
	 * 红包名称
	 */
	@ApiField("coupon_name")
	private String couponName;

	/**
	 * 红包发放PID
模板创建后只能用该指定PID发红包
	 */
	@ApiField("coupon_partner_id")
	private String couponPartnerId;

	/**
	 * 保证金总金额（单位：元）
等于发行预算总金额
	 */
	@ApiField("cust_guarantee_amount")
	private String custGuaranteeAmount;

	/**
	 * 领用规则，后台配置，需要提前沟通
	 */
	@ApiField("draw_rule_uuid")
	private String drawRuleUuid;

	/**
	 * 资金归集账号
支付、退款时实际使用的资金流出/注入账号
	 */
	@ApiField("fund_account")
	private String fundAccount;

	/**
	 * 可选参数，C2C资金归集交易号（支付宝交易号）
	 */
	@ApiField("fund_order_no")
	private String fundOrderNo;

	/**
	 * 可选参数，C2C资金归集时间
	 */
	@ApiField("fund_trans_date")
	private String fundTransDate;

	/**
	 * 红包使用开始时间
当gmt_cou_rel="R"时，该值为数字（单位为天）
	 */
	@ApiField("gmt_cou_active")
	private String gmtCouActive;

	/**
	 * 红包使用结束时间
当gmt_cou_rel = 'R'时，该值为数字（单位为天）
	 */
	@ApiField("gmt_cou_expired")
	private String gmtCouExpired;

	/**
	 * 使用结束时间类型
A = 绝对时间，R = 相对时间
	 */
	@ApiField("gmt_cou_rel")
	private String gmtCouRel;

	/**
	 * 领用结束时间
	 */
	@ApiField("gmt_draw_end")
	private String gmtDrawEnd;

	/**
	 * 幂等控制业务号
需要保证全局唯一，同一个out_order_no多次调用需要保证参数一致，特别是账号和金额；
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 使用规则，后台配置，需要提前沟通
	 */
	@ApiField("pay_rule_uuid")
	private String payRuleUuid;

	/**
	 * 可选参数，红包活动地址
	 */
	@ApiField("publish_url")
	private String publishUrl;

	/**
	 * 实际红包发行人的支付宝账号；
该账号不直接参与红包支付、退款的资金流出和注入
	 */
	@ApiField("publisher_account")
	private String publisherAccount;

	/**
	 * 红包模板名称
	 */
	@ApiField("template_name")
	private String templateName;

	public String getActiveUrl() {
		return this.activeUrl;
	}
	public void setActiveUrl(String activeUrl) {
		this.activeUrl = activeUrl;
	}

	public String getAppActiveUrl() {
		return this.appActiveUrl;
	}
	public void setAppActiveUrl(String appActiveUrl) {
		this.appActiveUrl = appActiveUrl;
	}

	public String getCouponName() {
		return this.couponName;
	}
	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponPartnerId() {
		return this.couponPartnerId;
	}
	public void setCouponPartnerId(String couponPartnerId) {
		this.couponPartnerId = couponPartnerId;
	}

	public String getCustGuaranteeAmount() {
		return this.custGuaranteeAmount;
	}
	public void setCustGuaranteeAmount(String custGuaranteeAmount) {
		this.custGuaranteeAmount = custGuaranteeAmount;
	}

	public String getDrawRuleUuid() {
		return this.drawRuleUuid;
	}
	public void setDrawRuleUuid(String drawRuleUuid) {
		this.drawRuleUuid = drawRuleUuid;
	}

	public String getFundAccount() {
		return this.fundAccount;
	}
	public void setFundAccount(String fundAccount) {
		this.fundAccount = fundAccount;
	}

	public String getFundOrderNo() {
		return this.fundOrderNo;
	}
	public void setFundOrderNo(String fundOrderNo) {
		this.fundOrderNo = fundOrderNo;
	}

	public String getFundTransDate() {
		return this.fundTransDate;
	}
	public void setFundTransDate(String fundTransDate) {
		this.fundTransDate = fundTransDate;
	}

	public String getGmtCouActive() {
		return this.gmtCouActive;
	}
	public void setGmtCouActive(String gmtCouActive) {
		this.gmtCouActive = gmtCouActive;
	}

	public String getGmtCouExpired() {
		return this.gmtCouExpired;
	}
	public void setGmtCouExpired(String gmtCouExpired) {
		this.gmtCouExpired = gmtCouExpired;
	}

	public String getGmtCouRel() {
		return this.gmtCouRel;
	}
	public void setGmtCouRel(String gmtCouRel) {
		this.gmtCouRel = gmtCouRel;
	}

	public String getGmtDrawEnd() {
		return this.gmtDrawEnd;
	}
	public void setGmtDrawEnd(String gmtDrawEnd) {
		this.gmtDrawEnd = gmtDrawEnd;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayRuleUuid() {
		return this.payRuleUuid;
	}
	public void setPayRuleUuid(String payRuleUuid) {
		this.payRuleUuid = payRuleUuid;
	}

	public String getPublishUrl() {
		return this.publishUrl;
	}
	public void setPublishUrl(String publishUrl) {
		this.publishUrl = publishUrl;
	}

	public String getPublisherAccount() {
		return this.publisherAccount;
	}
	public void setPublisherAccount(String publisherAccount) {
		this.publisherAccount = publisherAccount;
	}

	public String getTemplateName() {
		return this.templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

}
