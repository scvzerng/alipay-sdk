package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 口碑客签约查询
 *
 * @author auto create
 * @since 1.0, 2017-02-10 14:26:07
 */@ApiModel(description = " 口碑客签约查询")
public class KoubeiAdvertCommissionRoleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7259762572859216719L;

	/**
	 * 角色code码，如果不提供该字段，则会遍历所有角色，并返回user_identify是否拥有，
MISSION_PROMO：任务推广角色
MISSION_PUBLISH：任务发布角色
	 */@ApiModelProperty(notes = " 角色code码，如果不提供该字段，则会遍历所有角色，并返回user_identify是否拥有，MISSION_PROMO：任务推广角色MISSION_PUBLISH：任务发布角色")
	@ApiField("role_code")
	@EnumCheck(enums = {"MISSION_PROMO","MISSION_PUBLISH"})
	private String roleCode;

	/**
	 * 用户身份主键
user_identify_type=user_id -值必须是支付宝账户ID
	 */@ApiModelProperty(notes = " 用户身份主键user_identify_type=user_id -值必须是支付宝账户ID")
	@ApiField("user_identify")
	@NotBlank
	private String userIdentify;

	/**
	 * 用户身份主键类型
user_id - 支付宝账户ID
	 */@ApiModelProperty(notes = " 用户身份主键类型user_id - 支付宝账户ID")
	@ApiField("user_identify_type")
	@NotBlank
	@EnumCheck(enums = "user_id")
	private String userIdentifyType;

	public String getRoleCode() {
		return this.roleCode;
	}
	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getUserIdentify() {
		return this.userIdentify;
	}
	public void setUserIdentify(String userIdentify) {
		this.userIdentify = userIdentify;
	}

	public String getUserIdentifyType() {
		return this.userIdentifyType;
	}
	public void setUserIdentifyType(String userIdentifyType) {
		this.userIdentifyType = userIdentifyType;
	}

}
