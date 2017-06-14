package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceTitleModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.title.get response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-27 17:11:51
 */
public class AlipayEbppInvoiceTitleGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 2453587634119113578L;

	/** 
	 * 抬头模型
	 */
	@ApiField("title")
	private InvoiceTitleModel title;

	public void setTitle(InvoiceTitleModel title) {
		this.title = title;
	}
	public InvoiceTitleModel getTitle( ) {
		return this.title;
	}

}
