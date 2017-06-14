package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.code.route.send response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-10 14:34:51
 */
public class AlipayMarketingCodeRouteSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 8117763225467647676L;

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
