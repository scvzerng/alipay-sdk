package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 离线认证密主密钥钥查询
 *
 * @author auto create
 * @since 1.0, 2016-07-11 15:05:20
 */
public class AlipayCommerceTransportOfflinepayAuthKeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7599169949759566849L;

	/**
	 * 认证场景
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
