package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.matchuser.label.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-03 17:14:14
 */
public class AlipayOpenPublicMatchuserLabelCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5587859592988443775L;

	/** 
	 * 匹配到的支付宝用户id，2088开头16位长度的字符串
	 */
	@ApiField("match_user_id")
	private String matchUserId;

	public void setMatchUserId(String matchUserId) {
		this.matchUserId = matchUserId;
	}
	public String getMatchUserId( ) {
		return this.matchUserId;
	}

}
