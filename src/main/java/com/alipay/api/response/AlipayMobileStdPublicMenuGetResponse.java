package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.std.public.menu.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-05-06 17:16:45
 */
public class AlipayMobileStdPublicMenuGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3127856522476788698L;

	/** 
	 * 菜单内容
	 */
	@ApiField("menu_content")
	private String menuContent;

	public void setMenuContent(String menuContent) {
		this.menuContent = menuContent;
	}
	public String getMenuContent( ) {
		return this.menuContent;
	}

}
