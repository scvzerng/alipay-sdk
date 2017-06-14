package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.fangzhong.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-06 16:24:30
 */
public class AlipayOpenAppFangzhongUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 5445757567276517233L;

	/** 
	 * 111222
	 */
	@ApiField("out_a")
	private String outA;

	public void setOutA(String outA) {
		this.outA = outA;
	}
	public String getOutA( ) {
		return this.outA;
	}

}
