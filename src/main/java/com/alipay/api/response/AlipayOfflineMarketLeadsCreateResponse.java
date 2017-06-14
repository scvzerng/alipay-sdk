package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.leads.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-12-23 13:37:27
 */
public class AlipayOfflineMarketLeadsCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1348558959364212655L;

	/** 
	 * 支付宝流水号
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 审核状态描述
	 */
	@ApiField("audit_desc")
	private String auditDesc;

	/** 
	 * 如果新增的leads需要审核，该状态非空
	 */
	@ApiField("audit_status")
	private String auditStatus;

	/** 
	 * leads创建时间
	 */
	@ApiField("create_time")
	private String createTime;

	/** 
	 * leads主键，无需审核的leads，直接创建。该字段非空
	 */
	@ApiField("leads_id")
	private String leadsId;

	/** 
	 * 外部流水好
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

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime( ) {
		return this.createTime;
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
