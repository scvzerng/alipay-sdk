package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消息模板删除接口
 *
 * @author auto create
 * @since 1.0, 2016-07-13 14:24:30
 */
public class AlipayOpenPublicTemplateMessageDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2813324112932515338L;

	/**
	 * 要删除掉模板id
	 */
	@ApiField("template_id")
	private String templateId;

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
