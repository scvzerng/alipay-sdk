package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.databiz.core.user.evaluation.get response.
 * 
 * @author auto create
 * @since 1.0, 2014-10-20 11:12:12
 */
public class AlipayDatabizCoreUserEvaluationGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6268543545322522648L;

	/** 
	 * 支付宝用户标识
	 */
	@ApiField("alipay_user_flag")
	private String alipayUserFlag;

	/** 
	 * 支付宝钱包用户标识
	 */
	@ApiField("mob_client_user_flag")
	private String mobClientUserFlag;

	/** 
	 * 无线支付能力等级
	 */
	@ApiField("mob_pay_ability_level")
	private String mobPayAbilityLevel;

	/** 
	 * 返回的流水号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 数娱行业活跃用户标识
	 */
	@ApiField("trd_sy_user_flag")
	private String trdSyUserFlag;

	/** 
	 * 消费品位
	 */
	@ApiField("user_consume_label")
	private String userConsumeLabel;

	/** 
	 * 消费水平等级
	 */
	@ApiField("user_consume_level")
	private String userConsumeLevel;

	/** 
	 * 支付能力等级
	 */
	@ApiField("user_pay_level")
	private String userPayLevel;

	public void setAlipayUserFlag(String alipayUserFlag) {
		this.alipayUserFlag = alipayUserFlag;
	}
	public String getAlipayUserFlag( ) {
		return this.alipayUserFlag;
	}

	public void setMobClientUserFlag(String mobClientUserFlag) {
		this.mobClientUserFlag = mobClientUserFlag;
	}
	public String getMobClientUserFlag( ) {
		return this.mobClientUserFlag;
	}

	public void setMobPayAbilityLevel(String mobPayAbilityLevel) {
		this.mobPayAbilityLevel = mobPayAbilityLevel;
	}
	public String getMobPayAbilityLevel( ) {
		return this.mobPayAbilityLevel;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setTrdSyUserFlag(String trdSyUserFlag) {
		this.trdSyUserFlag = trdSyUserFlag;
	}
	public String getTrdSyUserFlag( ) {
		return this.trdSyUserFlag;
	}

	public void setUserConsumeLabel(String userConsumeLabel) {
		this.userConsumeLabel = userConsumeLabel;
	}
	public String getUserConsumeLabel( ) {
		return this.userConsumeLabel;
	}

	public void setUserConsumeLevel(String userConsumeLevel) {
		this.userConsumeLevel = userConsumeLevel;
	}
	public String getUserConsumeLevel( ) {
		return this.userConsumeLevel;
	}

	public void setUserPayLevel(String userPayLevel) {
		this.userPayLevel = userPayLevel;
	}
	public String getUserPayLevel( ) {
		return this.userPayLevel;
	}

}
