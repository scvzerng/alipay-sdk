package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.crowd.condition.store response.
 * 
 * @author auto create
 * @since 1.0, 2016-04-13 16:16:19
 */
public class AlipayDataDataserviceCrowdConditionStoreResponse extends AlipayResponse {

	private static final long serialVersionUID = 5893325617951569523L;

	/** 
	 * 创建完规则组后的系统返回的规则组ID
	 */
	@ApiField("condition_id")
	private Long conditionId;

	public void setConditionId(Long conditionId) {
		this.conditionId = conditionId;
	}
	public Long getConditionId( ) {
		return this.conditionId;
	}

}
