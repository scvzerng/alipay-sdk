package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MpointAccountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.mpointprod.dispatch.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-05-23 21:07:27
 */
public class AlipayUserMpointprodDispatchOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5434551417879418783L;

	/** 
	 * 会员积分交易账户详情对象
	 */
	@ApiField("account_info")
	private MpointAccountInfo accountInfo;

	public void setAccountInfo(MpointAccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}
	public MpointAccountInfo getAccountInfo( ) {
		return this.accountInfo;
	}

}
