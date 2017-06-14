package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InvoiceModelContent;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.info.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-20 16:56:05
 */
public class AlipayEbppInvoiceInfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5113137912849916935L;

	/** 
	 * 发票详情
	 */
	@ApiField("invoice_model")
	private InvoiceModelContent invoiceModel;

	public void setInvoiceModel(InvoiceModelContent invoiceModel) {
		this.invoiceModel = invoiceModel;
	}
	public InvoiceModelContent getInvoiceModel( ) {
		return this.invoiceModel;
	}

}
