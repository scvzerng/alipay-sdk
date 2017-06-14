package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.label.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-27 17:04:56
 */
public class AlipayMobileStdPublicLabelUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4867624752361216542L;

	/** 
	 * 标签编号，英文逗号分隔
	 */
	@ApiField("label_ids")
	private String labelIds;

	public void setLabelIds(String labelIds) {
		this.labelIds = labelIds;
	}
	public String getLabelIds( ) {
		return this.labelIds;
	}

}
