package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.platform response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:14
 */
public class AlipayMobilePublicPlatformResponse extends AlipayResponse {

	private static final long serialVersionUID = 3412248498984142393L;

	/** 
	 * 响应内容
	 */
	@ApiListField("res_content")
	@ApiField("string")
	private List<String> resContent;

	public void setResContent(List<String> resContent) {
		this.resContent = resContent;
	}
	public List<String> getResContent( ) {
		return this.resContent;
	}

}
