package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.template.benefit.delete response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 20:57:45
 */
public class AlipayMarketingTemplateBenefitDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 7849358873446955854L;

	/** 
	 * 权益删除结果；true成功，false失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
