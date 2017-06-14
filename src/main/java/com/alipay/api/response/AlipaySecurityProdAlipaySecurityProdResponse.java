package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AAATest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.alipay.security.prod response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-28 22:06:29
 */
public class AlipaySecurityProdAlipaySecurityProdResponse extends AlipayResponse {

	private static final long serialVersionUID = 3318371427957311742L;

	/** 
	 * 测试
	 */
	@ApiField("test")
	private AAATest test;

	public void setTest(AAATest test) {
		this.test = test;
	}
	public AAATest getTest( ) {
		return this.test;
	}

}
