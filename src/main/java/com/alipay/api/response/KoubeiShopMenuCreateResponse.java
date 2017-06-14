package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.shop.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-11 20:17:45
 */
public class KoubeiShopMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1773351995224747753L;

	/** 
	 * 保存后生成的id
	 */
	@ApiField("menu_id")
	private String menuId;

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getMenuId( ) {
		return this.menuId;
	}

}
