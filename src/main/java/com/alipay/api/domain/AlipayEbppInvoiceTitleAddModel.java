package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子发票抬头添加
 *
 * @author auto create
 * @since 1.0, 2016-11-16 11:18:39
 */
public class AlipayEbppInvoiceTitleAddModel extends AlipayObject {

	private static final long serialVersionUID = 1194472432326514754L;

	/**
	 * 用户添加电子发票抬头模型
	 */
	@ApiField("title_info")
	private InvoiceTitleModel titleInfo;

	public InvoiceTitleModel getTitleInfo() {
		return this.titleInfo;
	}
	public void setTitleInfo(InvoiceTitleModel titleInfo) {
		this.titleInfo = titleInfo;
	}

}
