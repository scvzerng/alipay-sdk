package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsProduct;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.marketing.product.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-09 16:08:37
 */
public class AlipayInsMarketingProductRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 7589678666345959612L;

	/** 
	 * 产品列表
	 */
	@ApiListField("products")
	@ApiField("ins_product")
	private List<InsProduct> products;

	public void setProducts(List<InsProduct> products) {
		this.products = products;
	}
	public List<InsProduct> getProducts( ) {
		return this.products;
	}

}
