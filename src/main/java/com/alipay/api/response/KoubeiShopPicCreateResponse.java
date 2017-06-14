package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.pic.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-11 20:18:20
 */
public class KoubeiShopPicCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2625575161329927499L;

	/** 
	 * 新创建的店铺图片id
	 */
	@ApiField("shop_pic_id")
	private String shopPicId;

	public void setShopPicId(String shopPicId) {
		this.shopPicId = shopPicId;
	}
	public String getShopPicId( ) {
		return this.shopPicId;
	}

}
