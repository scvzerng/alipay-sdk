package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.nontoken.score.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-04-30 17:34:46
 */
public class AlipayTrustUserNontokenScoreGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5717336423651589711L;

	/** 
	 * 服务窗返回码
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 服务窗返回码含义
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
