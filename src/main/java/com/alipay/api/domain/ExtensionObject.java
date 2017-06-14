package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拓展区域属性 ：content_type；拓展区域内容content
 *
 * @author auto create
 * @since 1.0, 2017-01-05 18:13:29
 */
public class ExtensionObject extends AlipayObject {

	private static final long serialVersionUID = 8415136196599115266L;

	/**
	 * 根据拓展区域属性传值，h5必须传入 http&https（此为强校验）
	 */
	@ApiField("content")
	private String content;

	/**
	 * 拓展区域名称
	 */
	@ApiField("content_name")
	private String contentName;

	/**
	 * 拓展区域属性,接口暂只支持 H5，
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 拓展区域展示属性:EXTEND 标识普通区域.
	 */
	@ApiField("ext_info")
	private String extInfo;

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentName() {
		return this.contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

}
