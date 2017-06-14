package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试接口
 *
 * @author auto create
 * @since 1.0, 2016-12-07 12:08:54
 */
public class AlipaySecurityProdKeyanTestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5647943829334161685L;

	/**
	 * 11
	 */
	@ApiField("user_name")
	private String userName;

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
