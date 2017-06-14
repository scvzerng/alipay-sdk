package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额
 *
 * @author auto create
 * @since 1.0, 2017-04-06 20:58:05
 */
public class AlipayTradeFastpayAaaaAaaaaQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4145565118537962587L;

	/**
	 * 码值相关的信息
	 */
	@ApiField("decode_data")
	private String decodeData;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_data")
	private ExtData extData;

	/**
	 * 扫码类型
	 */
	@ApiField("pay_type")
	private String payType;

	/**
	 * 描述接入码平台APP的信息
	 */
	@ApiField("product_context")
	private ProductContext productContext;

	public String getDecodeData() {
		return this.decodeData;
	}
	public void setDecodeData(String decodeData) {
		this.decodeData = decodeData;
	}

	public ExtData getExtData() {
		return this.extData;
	}
	public void setExtData(ExtData extData) {
		this.extData = extData;
	}

	public String getPayType() {
		return this.payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}

	public ProductContext getProductContext() {
		return this.productContext;
	}
	public void setProductContext(ProductContext productContext) {
		this.productContext = productContext;
	}

}
