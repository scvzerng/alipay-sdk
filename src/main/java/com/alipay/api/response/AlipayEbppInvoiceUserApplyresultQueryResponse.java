package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceModelContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.user.applyresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-06 14:35:08
 */
public class AlipayEbppInvoiceUserApplyresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4647549836117331787L;

	/** 
	 * 已开具发票内容
	 */
	@ApiField("invoice_info")
	private InvoiceModelContent invoiceInfo;

	public void setInvoiceInfo(InvoiceModelContent invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}
	public InvoiceModelContent getInvoiceInfo( ) {
		return this.invoiceInfo;
	}

}
