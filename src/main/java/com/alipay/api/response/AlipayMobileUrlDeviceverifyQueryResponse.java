package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.url.deviceverify.query response.
 * 
 * @author auto create
 * @since 1.0, 2014-08-06 12:45:06
 */
public class AlipayMobileUrlDeviceverifyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4597253894692738678L;

	/** 
	 * 返回本设备是否经过短信认证
	 */
	@ApiField("response")
	private Boolean response;

	public void setResponse(Boolean response) {
		this.response = response;
	}
	public Boolean getResponse( ) {
		return this.response;
	}

}
