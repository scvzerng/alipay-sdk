package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.common.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-06 13:31:15
 */
public class KoubeiContentCommonCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3759858452877986528L;

	/** 
	 * 口碑内容ID，创建成功后，将返回此内容在口碑的ID，创建失败，则返回空。
	 */
	@ApiField("content_id")
	private String contentId;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

}
