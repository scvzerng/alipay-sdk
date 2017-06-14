package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.alisis.authority.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-10 14:00:04
 */
public class AlipayDataAlisisAuthorityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5142291562778157263L;

	/** 
	 * 测试结果
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
