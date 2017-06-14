package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.platform.developer.active response.
 * 
 * @author auto create
 * @since 1.0, 2014-05-22 17:28:59
 */
public class AlipayPlatformDeveloperActiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8481747627653891451L;

	/** 
	 * 操作成功
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 操作成功
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
