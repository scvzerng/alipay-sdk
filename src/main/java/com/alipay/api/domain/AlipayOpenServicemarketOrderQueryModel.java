package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 用于服务商回查服务市场订单明细信息
 *
 * @author auto create
 * @since 1.0, 2017-03-01 16:20:58
 */
@ApiModel(description = " 用于服务商回查服务市场订单明细信息")
public class AlipayOpenServicemarketOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7868781215654577436L;

	/**
	 * 商户订单ID号
	 */
	@JSONField(alternateNames = "commodityOrderId", name = "commodity_order_id")
	@ApiModelProperty(notes = " 商户订单ID号")
	@NotNull(message = "商户订单id号不能为空")
	private String commodityOrderId;

	/**
	 * 从第几页开始查询
	 */
	@JSONField(alternateNames = "startPage", name = "start_page")
	@ApiModelProperty(notes = " 从第几页开始查询")
	@NotNull(message = "开始页不能为空")
	private Integer startPage;

	public String getCommodityOrderId() {
		return this.commodityOrderId;
	}
	public void setCommodityOrderId(String commodityOrderId) {
		this.commodityOrderId = commodityOrderId;
	}

	public Integer getStartPage() {
		return startPage;
	}

	public void setStartPage(Integer startPage) {
		this.startPage = startPage;
	}
}
