package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 更新卡积分
 *
 * @author auto create
 * @since 1.0, 2016-11-15 18:49:47
 */@ApiModel(description = " 更新卡积分")
public class KoubeiMarketingToolPointsUpdateModel extends AlipayObject {

	private static final long serialVersionUID = 2311112773377595977L;

	/**
	 * 活动集点帐户ID, 开发者通过查询集点活动详情获取
	 */@JSONField(name = "activity_account", alternateNames = "activityAccount")@ApiModelProperty(notes = " 活动集点帐户ID, 开发者通过查询集点活动详情获取")
	@NotNull(message = "活动集点帐户ID不能为空")
	private String activityAccount;

	/**
	 * 业务流水号，集点交易类型为
DEPOSIT, 传入支付交易号;
CANCEL／COMMIT, 传入冻结集点的集点流水号;
CONSUME／FREEZE, 不允许传入biz_no;
	 */@JSONField(name = "biz_no", alternateNames = "bizNo")@ApiModelProperty(notes = " 业务流水号，集点交易类型为DEPOSIT, 传入支付交易号;CANCEL／COMMIT, 传入冻结集点的集点流水号;CONSUME／FREEZE, 不允许传入biz_no;")
	private String bizNo;

	/**
	 * 扩展信息
	 */@JSONField(name = "ext_info", alternateNames = "extInfo")@ApiModelProperty(notes = " 扩展信息")
	private String extInfo;

	/**
	 * 交易备注
	 */@ApiModelProperty(notes = " 交易备注")
	private String memo;

	/**
	 * 外部流水号, 由开发者提供, 用于控制业务幂等
	 */@JSONField(name = "req_id", alternateNames = "reqId")@ApiModelProperty(notes = " 外部流水号, 由开发者提供, 用于控制业务幂等")
	@NotNull(message = "外部流水号不能为空")
	private String reqId;

	/**
	 * 门店ID，集点交易类型为DEPOSIT时填写
	 */@JSONField(name = "shop_id", alternateNames = "shopId")@ApiModelProperty(notes = " 门店ID，集点交易类型为DEPOSIT时填写")
	private String shopId;

	/**
	 * 集点交易数量，必须为正整数字符串
	 */@JSONField(name = "trans_amount", alternateNames = "transAmount")@ApiModelProperty(notes = " 集点交易数量，必须为正整数字符串")
	private String transAmount;

	/**
	 * 集点交易类型，目前支持:
DEPOSIT，增加集点
FREEZE，冻结集点
COMMIT，提交冻结集点
CANCEL，取消冻结集点
CONSUME, 消费集点
	 */@JSONField(name = "trans_type", alternateNames = "transType")@ApiModelProperty(notes = " 集点交易类型，目前支持:DEPOSIT，增加集点FREEZE，冻结集点COMMIT，提交冻结集点CANCEL，取消冻结集点CONSUME, 消费集点")
	private String transType;

	/**
	 * 用户ID, 开发者通过用户信息授权产品获取
	 */@JSONField(name = "user_id", alternateNames = "userId")@ApiModelProperty(notes = " 用户ID, 开发者通过用户信息授权产品获取")
	@NotNull(message = "用户ID不能为空")
	private String userId;

	public String getActivityAccount() {
		return this.activityAccount;
	}
	public void setActivityAccount(String activityAccount) {
		this.activityAccount = activityAccount;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransType() {
		return this.transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
