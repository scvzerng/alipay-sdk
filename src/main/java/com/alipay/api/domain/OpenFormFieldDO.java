package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放表单字段定义数据模型
 *
 * @author auto create
 * @since 1.0, 2017-03-20 20:52:13
 */
public class OpenFormFieldDO extends AlipayObject {

	private static final long serialVersionUID = 5229386564854421666L;

	/**
	 * 表单可选字段配置，common_fields属性定义一个表单字段数组。
	 */
	@ApiField("optional")
	private String optional;

	/**
	 * 表单必填字段配置，common_fields属性定义一个表单字段数组。
	 */
	@ApiField("required")
	private String required;

	public String getOptional() {
		return this.optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}

	public String getRequired() {
		return this.required;
	}
	public void setRequired(String required) {
		this.required = required;
	}

}
