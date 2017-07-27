package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:47:00
 */@ApiModel(description = " 系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息")
public class AlipayOfflineMarketShopQuerydetailModel extends AlipayObject {

	private static final long serialVersionUID = 7735647547663665418L;

	/**
	 * 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写
	 */@JSONField(name = "op_role", alternateNames = "opRole")
	@ApiModelProperty(notes = " 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写")
	private String opRole;

	/**
	 * 支付宝门店ID
	 */@JSONField(name = "shop_id", alternateNames = "shopId")
	@ApiModelProperty(notes = " 支付宝门店ID")
	@NotNull
	private String shopId;

	public String getOpRole() {
		return this.opRole;
	}
	public void setOpRole(String opRole) {
		this.opRole = opRole;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
