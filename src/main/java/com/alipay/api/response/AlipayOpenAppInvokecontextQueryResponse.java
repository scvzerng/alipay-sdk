package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.invokecontext.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-13 16:01:48
 */
public class AlipayOpenAppInvokecontextQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6343447621682399513L;

	/** 
	 * openapi请求上下文的json表示
	 */
	@ApiField("invoke_context")
	private String invokeContext;

	public void setInvokeContext(String invokeContext) {
		this.invokeContext = invokeContext;
	}
	public String getInvokeContext( ) {
		return this.invokeContext;
	}

}
