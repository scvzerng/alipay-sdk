package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 招商pid和pid对应的门第列表
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
public class PidShopInfo extends AlipayObject {

	private static final long serialVersionUID = 7384464747556955379L;

	/**
	 * 商户pid
	 */
	private String pid;

	/**
	 * pid下的门店列表
	 */@JSONField(name = "shop_ids", alternateNames = "shopIds")
	private List<String> shopIds;

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public List<String> getShopIds() {
		return this.shopIds;
	}
	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}

}
