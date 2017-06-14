package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.query response.
 * 
 * @author auto create
 * @since 1.0, 2014-12-04 13:14:14
 */
public class AlipayFundTransQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3137296353269822832L;

	/** 
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

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
	 * ORDER_NOT_EXIST
	 */
	@ApiField("pay_date")
	private String payDate;

	/** 
	 * 订单状态
	 */
	@ApiField("status")
	private String status;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
