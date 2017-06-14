package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.product.access.apply response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-21 19:21:47
 */
public class AlipayInsSceneProductAccessApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4413443347261357516L;

	/** 
	 * true 表示可以准入， false表示不可以准入
	 */
	@ApiField("is_access")
	private Boolean isAccess;

	/** 
	 * 产品信息(保险标准查询信息)
	 */
	@ApiField("product")
	private InsProduct product;

	/** 
	 * 不准入原因
	 */
	@ApiField("reason")
	private String reason;

	public void setIsAccess(Boolean isAccess) {
		this.isAccess = isAccess;
	}
	public Boolean getIsAccess( ) {
		return this.isAccess;
	}

	public void setProduct(InsProduct product) {
		this.product = product;
	}
	public InsProduct getProduct( ) {
		return this.product;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
