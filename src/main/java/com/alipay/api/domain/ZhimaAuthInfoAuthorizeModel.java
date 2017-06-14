package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻认证授权接口
 *
 * @author auto create
 * @since 1.0, 2016-08-01 17:33:19
 */
public class ZhimaAuthInfoAuthorizeModel extends AlipayObject {

	private static final long serialVersionUID = 8759646438678984183L;

	/**
	 * 其他业务参数,主要包含channelType,callbackUrl
	 */
	@ApiField("biz_params")
	private String bizParams;

	/**
	 * 身份标识数据
	 */
	@ApiField("identity_param")
	private String identityParam;

	/**
	 * 身份标识类型（后续可以扩展）5:支付宝UID
	 */
	@ApiField("identity_type")
	private String identityType;

	public String getBizParams() {
		return this.bizParams;
	}
	public void setBizParams(String bizParams) {
		this.bizParams = bizParams;
	}

	public String getIdentityParam() {
		return this.identityParam;
	}
	public void setIdentityParam(String identityParam) {
		this.identityParam = identityParam;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

}
