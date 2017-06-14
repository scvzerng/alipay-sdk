package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.zhima.data.batch.feedback response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-13 15:15:09
 */
public class AlipayOpenAppZhimaDataBatchFeedbackResponse extends AlipayResponse {

	private static final long serialVersionUID = 7592566386265257136L;

	/** 
	 * 业务调用是否成功
	 */
	@ApiField("biz_success")
	private String bizSuccess;

	public void setBizSuccess(String bizSuccess) {
		this.bizSuccess = bizSuccess;
	}
	public String getBizSuccess( ) {
		return this.bizSuccess;
	}

}
