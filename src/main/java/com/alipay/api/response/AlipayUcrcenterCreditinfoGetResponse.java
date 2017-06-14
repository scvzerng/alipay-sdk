package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AliCreditInfoResultForAliGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ucrcenter.creditinfo.get response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:15:45
 */
public class AlipayUcrcenterCreditinfoGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6186489279473296723L;

	/** 
	 * 阿里集团内部查询的信用信息
	 */
	@ApiField("ali_credit_info_result")
	private AliCreditInfoResultForAliGroup aliCreditInfoResult;

	public void setAliCreditInfoResult(AliCreditInfoResultForAliGroup aliCreditInfoResult) {
		this.aliCreditInfoResult = aliCreditInfoResult;
	}
	public AliCreditInfoResultForAliGroup getAliCreditInfoResult( ) {
		return this.aliCreditInfoResult;
	}

}
