package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliCreditScoreResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ucrcenter.creditinfo.search response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:15:44
 */
public class AlipayUcrcenterCreditinfoSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 6676341128991547492L;

	/** 
	 * 信用分结果
	 */
	@ApiField("ali_credit_score_result")
	private AliCreditScoreResult aliCreditScoreResult;

	public void setAliCreditScoreResult(AliCreditScoreResult aliCreditScoreResult) {
		this.aliCreditScoreResult = aliCreditScoreResult;
	}
	public AliCreditScoreResult getAliCreditScoreResult( ) {
		return this.aliCreditScoreResult;
	}

}
