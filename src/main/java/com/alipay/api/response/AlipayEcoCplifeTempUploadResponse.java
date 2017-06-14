package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.temp.upload response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 15:36:12
 */
public class AlipayEcoCplifeTempUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 3125234213762195639L;

	/** 
	 * 111
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
