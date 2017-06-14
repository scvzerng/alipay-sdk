package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdvertDiscount;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-06 11:34:09
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8793626734928177422L;

	/** 
	 * 广告投放出去的商品信息
	 */
	@ApiListField("discounts")
	@ApiField("advert_discount")
	private List<AdvertDiscount> discounts;

	public void setDiscounts(List<AdvertDiscount> discounts) {
		this.discounts = discounts;
	}
	public List<AdvertDiscount> getDiscounts( ) {
		return this.discounts;
	}

}
