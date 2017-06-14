package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑内容正文模型
 *
 * @author auto create
 * @since 1.0, 2017-04-05 17:47:00
 */
public class KbContentInfoModel extends AlipayObject {

	private static final long serialVersionUID = 3551767296812421798L;

	/**
	 * 段落列表。内容正文可以是以下类型中的一种或者组合
rich_text：富文本
video:视频
picture_list:图片列表
paragraph_list:段落列表
	 */
	@ApiListField("paragraph_list")
	@ApiField("string")
	private List<String> paragraphList;

	/**
	 * 图片列表。内容正文可以是以下类型中的一种或者组合
rich_text：富文本
video:视频
picture_list:图片列表
paragraph_list:段落列表
	 */
	@ApiListField("picture_list")
	@ApiField("string")
	private List<String> pictureList;

	/**
	 * 富文本。
内容正文是以下类型中的一种或者组合
rich_text：富文本
video:视频
picture_list:图片列表
paragraph_list:段落列表
	 */
	@ApiField("rich_text")
	private String richText;

	/**
	 * 视频。
内容正文可以是以下类型中的一种或者组合
rich_text：富文本
video:视频
picture_list:图片列表
paragraph_list:段落列表
	 */
	@ApiField("video")
	private String video;

	public List<String> getParagraphList() {
		return this.paragraphList;
	}
	public void setParagraphList(List<String> paragraphList) {
		this.paragraphList = paragraphList;
	}

	public List<String> getPictureList() {
		return this.pictureList;
	}
	public void setPictureList(List<String> pictureList) {
		this.pictureList = pictureList;
	}

	public String getRichText() {
		return this.richText;
	}
	public void setRichText(String richText) {
		this.richText = richText;
	}

	public String getVideo() {
		return this.video;
	}
	public void setVideo(String video) {
		this.video = video;
	}

}
