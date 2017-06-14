package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OldListListComplexMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.mock.listcmlist.api response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-14 17:26:17
 */
public class AlipayMobilePublicMockListcmlistApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 5784614783199327991L;

	/** 
	 * 复杂对象嵌套list
	 */
	@ApiListField("list_cm_list")
	@ApiField("old_list_list_complex_mock_model")
	private List<OldListListComplexMockModel> listCmList;

	public void setListCmList(List<OldListListComplexMockModel> listCmList) {
		this.listCmList = listCmList;
	}
	public List<OldListListComplexMockModel> getListCmList( ) {
		return this.listCmList;
	}

}
