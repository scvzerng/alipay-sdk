package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.keyan.test.fifth response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-08 11:09:53
 */
public class AlipayOpenAppKeyanTestFifthResponse extends AlipayResponse {

	private static final long serialVersionUID = 7151573554473562593L;

	/** 
	 * test
	 */
	@ApiField("ddddd")
	private String ddddd;

	public void setDdddd(String ddddd) {
		this.ddddd = ddddd;
	}
	public String getDdddd( ) {
		return this.ddddd;
	}

}
