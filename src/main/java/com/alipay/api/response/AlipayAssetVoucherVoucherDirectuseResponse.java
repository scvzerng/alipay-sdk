package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.voucher.voucher.directuse response.
 * 
 * @author auto create
 * @since 1.0, 2016-03-15 15:20:44
 */
public class AlipayAssetVoucherVoucherDirectuseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6189496425428776893L;

	/** 
	 * 被核销的券id
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}
	public String getVoucherId( ) {
		return this.voucherId;
	}

}
