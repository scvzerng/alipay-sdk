package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.alisis.authority.grant response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-10 14:00:15
 */
public class AlipayDataAlisisAuthorityGrantResponse extends AlipayResponse {

	private static final long serialVersionUID = 7786866458699345585L;

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
