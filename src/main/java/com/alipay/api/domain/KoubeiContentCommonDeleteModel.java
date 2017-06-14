package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 内容删除接口
 *
 * @author auto create
 * @since 1.0, 2017-04-05 17:52:51
 */
public class KoubeiContentCommonDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 2261915583732633955L;

	/**
	 * 待删除内容的ID
	 */
	@ApiField("content_id")
	private String contentId;

	/**
	 * 删除内容原因，非必填
	 */
	@ApiField("memo")
	private String memo;

	public String getContentId() {
		return this.contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

}
