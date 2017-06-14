package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ecapiprod.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2015-04-02 10:15:10
 */
public class AlipayEcapiprodFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2291315828968517265L;

	/** 
	 * oss bucket name
	 */
	@ApiField("oss_bucket")
	private String ossBucket;

	/** 
	 * oss path
	 */
	@ApiField("oss_path")
	private String ossPath;

	public void setOssBucket(String ossBucket) {
		this.ossBucket = ossBucket;
	}
	public String getOssBucket( ) {
		return this.ossBucket;
	}

	public void setOssPath(String ossPath) {
		this.ossPath = ossPath;
	}
	public String getOssPath( ) {
		return this.ossPath;
	}

}
