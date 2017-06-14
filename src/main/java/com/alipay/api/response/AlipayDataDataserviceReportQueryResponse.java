package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.report.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-04-13 15:59:05
 */
public class AlipayDataDataserviceReportQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1655371558381619254L;

	/** 
	 * 返回的报表数据，json格式
	 */
	@ApiField("report_data")
	private String reportData;

	public void setReportData(String reportData) {
		this.reportData = reportData;
	}
	public String getReportData( ) {
		return this.reportData;
	}

}
