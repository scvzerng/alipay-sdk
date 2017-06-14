package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.template.message.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-08 11:52:06
 */
public class AlipayOpenPublicTemplateMessageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5764474162982536185L;

	/** 
	 * 结果值
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
