package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 扩展性参数
 *
 * @author auto create
 * @since 1.0, 2017-04-06 20:27:33
 */
public class ExtData extends AlipayObject {

	private static final long serialVersionUID = 1494688222279843585L;

	/**
	 * 接入平台账号的user_id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * Lbs信息
	 */
	@ApiField("lbs_info")
	private LbsInfo lbsInfo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public LbsInfo getLbsInfo() {
		return this.lbsInfo;
	}
	public void setLbsInfo(LbsInfo lbsInfo) {
		this.lbsInfo = lbsInfo;
	}

}
