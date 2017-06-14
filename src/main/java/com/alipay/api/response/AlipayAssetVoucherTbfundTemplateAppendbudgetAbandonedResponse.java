package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.voucher.tbfund.template.appendbudget.abandoned response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-30 17:19:22
 */
public class AlipayAssetVoucherTbfundTemplateAppendbudgetAbandonedResponse extends AlipayResponse {

	private static final long serialVersionUID = 6783945236315255358L;

	/** 
	 * 预算追加支付url
	 */
	@ApiField("confirm_url")
	private String confirmUrl;

	/** 
	 * 预算追加支付H5页面url
	 */
	@ApiField("h5_confirm_url")
	private String h5ConfirmUrl;

	/** 
	 * 待支付订单信息（json格式，订单类型：accorder）
	 */
	@ApiField("order_info")
	private String orderInfo;

	/** 
	 * 追加后预算金额（单位：元）
	 */
	@ApiField("template_amount")
	private String templateAmount;

	/** 
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public void setConfirmUrl(String confirmUrl) {
		this.confirmUrl = confirmUrl;
	}
	public String getConfirmUrl( ) {
		return this.confirmUrl;
	}

	public void setH5ConfirmUrl(String h5ConfirmUrl) {
		this.h5ConfirmUrl = h5ConfirmUrl;
	}
	public String getH5ConfirmUrl( ) {
		return this.h5ConfirmUrl;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}
	public String getOrderInfo( ) {
		return this.orderInfo;
	}

	public void setTemplateAmount(String templateAmount) {
		this.templateAmount = templateAmount;
	}
	public String getTemplateAmount( ) {
		return this.templateAmount;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
