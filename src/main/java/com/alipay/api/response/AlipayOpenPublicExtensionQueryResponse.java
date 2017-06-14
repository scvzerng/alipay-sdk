package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtensionObjectResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.extension.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-12 12:06:29
 */
public class AlipayOpenPublicExtensionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3843328838635617468L;

	/** 
	 * 拓展区域内容
	 */
	@ApiListField("extension_object")
	@ApiField("extension_object_result")
	private List<ExtensionObjectResult> extensionObject;

	public void setExtensionObject(List<ExtensionObjectResult> extensionObject) {
		this.extensionObject = extensionObject;
	}
	public List<ExtensionObjectResult> getExtensionObject( ) {
		return this.extensionObject;
	}

}
