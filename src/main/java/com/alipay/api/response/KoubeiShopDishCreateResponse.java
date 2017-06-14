package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.dish.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-11 20:18:00
 */
public class KoubeiShopDishCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6855991998842388817L;

	/** 
	 * 创建菜品后生成的ID
	 */
	@ApiField("dish_id")
	private String dishId;

	public void setDishId(String dishId) {
		this.dishId = dishId;
	}
	public String getDishId( ) {
		return this.dishId;
	}

}
