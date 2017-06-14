package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义拓展区域设置
 *
 * @author auto create
 * @since 1.0, 2017-01-12 20:19:50
 */
public class AlipayOpenPublicExtensionApplyModel extends AlipayObject {

	private static final long serialVersionUID = 5821932334284294955L;

	/**
	 * 最多3条，按先后顺序展示在客户端。每次上传会覆盖已展示内容
	 */
	@ApiListField("area")
	@ApiField("extension_object")
	private List<ExtensionObject> area;

	public List<ExtensionObject> getArea() {
		return this.area;
	}
	public void setArea(List<ExtensionObject> area) {
		this.area = area;
	}

}
