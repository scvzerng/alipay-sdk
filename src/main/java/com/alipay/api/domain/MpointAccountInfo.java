package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员积分发放账户详情数据
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:39
 */
public class MpointAccountInfo extends AlipayObject {

	private static final long serialVersionUID = 4792861222812362228L;

	/**
	 * 该笔交易后该账户积分余额
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * 业务流水号：积分核心指令流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 积分发放业务描述
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部业务单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 该笔交易金额
	 */
	@ApiField("trans_amount")
	private Long transAmount;

	/**
	 * 积分业务交易时间
	 */
	@ApiField("trans_dt")
	private Date transDt;

	public Long getBalance() {
		return this.balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Long getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(Long transAmount) {
		this.transAmount = transAmount;
	}

	public Date getTransDt() {
		return this.transDt;
	}
	public void setTransDt(Date transDt) {
		this.transDt = transDt;
	}

}
