package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.login.rsakey.get response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-17 10:57:04
 */
public class AlipayMobileLoginRsakeyGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 1238658655331257694L;

	/** 
	 * rsa公钥
	 */
	@ApiField("rsapk")
	private String rsapk;

	/** 
	 * 时间戳
	 */
	@ApiField("rsats")
	private String rsats;

	public void setRsapk(String rsapk) {
		this.rsapk = rsapk;
	}
	public String getRsapk( ) {
		return this.rsapk;
	}

	public void setRsats(String rsats) {
		this.rsats = rsats;
	}
	public String getRsats( ) {
		return this.rsats;
	}

}
