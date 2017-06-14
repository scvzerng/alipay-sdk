package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.creditrisk.trade.fund.good.all.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-01-15 21:40:34
 */
public class AlipayPcreditCreditriskTradeFundGoodAllQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4369684682154969532L;

	/** 
	 * sdfsdf
	 */
	@ApiField("sdfsd")
	private String sdfsd;

	public void setSdfsd(String sdfsd) {
		this.sdfsd = sdfsd;
	}
	public String getSdfsd( ) {
		return this.sdfsd;
	}

}
