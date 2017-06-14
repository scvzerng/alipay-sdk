package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.ruzhitest.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-04-05 19:42:21
 */
public class AlipayOpenServicemarketRuzhitestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3338734588519843426L;

	/** 
	 * app是否健康
	 */
	@ApiField("health")
	private Boolean health;

	public void setHealth(Boolean health) {
		this.health = health;
	}
	public Boolean getHealth( ) {
		return this.health;
	}

}
