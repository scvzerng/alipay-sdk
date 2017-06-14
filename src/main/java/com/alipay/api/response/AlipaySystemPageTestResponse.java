package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.system.page.test response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-05 16:54:32
 */
public class AlipaySystemPageTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 1663176598887394163L;

	/** 
	 * tes
	 */
	@ApiField("test")
	private String test;

	public void setTest(String test) {
		this.test = test;
	}
	public String getTest( ) {
		return this.test;
	}

}
