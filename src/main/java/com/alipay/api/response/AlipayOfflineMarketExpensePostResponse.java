package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.expense.post response.
 * 
 * @author auto create
 * @since 1.0, 2015-11-24 16:04:51
 */
public class AlipayOfflineMarketExpensePostResponse extends AlipayResponse {

	private static final long serialVersionUID = 6166814168417879724L;

	/** 
	 * 操作返回结果，JSON格式
	 */
	@ApiField("response")
	private String response;

	public void setResponse(String response) {
		this.response = response;
	}
	public String getResponse( ) {
		return this.response;
	}

}
