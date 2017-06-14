package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * lingsilingqiyi
 *
 * @author auto create
 * @since 1.0, 2017-04-08 13:17:31
 */
public class AlipayOpenServicemarketLingsilingqiyiLingsilingqiyiBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3654682237887676173L;

	/**
	 * 12
	 */
	@ApiField("test")
	private String test;

	public String getTest() {
		return this.test;
	}
	public void setTest(String test) {
		this.test = test;
	}

}
