package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xwbtest
 *
 * @author auto create
 * @since 1.0, 2017-04-07 14:45:24
 */
public class AlipaySecurityProdXwbtestPurchaseModel extends AlipayObject {

	private static final long serialVersionUID = 3859872969765456546L;

	/**
	 * 1
	 */
	@ApiField("dsfsd")
	private String dsfsd;

	/**
	 * 1
	 */
	@ApiField("sdfx")
	private String sdfx;

	public String getDsfsd() {
		return this.dsfsd;
	}
	public void setDsfsd(String dsfsd) {
		this.dsfsd = dsfsd;
	}

	public String getSdfx() {
		return this.sdfx;
	}
	public void setSdfx(String sdfx) {
		this.sdfx = sdfx;
	}

}
