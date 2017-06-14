package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AAATest;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.auth.zhaogui.test.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-06 15:58:51
 */
public class AlipayOpenAuthZhaoguiTestQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8236962779528291493L;

	/** 
	 * zhaoguitest
	 */
	@ApiField("output")
	private AAATest output;

	public void setOutput(AAATest output) {
		this.output = output;
	}
	public AAATest getOutput( ) {
		return this.output;
	}

}
