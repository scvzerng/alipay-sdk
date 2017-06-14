package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.crowd.condition.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-04-13 16:22:03
 */
public class AlipayDataDataserviceCrowdConditionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2735959549643699625L;

	/** 
	 * 返回的Condition数据
	 */
	@ApiField("condition")
	private String condition;

	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getCondition( ) {
		return this.condition;
	}

}
