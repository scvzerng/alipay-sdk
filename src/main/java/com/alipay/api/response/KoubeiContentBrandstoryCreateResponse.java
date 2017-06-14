package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.brandstory.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-11 20:18:32
 */
public class KoubeiContentBrandstoryCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3228174741246255613L;

	/** 
	 * 创建生成的品牌故事id
	 */
	@ApiField("brand_story_id")
	private String brandStoryId;

	public void setBrandStoryId(String brandStoryId) {
		this.brandStoryId = brandStoryId;
	}
	public String getBrandStoryId( ) {
		return this.brandStoryId;
	}

}
