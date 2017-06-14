package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蘑菇租房测试接口
 *
 * @author auto create
 * @since 1.0, 2016-12-22 21:53:37
 */
public class AlipayEcoCplifeCityApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1476745457117968716L;

	/**
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/**
	 * uid
	 */
	@ApiField("uid")
	private String uid;

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return this.uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}

}
