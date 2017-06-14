package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 朝瑰测试
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class AlipayOpenAuthZhaoguiTestQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5627153426988241456L;

	/**
	 * zhaoguitest
	 */
	@ApiField("input")
	private String input;

	public String getInput() {
		return this.input;
	}
	public void setInput(String input) {
		this.input = input;
	}

}
