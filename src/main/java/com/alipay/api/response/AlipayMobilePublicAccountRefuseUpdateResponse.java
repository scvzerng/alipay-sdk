package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.account.refuse.update response.
 * 
 * @author auto create
 * @since 1.0, 2014-06-12 20:13:18
 */
public class AlipayMobilePublicAccountRefuseUpdateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2335872148296614784L;

	/** 
	 * code
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 是否拒绝推荐成功
	 */
	@ApiField("is_sucess_refuse")
	private String isSucessRefuse;

	/** 
	 * msg
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setIsSucessRefuse(String isSucessRefuse) {
		this.isSucessRefuse = isSucessRefuse;
	}
	public String getIsSucessRefuse( ) {
		return this.isSucessRefuse;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
