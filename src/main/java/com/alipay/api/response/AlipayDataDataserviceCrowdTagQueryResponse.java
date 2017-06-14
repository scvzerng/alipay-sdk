package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.crowd.tag.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-04-13 13:44:05
 */
public class AlipayDataDataserviceCrowdTagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3594496127289945854L;

	/** 
	 * 创建人群分组
	 */
	@ApiListField("tags")
	@ApiField("string")
	private List<String> tags;

	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public List<String> getTags( ) {
		return this.tags;
	}

}
