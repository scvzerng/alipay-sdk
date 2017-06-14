package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.user.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-30 16:52:58
 */
public class AlipayMobileStdPublicMenuUserQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8573819339582792153L;

	/** 
	 * 菜单唯一标识
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
