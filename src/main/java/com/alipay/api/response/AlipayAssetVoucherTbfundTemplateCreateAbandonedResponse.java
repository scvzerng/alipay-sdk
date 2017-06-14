package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.voucher.tbfund.template.create.abandoned response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-30 17:18:21
 */
public class AlipayAssetVoucherTbfundTemplateCreateAbandonedResponse extends AlipayResponse {

	private static final long serialVersionUID = 2594936836888214872L;

	/** 
	 * 模板支付url
	 */
	@ApiField("confirm_url")
	private String confirmUrl;

	/** 
	 * H5模板支付页面
	 */
	@ApiField("h5_confirm_url")
	private String h5ConfirmUrl;

	/** 
	 * 待支付订单信息（json格式，订单类型：accorder）
	 */
	@ApiField("order_info")
	private String orderInfo;

	/** 
	 * 模板ID
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

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
