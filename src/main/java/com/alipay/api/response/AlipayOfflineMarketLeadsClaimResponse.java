package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.leads.claim response.
 * 
 * @author auto create
 * @since 1.0, 2017-02-07 16:46:42
 */
public class AlipayOfflineMarketLeadsClaimResponse extends AlipayResponse {

	private static final long serialVersionUID = 1554727961765835449L;

	/** 
	 * 支付宝流水号
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * leadsId
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 外部流水号
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * leads状态
	 */
	@ApiField("status")
	private String status;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setLeadsId(String leadsId) {
		this.leadsId = leadsId;
	}
	public String getLeadsId( ) {
		return this.leadsId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
