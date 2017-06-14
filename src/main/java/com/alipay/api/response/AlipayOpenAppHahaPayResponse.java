package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.haha.pay response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-15 20:52:26
 */
public class AlipayOpenAppHahaPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6491898536842178189L;

	/** 
	 * 12
	 */
	@ApiField("asdasd")
	private String asdasd;

	public void setAsdasd(String asdasd) {
		this.asdasd = asdasd;
	}
	public String getAsdasd( ) {
		return this.asdasd;
	}

}
