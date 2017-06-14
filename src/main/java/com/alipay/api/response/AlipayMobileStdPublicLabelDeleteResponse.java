package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.label.delete response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:04:51
 */
public class AlipayMobileStdPublicLabelDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1175265679489355182L;

	/** 
	 * 标签编号
	 */
	@ApiField("id")
	private Long id;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

}
