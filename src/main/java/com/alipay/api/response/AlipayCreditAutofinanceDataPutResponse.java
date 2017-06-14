package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.credit.autofinance.data.put response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-14 10:06:33
 */
public class AlipayCreditAutofinanceDataPutResponse extends AlipayResponse {

	private static final long serialVersionUID = 2471968583424611825L;

	/** 
	 * 返回操作结果
	 */
	@ApiField("autofinancedata")
	private String autofinancedata;

	public void setAutofinancedata(String autofinancedata) {
		this.autofinancedata = autofinancedata;
	}
	public String getAutofinancedata( ) {
		return this.autofinancedata;
	}

}
