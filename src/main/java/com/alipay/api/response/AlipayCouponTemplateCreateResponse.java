package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.coupon.template.create response.
 * 
 * @author auto create
 * @since 1.0, 2015-04-23 17:54:31
 */
public class AlipayCouponTemplateCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8885512882768337498L;

	/** 
	 * 保证金总额（注意：单位为分）
	 */
	@ApiField("guarantee_amount")
	private String guaranteeAmount;

	/** 
	 * 红包模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public void setGuaranteeAmount(String guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
	}
	public String getGuaranteeAmount( ) {
		return this.guaranteeAmount;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getTemplateId( ) {
		return this.templateId;
	}

}
