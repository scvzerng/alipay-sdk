package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 条件模型
 *
 * @author auto create
 * @since 1.0, 2017-01-18 15:50:35
 */
@ApiModel(description = "条件模型")
public class Condition extends AlipayObject {

	private static final long serialVersionUID = 4167476514566391327L;

	/**
	 * 字段名称，目前支持以下字段：
name: 活动名称 
startTime: 开始时间
endTime: 结束时间
status：活动状态
	 */
	@ApiField("field_name")
	@ApiModelProperty(notes = "字段名称，目前支持以下字段：\n" +
			"name: 活动名称 \n" +
			"startTime: 开始时间\n" +
			"endTime: 结束时间\n" +
			"status：活动状态")
	private String fieldName;

	/**
	 * 对应于field_name的字段值，当field_name为status时，field_value支持STARTED、STARTING、MODIFYING、CLOSED、CLOSING、DISABLED几种值，用|分隔，代表查询这些状态中的活动，此时operator只能为IN,field_name为name时候value表示要查询的活动名，field_name为时间时,field_value为开始或结束时间，格式如2016-10-01 00:00:00
	 */
	@ApiField("field_value")
	@ApiModelProperty(notes = "对应于field_name的字段值，当field_name为status时，field_value支持STARTED、STARTING、MODIFYING、CLOSED、CLOSING、DISABLED几种值，用|分隔，代表查询这些状态中的活动，此时operator只能为IN,field_name为name时候value表示要查询的活动名，field_name为时间时,field_value为开始或结束时间，格式如2016-10-01 00:00:00")
	private String fieldValue;

	/**
	 * 操作符,EQUAL:等于,IN:范围。目前支持field_name=status且operator=IN,多个状态以"|"分隔
	 */
	@ApiModelProperty(notes = "")
	@ApiField("operator")
	private String operator;

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldValue() {
		return this.fieldValue;
	}
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}
