package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.recharge.order.update response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:48
 */
public class AlipayEbppRechargeOrderUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4543735889274744834L;

	/** 
	 * 详细的业务处理异常code
	 */
	@ApiField("code")
	private String code;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

}
