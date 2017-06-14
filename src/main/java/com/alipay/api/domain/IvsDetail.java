package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ivs的细节信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:37
 */
public class IvsDetail extends AlipayObject {

	private static final long serialVersionUID = 2172975929697223262L;

	/**
	 * 风险因素code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 风险描述说明
	 */
	@ApiField("description")
	private String description;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
