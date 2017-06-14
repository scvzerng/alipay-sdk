package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.securities.info.update response.
 * 
 * @author auto create
 * @since 1.0, 2015-03-06 15:29:09
 */
public class AlipayMobileSecuritiesInfoUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3474261225374129886L;

	/** 
	 * true
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
