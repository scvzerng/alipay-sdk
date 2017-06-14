package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.fastpay.aaaa.aaaaa.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-06 21:00:01
 */
public class AlipayTradeFastpayAaaaAaaaaQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3467194414391815766L;

	/** 
	 * 业务前置页面，直接跳转去该页面
	 */
	@ApiField("url")
	private String url;

	public void setUrl(String url) {
		this.url = url;
	}
	public String getUrl( ) {
		return this.url;
	}

}
