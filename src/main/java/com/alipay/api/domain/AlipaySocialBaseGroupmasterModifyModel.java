package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 指定用户为群主
 *
 * @author auto create
 * @since 1.0, 2016-07-25 14:29:09
 */
public class AlipaySocialBaseGroupmasterModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2764932892469362199L;

	/**
	 * 群id
	 */
	@ApiField("group_id")
	private String groupId;

	/**
	 * 用户的userid
	 */
	@ApiField("user_id")
	private String userId;

	public String getGroupId() {
		return this.groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
