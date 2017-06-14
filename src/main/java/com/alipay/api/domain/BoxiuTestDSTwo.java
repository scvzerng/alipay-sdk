package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 2
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
public class BoxiuTestDSTwo extends AlipayObject {

	private static final long serialVersionUID = 3682862257548992433L;

	/**
	 * aaa
	 */
	@ApiField("ds")
	private BoxiuTestDS ds;

	/**
	 * miaoshu
	 */
	@ApiField("plain_two")
	private String plainTwo;

	public BoxiuTestDS getDs() {
		return this.ds;
	}
	public void setDs(BoxiuTestDS ds) {
		this.ds = ds;
	}

	public String getPlainTwo() {
		return this.plainTwo;
	}
	public void setPlainTwo(String plainTwo) {
		this.plainTwo = plainTwo;
	}

}
