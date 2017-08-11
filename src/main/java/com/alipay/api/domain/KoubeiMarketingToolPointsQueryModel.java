package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 集点查询
 *
 * @author auto create
 * @since 1.0, 2016-10-09 11:45:18
 */@ApiModel(description = " 集点查询")
public class KoubeiMarketingToolPointsQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2635842491948919778L;

	/**
	 * 活动积分帐户
	 */@JSONField(name = "activity_account", alternateNames = "activityAccount")@ApiModelProperty(notes = " 活动积分帐户")
	@NotNull(message = "活动积分帐户不能为空")
	private String activityAccount;

	/**
	 * 用户ID
	 */@JSONField(name = "user_id", alternateNames = "userId")@ApiModelProperty(notes = " 用户ID")
	@NotNull(message = "用户ID不能为空")
	private String userId;

	public String getActivityAccount() {
		return this.activityAccount;
	}
	public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
