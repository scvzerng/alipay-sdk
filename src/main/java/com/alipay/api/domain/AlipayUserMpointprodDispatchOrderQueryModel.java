package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员积分发放订单查询
 *
 * @author auto create
 * @since 1.0, 2016-05-23 20:32:11
 */
public class AlipayUserMpointprodDispatchOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2614258173718388956L;

	/**
	 * 消息体内容，JSON格式，不含换行、空格参数:
userId: 支付用户ID, 可以直接传递openId
outBizNo:外部交易订单号
	 */
	@ApiField("biz_content")
	private String bizContent;

	public String getBizContent() {
		return this.bizContent;
	}
	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}

}
