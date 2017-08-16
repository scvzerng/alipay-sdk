package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 解除绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2016-12-07 20:01:20
 */@ApiModel(description = " 解除绑定商户会员号")
public class AlipayOpenPublicAccountDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5685989751457162395L;

	/**
	 * 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空
	 */@JSONField(name = "agreement_id", alternateNames = "agreementId")@ApiModelProperty(notes = " 协议号，商户会员在支付宝服务窗账号中的唯一标识，与bind_account_no不能同时为空")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空
	 */@JSONField(name = "bind_account_no", alternateNames = "bindAccountNo")@ApiModelProperty(notes = " 绑定帐号，建议在开发者的系统中保持唯一性，与agreement_id不能同时为空")
	private String bindAccountNo;

	/**
	 * 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空
	 */@JSONField(name = "from_user_id", alternateNames = "fromUserId")@ApiModelProperty(notes = " 绑定用户的支付宝userid，2088开头16位长度的字符串，与agreementId不能同时为空")
	private String fromUserId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getBindAccountNo() {
		return this.bindAccountNo;
	}
	public void setBindAccountNo(String bindAccountNo) {
		this.bindAccountNo = bindAccountNo;
	}

	public String getFromUserId() {
		return this.fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

}
