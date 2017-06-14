package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.message.total.send response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:04:36
 */
public class AlipayMobileStdPublicMessageTotalSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4897596429864646156L;

	/** 
	 * 消息ID
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
