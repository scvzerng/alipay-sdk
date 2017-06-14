package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 内容统一发布接口
 *
 * @author auto create
 * @since 1.0, 2017-04-05 18:02:38
 */
public class KoubeiContentCommonCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6879276226682721486L;

	/**
	 * 内容作者
	 */
	@ApiField("author")
	private String author;

	/**
	 * 内容表示的业务类型，可选项：
ARTICLE：达人说
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 内容简介
	 */
	@ApiField("content_desc")
	private String contentDesc;

	/**
	 * 内容正文的类型，可选项：
IMAGE:图片
VIDEO:视频
TEXT:文本
COMPOSITE:图文组合
RICH_TEXT:富文本
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 内容封面图列表
	 */
	@ApiListField("cover_pic_list")
	@ApiField("string")
	private List<String> coverPicList;

	/**
	 * 内容创建人
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 内容正文.
	 */
	@ApiField("kb_content_info_model")
	private KbContentInfoModel kbContentInfoModel;

	/**
	 * 口碑内容关联对象，包括城市、店铺、标签信息。
	 */
	@ApiField("kb_content_relation_model")
	private KbContentRelationModel kbContentRelationModel;

	/**
	 * 内容原文链接
	 */
	@ApiField("original_url")
	private String originalUrl;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/**
	 * 内容所属人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 内容来源，具体使用请联系开发。
	 */
	@ApiField("source")
	private String source;

	/**
	 * 内容副标题
	 */
	@ApiField("sub_tilte")
	private String subTilte;

	/**
	 * 内容标题
	 */
	@ApiField("title")
	private String title;

	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getContentDesc() {
		return this.contentDesc;
	}
	public void setContentDesc(String contentDesc) {
		this.contentDesc = contentDesc;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public List<String> getCoverPicList() {
		return this.coverPicList;
	}
	public void setCoverPicList(List<String> coverPicList) {
		this.coverPicList = coverPicList;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public KbContentInfoModel getKbContentInfoModel() {
		return this.kbContentInfoModel;
	}
	public void setKbContentInfoModel(KbContentInfoModel kbContentInfoModel) {
		this.kbContentInfoModel = kbContentInfoModel;
	}

	public KbContentRelationModel getKbContentRelationModel() {
		return this.kbContentRelationModel;
	}
	public void setKbContentRelationModel(KbContentRelationModel kbContentRelationModel) {
		this.kbContentRelationModel = kbContentRelationModel;
	}

	public String getOriginalUrl() {
		return this.originalUrl;
	}
	public void setOriginalUrl(String originalUrl) {
		this.originalUrl = originalUrl;
	}

	public String getOutBizId() {
		return this.outBizId;
	}
	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getSubTilte() {
		return this.subTilte;
	}
	public void setSubTilte(String subTilte) {
		this.subTilte = subTilte;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
