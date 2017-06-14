package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:05:00
 */
public class AlipayMobileStdPublicQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8596827681692582751L;

	/** 
	 * 图片地址
	 */
	@ApiField("code_img")
	private String codeImg;

	/** 
	 * 码过期时间，单位：秒
	 */
	@ApiField("expire_second")
	private Long expireSecond;

	public void setCodeImg(String codeImg) {
		this.codeImg = codeImg;
	}
	public String getCodeImg( ) {
		return this.codeImg;
	}

	public void setExpireSecond(Long expireSecond) {
		this.expireSecond = expireSecond;
	}
	public Long getExpireSecond( ) {
		return this.expireSecond;
	}

}
