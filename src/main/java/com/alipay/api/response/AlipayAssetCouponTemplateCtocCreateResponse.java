package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.coupon.template.ctoc.create response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-12 15:26:38
 */
public class AlipayAssetCouponTemplateCtocCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4148272968237816993L;

	/** 
	 * 红包模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
