package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.groupmember.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 10:27:18
 */
public class AlipaySocialBaseGroupmemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3672939327133975651L;

	/** 
	 * 某用户是否在支付宝群中
	 */
	@ApiField("if_ingroup")
	private Boolean ifIngroup;

	public void setIfIngroup(Boolean ifIngroup) {
		this.ifIngroup = ifIngroup;
	}
	public Boolean getIfIngroup( ) {
		return this.ifIngroup;
	}

}
