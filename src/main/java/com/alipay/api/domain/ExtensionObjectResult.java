package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用自定义拓展区域返回内容
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
public class ExtensionObjectResult extends AlipayObject {

	private static final long serialVersionUID = 8421522962911189247L;

	/**
	 * 自定义拓展区域内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 自定义拓展区域名称
	 */
	@ApiField("content_name")
	private String contentName;

	/**
	 * 自定义拓展区域类型
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 拓展区域类型
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 图片型拓展区域点击跳转事件 url
仅图片类型会返回该参数,且接口暂不支持设置图片
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	/**
	 * 上线状态.
通过管理接口调用成功即上线
	 */
	@ApiField("status")
	private String status;

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

	public String getGotoUrl() {
		return this.gotoUrl;
	}
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
