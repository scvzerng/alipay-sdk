package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内部测试接口
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class KoubeiQualityTestKeyanInnerModifyModel extends AlipayObject {

	private static final long serialVersionUID = 5859637349448714293L;

	/**
	 * 1
	 */
	@ApiField("user_name_one")
	private String userNameOne;

	public String getUserNameOne() {
		return this.userNameOne;
	}
	public void setUserNameOne(String userNameOne) {
		this.userNameOne = userNameOne;
	}

}
