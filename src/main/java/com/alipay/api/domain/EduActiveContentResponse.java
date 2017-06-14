package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扎堆活动的返回内容
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class EduActiveContentResponse extends AlipayObject {

	private static final long serialVersionUID = 6425325667219889143L;

	/**
	 * 活动编号
	 */
	@ApiField("code")
	private String code;

	/**
	 * T：成功，F：失败
	 */
	@ApiField("status")
	private String status;

	/**
	 * 活动类型
	 */
	@ApiField("type")
	private String type;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
