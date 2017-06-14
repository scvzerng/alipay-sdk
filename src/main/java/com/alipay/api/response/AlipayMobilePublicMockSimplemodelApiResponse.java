package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SimpleMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.mock.simplemodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-04-14 11:37:15
 */
public class AlipayMobilePublicMockSimplemodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 8183688318787615548L;

	/** 
	 * mock
	 */
	@ApiField("simple_mock_model")
	private SimpleMockModel simpleMockModel;

	public void setSimpleMockModel(SimpleMockModel simpleMockModel) {
		this.simpleMockModel = simpleMockModel;
	}
	public SimpleMockModel getSimpleMockModel( ) {
		return this.simpleMockModel;
	}

}
