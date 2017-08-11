package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 发券授权
 *
 * @author auto create
 * @since 1.0, 2016-10-09 11:45:06
 */@ApiModel(description = " 发券授权")
public class KoubeiMarketingToolPrizesendAuthModel extends AlipayObject {

	private static final long serialVersionUID = 2851679345331226656L;

	/**
	 * 奖品ID
	 */@JSONField(name = "prize_id", alternateNames = "prizeId")@ApiModelProperty(notes = " 奖品ID")
	@NotNull(message = "奖品ID不能为空")
	private String prizeId;

	/**
	 * 外部流水号，保证业务幂等性
	 */@JSONField(name = "req_id", alternateNames = "reqId")@ApiModelProperty(notes = " 外部流水号，保证业务幂等性")
	@NotNull(message = "外部流水号不能为空")
	private String reqId;

	/**
	 * 发奖用户ID
	 */@JSONField(name = "user_id", alternateNames = "userId")@ApiModelProperty(notes = " 发奖用户ID")
	@NotNull(message = "发奖用户ID不能为空")
	private String userId;

	public String getPrizeId() {
		return this.prizeId;
	}
	public void setPrizeId(String prizeId) {
		this.prizeId = prizeId;
	}

	public String getReqId() {
		return this.reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
