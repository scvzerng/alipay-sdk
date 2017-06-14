package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.alisis.olap.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-10 13:59:27
 */
public class AlipayDataAlisisOlapQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2218316146844863172L;

	/** 
	 * 查询结果返回值
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
