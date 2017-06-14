package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.std.mock.listprim.api response.
 * 
 * @author auto create
 * @since 1.0, 2015-10-14 12:00:13
 */
public class AlipayMobilePublicStdMockListprimApiResponse extends AlipayResponse {

	private static final long serialVersionUID = 1624755683931465792L;

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
