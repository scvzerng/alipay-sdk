package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ssdata.dataservice.risk.digitalidentity.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-21 10:28:09
 */
public class SsdataDataserviceRiskDigitalidentityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5134665929278247537L;

	/** 
	 * 设备ID
	 */
	@ApiField("deviceid")
	private String deviceid;

	/** 
	 * 是否模拟器登陆
	 */
	@ApiField("emulator")
	private Boolean emulator;

	/** 
	 * 调用订单号
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public void setDeviceid(String deviceid) {
		this.deviceid = deviceid;
	}
	public String getDeviceid( ) {
		return this.deviceid;
	}

	public void setEmulator(Boolean emulator) {
		this.emulator = emulator;
	}
	public Boolean getEmulator( ) {
		return this.emulator;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getUniqueId( ) {
		return this.uniqueId;
	}

}
