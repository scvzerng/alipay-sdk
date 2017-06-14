package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OverseaSampleResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.acquire.order.sample response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-12 17:30:59
 */
public class AlipayOverseasAcquireOrderSampleResponse extends AlipayResponse {

	private static final long serialVersionUID = 7526579281547844657L;

	/** 
	 * 结果
	 */
	@ApiField("sample_result")
	private OverseaSampleResult sampleResult;

	public void setSampleResult(OverseaSampleResult sampleResult) {
		this.sampleResult = sampleResult;
	}
	public OverseaSampleResult getSampleResult( ) {
		return this.sampleResult;
	}

}
