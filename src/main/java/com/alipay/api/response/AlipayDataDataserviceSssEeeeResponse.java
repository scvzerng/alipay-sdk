package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.sss.eeee response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-29 23:42:06
 */
public class AlipayDataDataserviceSssEeeeResponse extends AlipayResponse {

	private static final long serialVersionUID = 6532413254121752713L;

	/** 
	 * 12
	 */
	@ApiField("dddd")
	private String dddd;

	public void setDddd(String dddd) {
		this.dddd = dddd;
	}
	public String getDddd( ) {
		return this.dddd;
	}

}
