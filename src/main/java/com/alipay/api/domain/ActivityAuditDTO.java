package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 活动审核模型
 *
 * @author auto create
 * @since 1.0, 2017-02-14 15:58:19
 */
@ApiModel
public class ActivityAuditDTO extends AlipayObject {

	private static final long serialVersionUID = 6441451453895475277L;

	/**
	 * 审核id
	 */
	@ApiField("audit_id")
	@ApiModelProperty(notes = "审核id")
	private String auditId;

	/**
	 * INIT:初始化;AUDITING:审核中;REJECT:审核驳回;PASS:审核通过;CANCEL:审核撤销;FAIL:审核失败
	 */
	@ApiField("audit_status")
	@ApiModelProperty(notes = "INIT:初始化;AUDITING:审核中;REJECT:审核驳回;PASS:审核通过;CANCEL:审核撤销;FAIL:审核失败")
	private String auditStatus;

	/**
	 * 操作人id
	 */
	@ApiField("creator_id")
	@ApiModelProperty(notes = "操作人id")
	private String creatorId;

	/**
	 * 同活动中的角色列表
	 */
	@ApiField("creator_type")
	@ApiModelProperty(notes = "同活动中的角色列表")
	private String creatorType;

	/**
	 * 操作时间
	 */
	@ApiField("operation_time")
	@ApiModelProperty(notes = "操作时间")
	private Date operationTime;

	/**
	 * 审核通过或者审核驳回的原因
	 */
	@ApiField("reason")
	@ApiModelProperty(notes = "审核通过或者审核驳回的原因")
	private String reason;

	public String getAuditId() {
		return this.auditId;
	}
	public void setAuditId(String auditId) {
		this.auditId = auditId;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorType() {
		return this.creatorType;
	}
	public void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
