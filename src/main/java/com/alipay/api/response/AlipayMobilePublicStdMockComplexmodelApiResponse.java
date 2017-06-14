package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SimpleMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.complexmodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-14 12:00:37
 */
public class AlipayMobilePublicStdMockComplexmodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 8778887255915538495L;

	/** 
	 * biz_model
	 */
	@ApiField("biz_model")
	private SimpleMockModel bizModel;

	/** 
	 * 11
	 */
	@ApiField("biz_num")
	private Long bizNum;

	/** 
	 * ADC
	 */
	@ApiField("biz_type")
	private String bizType;

	public void setBizModel(SimpleMockModel bizModel) {
		this.bizModel = bizModel;
	}
	public SimpleMockModel getBizModel( ) {
		return this.bizModel;
	}

	public void setBizNum(Long bizNum) {
		this.bizNum = bizNum;
	}
	public Long getBizNum( ) {
		return this.bizNum;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

}
