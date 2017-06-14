package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 广告商品采购
 *
 * @author auto create
 * @since 1.0, 2017-01-06 11:17:48
 */
public class KoubeiAdvertDeliveryDiscountReceiveModel extends AlipayObject {

	private static final long serialVersionUID = 7545766861348921914L;

	/**
	 * 渠道信息，比如微博:weibo，具体值需要找对应业务申请
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 获取的优惠id
	 */
	@ApiListField("discount_id")
	@ApiField("string")
	private List<String> discountId;

	/**
	 * 优惠类型，ITEM:商品
	 */
	@ApiField("discount_type")
	private String discountType;

	/**
	 * 外部流水号，用于标识此次请求
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<String> getDiscountId() {
		return this.discountId;
	}
	public void setDiscountId(List<String> discountId) {
		this.discountId = discountId;
	}

	public String getDiscountType() {
		return this.discountType;
	}
	public void setDiscountType(String discountType) {
		this.discountType = discountType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
