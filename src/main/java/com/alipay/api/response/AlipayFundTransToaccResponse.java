package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.toacc response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-08 17:24:11
 */
public class AlipayFundTransToaccResponse extends AlipayResponse {

	private static final long serialVersionUID = 4662964128838436976L;

	/** 
	 * error_code
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 具体错误原因
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/** 
	 * 支付宝转账单据号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户转账唯一订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付时间
	 */
	@ApiField("pay_date")
	private String payDate;

	/** 
	 * 转账结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getPayDate( ) {
		return this.payDate;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
