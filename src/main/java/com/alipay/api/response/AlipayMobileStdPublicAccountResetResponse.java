package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.account.reset response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:04:15
 */
public class AlipayMobileStdPublicAccountResetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7733331983962264168L;

	/** 
	 * 这是新账户绑定成功后产生的协议号
	 */
	@ApiField("agreement_id")
	private String agreementId;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

}
