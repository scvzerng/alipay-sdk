package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.oversea.atp.order.address.create response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:12
 */
public class AlipayOverseaAtpOrderAddressCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5792167129952617997L;

	/** 
	 * 是否成功
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
