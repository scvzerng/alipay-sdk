package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.authenticate response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-17 17:07:20
 */
public class AlipaySecurityRiskAuthenticateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8698413974454782196L;

	/** 
	 * 核验结果;
IV0010:核验服务不可用;
IV0011:核验通过;
IV0012:核验不通过
	 */
	@ApiField("verification_results")
	private String verificationResults;

	public void setVerificationResults(String verificationResults) {
		this.verificationResults = verificationResults;
	}
	public String getVerificationResults( ) {
		return this.verificationResults;
	}

}
