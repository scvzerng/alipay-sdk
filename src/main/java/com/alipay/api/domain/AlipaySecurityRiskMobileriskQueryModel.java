package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机风险查询
 *
 * @author auto create
 * @since 1.0, 2016-06-27 20:48:12
 */
public class AlipaySecurityRiskMobileriskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6889253444393272178L;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

}
