package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.servicemarket.lingsilingliu.lingsilingliu.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-08 12:53:54
 */
public class AlipayOpenServicemarketLingsilingliuLingsilingliuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6528734531381679543L;

	/** 
	 * 12
	 */
	@ApiListField("lingsilingliu")
	@ApiField("string")
	private List<String> lingsilingliu;

	public void setLingsilingliu(List<String> lingsilingliu) {
		this.lingsilingliu = lingsilingliu;
	}
	public List<String> getLingsilingliu( ) {
		return this.lingsilingliu;
	}

}
