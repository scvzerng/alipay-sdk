package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AAATest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.keyantest.modeltest.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-15 15:52:24
 */
public class AlipayOpenAppKeyantestModeltestCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5263764918239457484L;

	/** 
	 * 12
	 */
	@ApiField("xwb")
	private AAATest xwb;

	/** 
	 * 1
	 */
	@ApiField("xwbt")
	private String xwbt;

	public void setXwb(AAATest xwb) {
		this.xwb = xwb;
	}
	public AAATest getXwb( ) {
		return this.xwb;
	}

	public void setXwbt(String xwbt) {
		this.xwbt = xwbt;
	}
	public String getXwbt( ) {
		return this.xwbt;
	}

}
