package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 活动基本信息
 *
 * @author auto create
 * @since 1.0, 2017-01-18 15:50:35
 */
@ApiModel
public class CampBaseDto extends AlipayObject {

	private static final long serialVersionUID = 8824666444636235813L;

	/**
	 * 活动工单列表
	 */
	@ApiListField("activity_orders")
	@ApiField("activity_order_d_t_o")
	@ApiModelProperty(notes = "活动工单列表")
	private List<ActivityOrderDTO> activityOrders;

	/**
	 * 活动审核状态，AUDITING为审核中,REJECT为驳回，不返回为成功
	 */
	@ApiField("audit_status")
	@ApiModelProperty(notes = "活动审核状态，AUDITING为审核中,REJECT为驳回，不返回为成功")
	private String auditStatus;

	/**
	 * 是否自动续期，Y为是，N为否，为空表示否
	 */
	@ApiField("auto_delay_flag")
	@ApiModelProperty(notes = "是否自动续期，Y为是，N为否，为空表示否")
	private String autoDelayFlag;

	/**
	 * 截至时间
	 */
	@ApiField("end_time")
	@ApiModelProperty(notes = "截至时间")
	private Date endTime;

	/**
	 * 活动id
	 */
	@ApiField("id")
	@ApiModelProperty(notes = "活动id")
	private String id;

	/**
	 * 活动名称
	 */
	@ApiField("name")
	@ApiModelProperty(notes = "活动名称")
	private String name;

	/**
	 * 招商状态,GOING招商中，ENDED招商结束，OFFLINE下架
	 */
	@ApiField("plan_status")
	@ApiModelProperty(notes = "招商状态,GOING招商中，ENDED招商结束，OFFLINE下架")
	private String planStatus;

	/**
	 * 启动时间
	 */
	@ApiField("start_time")
	@ApiModelProperty(notes = "启动时间")
	private Date startTime;

	/**
	 * 活动状态,CREATED:草稿，ENABLED：生效，DISABLED：无效，STARTED：启动，CLOSED：停止，FINISHED：完成
	 */
	@ApiField("status")
	@ApiModelProperty(notes = "活动状态,CREATED:草稿，ENABLED：生效，DISABLED：无效，STARTED：启动，CLOSED：停止，FINISHED：完成")
	private String status;

	/**
	 * 活动类型.DIRECT_SEND:直发奖,CONSUME_SEND:消费送
	 */
	@ApiField("type")
	@ApiModelProperty(notes = "活动类型.DIRECT_SEND:直发奖,CONSUME_SEND:消费送")
	private String type;

	public List<ActivityOrderDTO> getActivityOrders() {
		return this.activityOrders;
	}
	public void setActivityOrders(List<ActivityOrderDTO> activityOrders) {
		this.activityOrders = activityOrders;
	}

	public String getAuditStatus() {
		return this.auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getAutoDelayFlag() {
		return this.autoDelayFlag;
	}
	public void setAutoDelayFlag(String autoDelayFlag) {
		this.autoDelayFlag = autoDelayFlag;
	}

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlanStatus() {
		return this.planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
