package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.template.benefit.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-10 19:34:25
 */
public class AlipayMarketingTemplateBenefitCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5218896659884672115L;

	/** 
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}
	public String getBenefitId( ) {
		return this.benefitId;
	}

}
