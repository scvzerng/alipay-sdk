package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.mock.listprim.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-04-14 11:37:59
 */
public class AlipayMobilePublicMockListprimApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 2642962874743193158L;

	/** 
	 * 2088xxx
	 */
	@ApiListField("user_id_list")
	@ApiField("string")
	private List<String> userIdList;

	public void setUserIdList(List<String> userIdList) {
		this.userIdList = userIdList;
	}
	public List<String> getUserIdList( ) {
		return this.userIdList;
	}

}
