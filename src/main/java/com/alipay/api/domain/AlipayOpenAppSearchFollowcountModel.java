package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商户关注关系
 *
 * @author auto create
 * @since 1.0, 2016-12-19 20:51:17
 */
public class AlipayOpenAppSearchFollowcountModel extends AlipayObject {

	private static final long serialVersionUID = 7226742297174443614L;

	/**
	 * 请求
	 */
	@ApiField("requet")
	private String requet;

	public String getRequet() {
		return this.requet;
	}
	public void setRequet(String requet) {
		this.requet = requet;
	}

}
