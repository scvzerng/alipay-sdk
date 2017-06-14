package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipassOpenAPIRequest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: test.chuwei.lzy.test response.
 * 
 * @author auto create
 * @since 1.0, 2015-03-19 15:21:05
 */
public class TestChuweiLzyTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 5232572577811246258L;

	/** 
	 * dfdf
	 */
	@ApiField("dfdf")
	private AlipassOpenAPIRequest dfdf;

	public void setDfdf(AlipassOpenAPIRequest dfdf) {
		this.dfdf = dfdf;
	}
	public AlipassOpenAPIRequest getDfdf( ) {
		return this.dfdf;
	}

}
