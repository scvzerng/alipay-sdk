package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 添加绑定商户会员号
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */@ApiModel(description = " 添加绑定商户会员号")
public class AlipayOpenPublicAccountCreateModel extends AlipayObject {

	private static final long serialVersionUID = 2853752555422225442L;

	/**
	 * 账户添加成功，在支付宝与其对应的协议号。如果账户重复添加，接口保证幂等依然视为添加成功，返回此前该账户在支付宝对应的协议号。其他异常该字段不存在。
	 */@JSONField(name = "agreement_id", alternateNames = "agreementId")@ApiModelProperty(notes = " 账户添加成功，在支付宝与其对应的协议号。如果账户重复添加，接口保证幂等依然视为添加成功，返回此前该账户在支付宝对应的协议号。其他异常该字段不存在。")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性
	 */@JSONField(name = "bind_account_no", alternateNames = "bindAccountNo")@ApiModelProperty(notes = " 绑定帐号，建议在开发者的系统中保持唯一性")
	private String bindAccountNo;

	/**
	 * 开发者期望在服务窗首页看到的关于该用户的显示信息，最长10个字符
	 */@JSONField(name = "display_name", alternateNames = "displayName")@ApiModelProperty(notes = " 开发者期望在服务窗首页看到的关于该用户的显示信息，最长10个字符")
	private String displayName;

	/**
	 * 要绑定的商户会员对应的支付宝userid，2088开头长度为16位的字符串
	 */@JSONField(name = "from_user_id", alternateNames = "fromUserId")@ApiModelProperty(notes = " 要绑定的商户会员对应的支付宝userid，2088开头长度为16位的字符串")
	private String fromUserId;

	/**
	 * 要绑定的商户会员的真实姓名，最长10个汉字
	 */@JSONField(name = "real_name", alternateNames = "realName")@ApiModelProperty(notes = " 要绑定的商户会员的真实姓名，最长10个汉字")
	private String realName;

	/**
	 * 备注信息，开发者可以通过该字段纪录其他的额外信息
	 */@ApiModelProperty(notes = " 备注信息，开发者可以通过该字段纪录其他的额外信息")
	private String remark;

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

	public String getDisplayName() {
		return this.displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFromUserId() {
		return this.fromUserId;
	}
	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
