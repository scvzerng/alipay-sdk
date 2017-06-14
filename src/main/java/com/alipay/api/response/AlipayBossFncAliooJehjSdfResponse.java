package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.alioo.jehj.sdf response.
 * 
 * @author auto create
 * @since 1.0, 2015-12-19 16:48:43
 */
public class AlipayBossFncAliooJehjSdfResponse extends AlipayResponse {

	private static final long serialVersionUID = 7742939977937169373L;

	/** 
	 * asfsd
	 */
	@ApiField("sdfsadf")
	private String sdfsadf;

	public void setSdfsadf(String sdfsadf) {
		this.sdfsadf = sdfsadf;
	}
	public String getSdfsadf( ) {
		return this.sdfsadf;
	}

}
