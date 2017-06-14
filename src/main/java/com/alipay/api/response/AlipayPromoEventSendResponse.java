package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.promo.event.send response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 17:16:00
 */
public class AlipayPromoEventSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4195263448336252781L;

	/** 
	 * 接口调用结果：true,false
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
