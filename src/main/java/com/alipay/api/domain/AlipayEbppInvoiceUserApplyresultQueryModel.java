package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据申请id查询发票申请结果
 *
 * @author auto create
 * @since 1.0, 2017-04-06 10:50:14
 */
public class AlipayEbppInvoiceUserApplyresultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7681435447314167954L;

	/**
	 * 发票申请唯一id
	 */
	@ApiField("invoice_apply_id")
	private String invoiceApplyId;

	public String getInvoiceApplyId() {
		return this.invoiceApplyId;
	}
	public void setInvoiceApplyId(String invoiceApplyId) {
		this.invoiceApplyId = invoiceApplyId;
	}

}
