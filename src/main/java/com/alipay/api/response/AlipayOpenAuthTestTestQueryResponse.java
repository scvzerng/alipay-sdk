package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MikongQueryModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.test.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 17:12:34
 */
public class AlipayOpenAuthTestTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1157653236495396243L;

	/** 
	 * test
	 */
	@ApiField("test")
	private MikongQueryModel test;

	public void setTest(MikongQueryModel test) {
		this.test = test;
	}
	public MikongQueryModel getTest( ) {
		return this.test;
	}

}
