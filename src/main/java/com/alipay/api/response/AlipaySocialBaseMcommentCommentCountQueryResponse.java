package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommentCountInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.comment.count.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-13 14:35:01
 */
public class AlipaySocialBaseMcommentCommentCountQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4455142819493587758L;

	/** 
	 * 被评论对象的计数信息
	 */
	@ApiListField("count_infos")
	@ApiField("comment_count_info")
	private List<CommentCountInfo> countInfos;

	public void setCountInfos(List<CommentCountInfo> countInfos) {
		this.countInfos = countInfos;
	}
	public List<CommentCountInfo> getCountInfos( ) {
		return this.countInfos;
	}

}
