package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ssss
 *
 * @author auto create
 * @since 1.0, 2017-02-16 20:43:34
 */
public class AlipaySecurityProdSssBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2717544751167789592L;

	/**
	 * 111
	 */
	@ApiField("sss")
	private String sss;

	public String getSss() {
		return this.sss;
	}
	public void setSss(String sss) {
		this.sss = sss;
	}

}
