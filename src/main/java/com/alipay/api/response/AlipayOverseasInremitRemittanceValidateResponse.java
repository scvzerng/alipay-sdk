package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.inremit.remittance.validate response.
 * 
 * @author auto create
 * @since 1.0, 2016-02-19 10:04:03
 */
public class AlipayOverseasInremitRemittanceValidateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1622659526871126766L;

	/** 
	 * 验证是否成功
	 */
	@ApiField("is_success")
	private String isSuccess;

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
	}

}
