package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.alisis.speedup.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-10 13:59:52
 */
public class AlipayDataAlisisSpeedupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6484197872673313656L;

	/** 
	 * 返回加速状态
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
