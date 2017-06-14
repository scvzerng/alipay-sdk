package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.label.add response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:05:08
 */
public class AlipayMobileStdPublicLabelAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1422628493881148821L;

	/** 
	 * 标签编码
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 标签名称
	 */
	@ApiField("name")
	private String name;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

}
