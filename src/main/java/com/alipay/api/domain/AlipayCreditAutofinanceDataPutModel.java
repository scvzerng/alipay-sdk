package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车金融订单相关数据更新
 *
 * @author auto create
 * @since 1.0, 2016-09-14 10:06:33
 */
public class AlipayCreditAutofinanceDataPutModel extends AlipayObject {

	private static final long serialVersionUID = 5338259194655393771L;

	/**
	 * 当用户在页面需要撤销原来的订单时，需要调用汽车金融平台将这里的订单也同步撤销，只要订单没有放款成功，都可以撤销。
	 */
	@ApiField("action")
	private String action;

	/**
	 * 更新订单需要的数据
	 */
	@ApiField("requstjson")
	private String requstjson;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getRequstjson() {
		return this.requstjson;
	}
	public void setRequstjson(String requstjson) {
		this.requstjson = requstjson;
	}

}
