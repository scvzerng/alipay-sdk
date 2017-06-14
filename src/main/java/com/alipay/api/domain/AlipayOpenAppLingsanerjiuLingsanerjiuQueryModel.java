package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * lingsanerjiu
 *
 * @author auto create
 * @since 1.0, 2017-03-29 22:11:11
 */
public class AlipayOpenAppLingsanerjiuLingsanerjiuQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1879694326959142562L;

	/**
	 * 1
	 */
	@ApiField("lingsanerjiu")
	private Lingsanerjiu lingsanerjiu;

	/**
	 * 1
	 */
	@ApiField("lingsanerjiuyi")
	private String lingsanerjiuyi;

	public Lingsanerjiu getLingsanerjiu() {
		return this.lingsanerjiu;
	}
	public void setLingsanerjiu(Lingsanerjiu lingsanerjiu) {
		this.lingsanerjiu = lingsanerjiu;
	}

	public String getLingsanerjiuyi() {
		return this.lingsanerjiuyi;
	}
	public void setLingsanerjiuyi(String lingsanerjiuyi) {
		this.lingsanerjiuyi = lingsanerjiuyi;
	}

}
