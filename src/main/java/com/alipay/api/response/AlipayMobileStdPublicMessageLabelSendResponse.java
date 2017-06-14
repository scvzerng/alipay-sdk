package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.message.label.send response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:05:16
 */
public class AlipayMobileStdPublicMessageLabelSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 4889421962755966633L;

	/** 
	 * 消息ID
	 */
	@ApiField("msg_id")
	private String msgId;

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getMsgId( ) {
		return this.msgId;
	}

}
