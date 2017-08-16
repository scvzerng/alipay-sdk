package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 查询绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:28:37
 */@ApiModel(description = " 查询绑定商户会员号")
public class AlipayOpenPublicAccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6455545995915995173L;

	/**
	 * 支付宝账号userid，2088开头长度为16位的字符串
	 */@JSONField(name = "user_id", alternateNames = "userId")@ApiModelProperty(notes = " 支付宝账号userid，2088开头长度为16位的字符串")
	private String userId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
