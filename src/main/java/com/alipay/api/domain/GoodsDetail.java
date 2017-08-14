package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 商品列表信息
 *
 * @author auto create
 * @since 1.0, 2017-04-10 14:29:41
 */@ApiModel(description = " 商品列表信息")
public class GoodsDetail extends AlipayObject {

	private static final long serialVersionUID = 7531875718858832449L;

	/**
	 * 支付宝定义的统一商品编号
	 */@JSONField(name = "alipay_goods_id", alternateNames = "alipayGoodsId")@ApiModelProperty(notes = " 支付宝定义的统一商品编号")
	private String alipayGoodsId;

	/**
	 * 商品描述信息
	 */@ApiModelProperty(notes = " 商品描述信息")
	private String body;

	/**
	 * 商品类目
	 */@JSONField(name = "goods_category", alternateNames = "goodsCategory")@ApiModelProperty(notes = " 商品类目")
	private String goodsCategory;

	/**
	 * 商品的编号
	 */@JSONField(name = "goods_id", alternateNames = "goodsId")@ApiModelProperty(notes = " 商品的编号")
	private String goodsId;

	/**
	 * 商品名称
	 */@JSONField(name = "goods_name", alternateNames = "goodsName")@ApiModelProperty(notes = " 商品名称")
	private String goodsName;

	/**
	 * 商品单价，单位为元
	 */@ApiModelProperty(notes = " 商品单价，单位为元")
	private String price;

	/**
	 * 商品数量
	 */@ApiModelProperty(notes = " 商品数量")
	private Long quantity;

	/**
	 * 商品的展示地址
	 */@JSONField(name = "show_url", alternateNames = "showUrl")@ApiModelProperty(notes = " 商品的展示地址")
	private String showUrl;

	public String getAlipayGoodsId() {
		return this.alipayGoodsId;
	}
	public void setAlipayGoodsId(String alipayGoodsId) {
		this.alipayGoodsId = alipayGoodsId;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getGoodsCategory() {
		return this.goodsCategory;
	}
	public void setGoodsCategory(String goodsCategory) {
		this.goodsCategory = goodsCategory;
	}

	public String getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getShowUrl() {
		return this.showUrl;
	}
	public void setShowUrl(String showUrl) {
		this.showUrl = showUrl;
	}

}
