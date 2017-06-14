package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SimpleMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listsimplemodel.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-14 11:59:48
 */
public class AlipayMobilePublicStdMockListsimplemodelApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 8528514658351662968L;

	/** 
	 * 2088
	 */
	@ApiListField("biz_model_list")
	@ApiField("simple_mock_model")
	private List<SimpleMockModel> bizModelList;

	public void setBizModelList(List<SimpleMockModel> bizModelList) {
		this.bizModelList = bizModelList;
	}
	public List<SimpleMockModel> getBizModelList( ) {
		return this.bizModelList;
	}

}
