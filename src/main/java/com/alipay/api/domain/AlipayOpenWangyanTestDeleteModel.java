package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试接口
 *
 * @author auto create
 * @since 1.0, 2017-04-06 21:29:45
 */
public class AlipayOpenWangyanTestDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 8396485886425312929L;

	/**
	 * 2
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
