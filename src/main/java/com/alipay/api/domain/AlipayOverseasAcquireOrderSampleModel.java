package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 境外收单开放平台第一个测试接口
 *
 * @author auto create
 * @since 1.0, 2016-08-12 17:30:59
 */
public class AlipayOverseasAcquireOrderSampleModel extends AlipayObject {

	private static final long serialVersionUID = 5638448159462175463L;

	/**
	 * 查询账号
	 */
	@ApiField("user_id")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
