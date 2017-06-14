package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接入码平台APP的信息
 *
 * @author auto create
 * @since 1.0, 2017-04-06 20:20:08
 */
public class ProductContext extends AlipayObject {

	private static final long serialVersionUID = 2613616913527928755L;

	/**
	 * 接入码平台商户移动应用的用户标识符
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 接入码平台商户移动应用英文名称
	 */
	@ApiField("product")
	private String product;

	/**
	 * 接入码平台商户移动应用版本
	 */
	@ApiField("product_version")
	private String productVersion;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductVersion() {
		return this.productVersion;
	}
	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

}
