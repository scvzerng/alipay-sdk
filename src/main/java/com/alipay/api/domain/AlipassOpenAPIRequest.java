package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * Alipass请求入参模型
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class AlipassOpenAPIRequest extends AlipayObject {

	private static final long serialVersionUID = 5448772693399761939L;

	/**
	 * 开放平台为商户分配的ID
	 */
	@ApiField("app_id")
	private String appId;

	/**
	 * alipass文件Base64编码后的内容。
	 */
	@ApiField("file_content")
	private String fileContent;

	/**
	 * 商户外部交易号，由商户生成并确保其唯一性
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAppId() {
		return this.appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getFileContent() {
		return this.fileContent;
	}
	public void setFileContent(String fileContent) {
		this.fileContent = fileContent;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
