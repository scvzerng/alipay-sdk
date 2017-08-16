package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 重新设置绑定商家会员号
 *
 * @author auto create
 * @since 1.0, 2016-08-10 17:26:40
 */@ApiModel(description = " 重新设置绑定商家会员号")
public class AlipayOpenPublicAccountResetModel extends AlipayObject {

	private static final long serialVersionUID = 7524552939251824182L;

	/**
	 * 需要重置的协议号，商户会员在支付宝服务窗账号中的唯一标识
	 */@ApiModelProperty(notes = " 需要重置的协议号，商户会员在支付宝服务窗账号中的唯一标识")@JSONField(name = "agreement_id", alternateNames = "agreementId")
	private String agreementId;

	/**
	 * 绑定帐号，建议在开发者的系统中保持唯一性
	 */@ApiModelProperty(notes = " 绑定帐号，建议在开发者的系统中保持唯一性")@JSONField(name = "bind_account_no", alternateNames = "bindAccountNo")
	private String bindAccountNo;

	/**
	 * 开发者期望在服务窗首页看到的关于该用户的显示信息，最长10个字符
	 */@ApiModelProperty(notes = " 开发者期望在服务窗首页看到的关于该用户的显示信息，最长10个字符")@JSONField(name = "display_name", alternateNames = "displayName")
	private String displayName;

	/**
	 * 要绑定的商户会员对应的支付宝userid，2088开头长度为16位的字符串
	 */@ApiModelProperty(notes = " 要绑定的商户会员对应的支付宝userid，2088开头长度为16位的字符串")@JSONField(name = "from_user_id", alternateNames = "fromUserId")
	private String fromUserId;

	/**
	 * 要绑定的商户会员的真实姓名，最长10个汉字
	 */@ApiModelProperty(notes = " 要绑定的商户会员的真实姓名，最长10个汉字")@JSONField(name = "real_name", alternateNames = "realName")
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
