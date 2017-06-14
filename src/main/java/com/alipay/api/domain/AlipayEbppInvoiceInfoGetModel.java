package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票查询接口
 *
 * @author auto create
 * @since 1.0, 2017-01-20 16:56:05
 */
public class AlipayEbppInvoiceInfoGetModel extends AlipayObject {

	private static final long serialVersionUID = 7193531639627243464L;

	/**
	 * 发票代码，是税务机关给予发票的编码，一般为10位或者12位
	 */
	@ApiField("invoice_code")
	private String invoiceCode;

	/**
	 * 发票号码，是税务机关给予发票的号码，一般为8位
	 */
	@ApiField("invoice_no")
	private String invoiceNo;

	/**
	 * 用户id，当用户发起发票查询时，可以先通过用户授权获取当前访问用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getInvoiceCode() {
		return this.invoiceCode;
	}
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}

	public String getInvoiceNo() {
		return this.invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
