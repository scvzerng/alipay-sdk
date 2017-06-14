package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.MaintainVehicleInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dataservice.maintainvehicle.share response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-06 19:58:10
 */
public class AlipayEcoMycarDataserviceMaintainvehicleShareResponse extends AlipayResponse {

	private static final long serialVersionUID = 4376862169565584373L;

	/** 
	 * 车辆详细信息
	 */
	@ApiField("info")
	private MaintainVehicleInfo info;

	public void setInfo(MaintainVehicleInfo info) {
		this.info = info;
	}
	public MaintainVehicleInfo getInfo( ) {
		return this.info;
	}

}
