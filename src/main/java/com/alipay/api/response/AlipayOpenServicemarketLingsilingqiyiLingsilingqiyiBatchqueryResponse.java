package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.lingsilingqiyi.lingsilingqiyi.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-08 13:17:31
 */
public class AlipayOpenServicemarketLingsilingqiyiLingsilingqiyiBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3814311157147813773L;

	/** 
	 * 12
	 */
	@ApiField("test01")
	private String test01;

	public void setTest01(String test01) {
		this.test01 = test01;
	}
	public String getTest01( ) {
		return this.test01;
	}

}
