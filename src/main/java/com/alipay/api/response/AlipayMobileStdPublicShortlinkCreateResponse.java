package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.shortlink.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:05:04
 */
public class AlipayMobileStdPublicShortlinkCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1333839698346727921L;

	/** 
	 * 短链接url
	 */
	@ApiField("shortlink")
	private String shortlink;

	public void setShortlink(String shortlink) {
		this.shortlink = shortlink;
	}
	public String getShortlink( ) {
		return this.shortlink;
	}

}
