package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.xwbtest.purchase response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 14:45:27
 */
public class AlipaySecurityProdXwbtestPurchaseResponse extends AlipayResponse {

	private static final long serialVersionUID = 2364154483217352133L;

	/** 
	 * 1
	 */
	@ApiField("sdf")
	private String sdf;

	public void setSdf(String sdf) {
		this.sdf = sdf;
	}
	public String getSdf( ) {
		return this.sdf;
	}

}
