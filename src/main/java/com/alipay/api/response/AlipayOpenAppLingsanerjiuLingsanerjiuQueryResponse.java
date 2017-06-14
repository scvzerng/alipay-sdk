package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.Lingsanerjiu;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.lingsanerjiu.lingsanerjiu.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-29 22:11:12
 */
public class AlipayOpenAppLingsanerjiuLingsanerjiuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1626527375529117657L;

	/** 
	 * 1
	 */
	@ApiField("liusanerjiu")
	private Lingsanerjiu liusanerjiu;

	public void setLiusanerjiu(Lingsanerjiu liusanerjiu) {
		this.liusanerjiu = liusanerjiu;
	}
	public Lingsanerjiu getLiusanerjiu( ) {
		return this.liusanerjiu;
	}

}
