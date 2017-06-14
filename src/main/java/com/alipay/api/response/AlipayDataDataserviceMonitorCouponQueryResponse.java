package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.monitor.coupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-06-24 17:24:45
 */
public class AlipayDataDataserviceMonitorCouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1711931922749448579L;

	/** 
	 * 返回动态的央视需要的数据，对应传入的业务标识(biz_id)来进行区别
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
