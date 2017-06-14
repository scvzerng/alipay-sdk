package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.auth.info.authorize response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-02 11:48:56
 */
public class ZhimaAuthInfoAuthorizeResponse extends AlipayResponse {

	private static final long serialVersionUID = 7711628898475174789L;

	/** 
	 * 授权结果标识
	 */
	@ApiField("success")
	private String success;

	public void setSuccess(String success) {
		this.success = success;
	}
	public String getSuccess( ) {
		return this.success;
	}

}
