package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝扫码web_openapi
 *
 * @author auto create
 * @since 1.0, 2017-04-10 14:34:47
 */
public class AlipayMarketingCodeRouteSendModel extends AlipayObject {

	private static final long serialVersionUID = 8237967953555593274L;

	/**
	 * 输入的是和码值相关的信息。其中"code"是必填值
	 */
	@ApiField("decode_data")
	private String decodeData;

	/**
	 * JSON格式的扩展信息。其中outUserId为接入平台的userID. lbsInfo为lbs信息，格式为:{"accuracy":"25.0", "altitude":"0.0", "latitude":"32.811824", "longitude":"118.684671", "time":1490009982876} 含义是:{精度，海拔,维度，经度，时间 ms},另外还可以传递其他额外的信息。
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 表示扫码的类型，是二维码，条码，还是其他
	 */
	@ApiField("pai_type")
	private String paiType;

	/**
	 * JSON串,描述接入码平台APP的信息。其中product,productVersion必填。product需要接入的时候和支付宝码平台约定。
	 */
	@ApiField("product_context")
	private String productContext;

	public String getDecodeData() {
		return this.decodeData;
	}
	public void setDecodeData(String decodeData) {
		this.decodeData = decodeData;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getPaiType() {
		return this.paiType;
	}
	public void setPaiType(String paiType) {
		this.paiType = paiType;
	}

	public String getProductContext() {
		return this.productContext;
	}
	public void setProductContext(String productContext) {
		this.productContext = productContext;
	}

}
