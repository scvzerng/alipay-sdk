package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.comment.add response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-07 14:25:43
 */
public class AlipaySocialBaseMcommentCommentAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 4236727435181715564L;

	/** 
	 * 发表成功后生成的评论ID
	 */
	@ApiField("comment_id")
	private String commentId;

	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getCommentId( ) {
		return this.commentId;
	}

}
