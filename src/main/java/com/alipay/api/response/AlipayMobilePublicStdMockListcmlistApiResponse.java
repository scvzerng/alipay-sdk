package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ListListComplexMockModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listcmlist.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-14 11:59:18
 */
public class AlipayMobilePublicStdMockListcmlistApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 8758919581527496185L;

	/** 
	 * 复杂对象嵌套list
	 */
	@ApiListField("list_cm_list")
	@ApiField("list_list_complex_mock_model")
	private List<ListListComplexMockModel> listCmList;

	public void setListCmList(List<ListListComplexMockModel> listCmList) {
		this.listCmList = listCmList;
	}
	public List<ListListComplexMockModel> getListCmList( ) {
		return this.listCmList;
	}

}
