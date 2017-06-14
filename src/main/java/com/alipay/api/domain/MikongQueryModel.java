package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * MikongQueryModel
 *
 * @author auto create
 * @since 1.0, 2017-03-14 14:51:45
 */
public class MikongQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4638812521994163526L;

	/**
	 * name
	 */
	@ApiField("name")
	private String name;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
