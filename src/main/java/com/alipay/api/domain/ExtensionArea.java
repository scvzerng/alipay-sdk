package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展区
 *
 * @author auto create
 * @since 1.0, 2017-04-10 18:04:12
 */
public class ExtensionArea extends AlipayObject {

	private static final long serialVersionUID = 3559284195244421855L;

	/**
	 * 扩展区高度，当content_type值为"h5"时必填，取值范围为200-500的整数
	 */
	@ApiField("area_height")
	private Long areaHeight;

	/**
	 * 扩展区内容，传入图片url或者h5页面url，必须是https开头的链接
	 */
	@ApiField("content")
	private String content;

	/**
	 * 扩展区名字
	 */
	@ApiField("content_name")
	private String contentName;

	/**
	 * 扩展区类型，支持两个值，h5：h5类型，image：图片类型。
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 跳转链接，当content_type为"image"时必传，必须是https或alipays开头的url链接
	 */
	@ApiField("goto_url")
	private String gotoUrl;

	public Long getAreaHeight() {
		return this.areaHeight;
	}
	public void setAreaHeight(Long areaHeight) {
		this.areaHeight = areaHeight;
	}

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

	public String getGotoUrl() {
		return this.gotoUrl;
	}
	public void setGotoUrl(String gotoUrl) {
		this.gotoUrl = gotoUrl;
	}

}
