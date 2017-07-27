package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 系统商通过该接口可以查询所有门店的外部门店编号（系统商的门店编号）
 *
 * @author auto create
 * @since 1.0, 2017-02-07 16:47:19
 */@ApiModel(description = " 系统商通过该接口可以查询所有门店的外部门店编号（系统商的门店编号）")
public class AlipayOfflineMarketShopBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8591238187931592579L;

	/**
	 * 页码，第一页传入"1"，默认500个结果为一页。此参数必须是大于0的正整数，为0时将查询报错。
	 */@JSONField(name = "page_no", alternateNames = "pageNo")
	@ApiModelProperty(notes = " 页码，第一页传入'1'，默认500个结果为一页。此参数必须是大于0的正整数，为0时将查询报错。")
	@NotNull
	private String pageNo;

	public String getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}

}
