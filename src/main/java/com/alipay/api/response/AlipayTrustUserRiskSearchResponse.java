package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliTrustRiskUser;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.risk.search response.
 * 
 * @author auto create
 * @since 1.0, 2014-03-05 15:42:34
 */
public class AlipayTrustUserRiskSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6151381312628449338L;

	/** 
	 * 风险名单查询结果
	 */
	@ApiField("ali_trust_risk_user")
	private AliTrustRiskUser aliTrustRiskUser;

	public void setAliTrustRiskUser(AliTrustRiskUser aliTrustRiskUser) {
		this.aliTrustRiskUser = aliTrustRiskUser;
	}
	public AliTrustRiskUser getAliTrustRiskUser( ) {
		return this.aliTrustRiskUser;
	}

}
