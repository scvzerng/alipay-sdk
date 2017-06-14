package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.alipay.security.prod.test response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-02 15:18:32
 */
public class AlipaySecurityProdAlipaySecurityProdTestResponse extends AlipayResponse {

	private static final long serialVersionUID = 4456659918311834823L;

	/** 
	 * ddd
	 */
	@ApiField("admin")
	private String admin;

	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getAdmin( ) {
		return this.admin;
	}

}
