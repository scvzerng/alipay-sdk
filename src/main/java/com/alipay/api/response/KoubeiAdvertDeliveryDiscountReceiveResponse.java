package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.advert.delivery.discount.receive response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-06 11:19:15
 */
public class KoubeiAdvertDeliveryDiscountReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 7812624484145245288L;

	/** 
	 * 优惠发放后的凭证列表
	 */
	@ApiListField("voucher_id")
	@ApiField("string")
	private List<String> voucherId;

	public void setVoucherId(List<String> voucherId) {
		this.voucherId = voucherId;
	}
	public List<String> getVoucherId( ) {
		return this.voucherId;
	}

}
