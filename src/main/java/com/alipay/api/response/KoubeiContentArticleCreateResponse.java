package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.content.article.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-11 20:18:15
 */
public class KoubeiContentArticleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8352871975641755961L;

	/** 
	 * 新创建的达人说文章id
	 */
	@ApiField("article_id")
	private String articleId;

	public void setArticleId(String articleId) {
		this.articleId = articleId;
	}
	public String getArticleId( ) {
		return this.articleId;
	}

}
