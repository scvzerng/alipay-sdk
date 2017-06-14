package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.bingzhe.test response.
 * 
 * @author auto create
 * @since 1.0, 2016-10-12 11:53:28
 */
public class AlipayOpenAppBingzheTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 6516928518274985674L;

	/** 
	 * test
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
