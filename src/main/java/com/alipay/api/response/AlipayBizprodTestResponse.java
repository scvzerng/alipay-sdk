package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.bizprod.test response.
 * 
 * @author auto create
 * @since 1.0, 2015-07-21 15:19:32
 */
public class AlipayBizprodTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 2772476715733891633L;

	/** 
	 * ok
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
