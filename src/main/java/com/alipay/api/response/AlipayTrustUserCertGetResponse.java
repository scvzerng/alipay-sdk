package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustCert;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.cert.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-02-06 13:11:34
 */
public class AlipayTrustUserCertGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3886829976764645335L;

	/** 
	 * 芝麻信用认证结果
	 */
	@ApiField("ali_trust_cert")
	private AliTrustCert aliTrustCert;

	public void setAliTrustCert(AliTrustCert aliTrustCert) {
		this.aliTrustCert = aliTrustCert;
	}
	public AliTrustCert getAliTrustCert( ) {
		return this.aliTrustCert;
	}

}
