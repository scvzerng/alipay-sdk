package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataexchange.dddd response.
 * 
 * @author auto create
 * @since 1.0, 2016-02-25 13:14:36
 */
public class AlipayDataDataexchangeDdddResponse extends AlipayResponse {

	private static final long serialVersionUID = 5264323516367994547L;

	/** 
	 * dsfsdg
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
