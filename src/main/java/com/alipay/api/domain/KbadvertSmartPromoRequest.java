package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 智能营销推荐信息
 *
 * @author auto create
 * @since 1.0, 2017-04-06 13:54:46
 */@ApiModel(description = " 智能营销推荐信息")
public class KbadvertSmartPromoRequest extends AlipayObject {

	private static final long serialVersionUID = 7584185395635732745L;

	/**
	 * 智能营销分组ID
	 */@ApiModelProperty(notes = " 智能营销分组ID")
	@ApiField("group_id")
	private String groupId;

	/**
	 * 智能营销方案ID
	 */@ApiModelProperty(notes = " 智能营销方案ID")
	@ApiField("plan_id")
	private String planId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

}
