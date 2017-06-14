package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.follow.check response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 20:30:28
 */
public class AlipayMobileStdPublicFollowCheckResponse extends AlipayResponse {

	private static final long serialVersionUID = 3786451818359813711L;

	/** 
	 * boolean类型返回值，flase表示未关注，true表示已关注
	 */
	@ApiField("follow")
	private Boolean follow;

	public void setFollow(Boolean follow) {
		this.follow = follow;
	}
	public Boolean getFollow( ) {
		return this.follow;
	}

}
