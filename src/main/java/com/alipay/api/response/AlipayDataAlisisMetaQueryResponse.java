package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.alisis.meta.query response.
 * 
 * @author auto create
 * @since 1.0, 2015-09-10 13:59:41
 */
public class AlipayDataAlisisMetaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8226936539615984856L;

	/** 
	 * 报表meta信息
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
