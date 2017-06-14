package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.facepay.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 11:49:34
 */
public class AlipayEbppFacepayBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2318364416668263394L;

	/** 
	 * 账单中心交易流水号
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 出账机构英文名称
	 */
	@ApiField("charge_inst")
	private String chargeInst;

	/** 
	 * 扩展字段
	 */
	@ApiField("extend_field")
	private String extendField;

	/** 
	 * 机构账单ID
	 */
	@ApiField("inst_no")
	private String instNo;

	/** 
	 * ISV交易流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * SUCCESS - 付款成功（只有明确得到此状态，机构才能销账）
FAIL - 付款失败（明确得到此状态，机构可认为本次支付失败，再次扫码）
WAIT_PAY - 等待用户输入密码支付（得到此状态，需轮询10次，每隔3s一次，若一直得不到明确结果需要调用撤销接口，认为支付失败）
UNKNOWN - 状态未知（得到此状态，需轮询2次，每隔5s一次，若一直得不到明确结果需要调用撤销接口，认为支付失败）
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 交易日期
	 */
	@ApiField("trade_date")
	private String tradeDate;

	/** 
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst( ) {
		return this.chargeInst;
	}

	public void setExtendField(String extendField) {
		this.extendField = extendField;
	}
	public String getExtendField( ) {
		return this.extendField;
	}

	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getInstNo( ) {
		return this.instNo;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}
	public String getTradeDate( ) {
		return this.tradeDate;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
