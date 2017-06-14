package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 可延长测试接口
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class AlipayDataDataserviceKeyantestCancelModel extends AlipayObject {

	private static final long serialVersionUID = 4379119721519748313L;

	/**
	 * 用户名
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
