package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.insurance.account.insure response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:29
 */
public class AlipayInsuranceAccountInsureResponse extends AlipayResponse {

	private static final long serialVersionUID = 3723654665432145738L;

	/** 
	 * 用户是否已投保
	 */
	@ApiField("insured")
	private Boolean insured;

	/** 
	 * 请求提示文本
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setInsured(Boolean insured) {
		this.insured = insured;
	}
	public Boolean getInsured( ) {
		return this.insured;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
