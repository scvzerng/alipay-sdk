package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.data.mall.yu.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:13:27
 */
public class KoubeiMarketingDataMallYuQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3874117494311659793L;

	/** 
	 * 查询结果
	 */
	@ApiField("data_info")
	private String dataInfo;

	public void setDataInfo(String dataInfo) {
		this.dataInfo = dataInfo;
	}
	public String getDataInfo( ) {
		return this.dataInfo;
	}

}
