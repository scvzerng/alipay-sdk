package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * KeyanClass描述
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class KeyanClass extends AlipayObject {

	private static final long serialVersionUID = 3492874461399455494L;

	/**
	 * 字段
	 */
	@ApiField("keyan_column")
	private KeyanColumn keyanColumn;

	/**
	 * 用户名
	 */
	@ApiField("user_name")
	private String userName;

	public KeyanColumn getKeyanColumn() {
		return this.keyanColumn;
	}
	public void setKeyanColumn(KeyanColumn keyanColumn) {
		this.keyanColumn = keyanColumn;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
