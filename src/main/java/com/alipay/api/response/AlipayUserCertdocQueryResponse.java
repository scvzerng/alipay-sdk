package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlipayUserCertDocDrivingLicense;
import com.alipay.api.domain.AlipayUserCertDocVehicleLicense;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.certdoc.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-13 10:25:16
 */
public class AlipayUserCertdocQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5582714674743751592L;

	/** 
	 * 驾驶证信息
	 */
	@ApiField("driving_license")
	private AlipayUserCertDocDrivingLicense drivingLicense;

	/** 
	 * 行驶证信息
	 */
	@ApiListField("vehicle_license_list")
	@ApiField("alipay_user_cert_doc_vehicle_license")
	private List<AlipayUserCertDocVehicleLicense> vehicleLicenseList;

	public void setDrivingLicense(AlipayUserCertDocDrivingLicense drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	public AlipayUserCertDocDrivingLicense getDrivingLicense( ) {
		return this.drivingLicense;
	}

	public void setVehicleLicenseList(List<AlipayUserCertDocVehicleLicense> vehicleLicenseList) {
		this.vehicleLicenseList = vehicleLicenseList;
	}
	public List<AlipayUserCertDocVehicleLicense> getVehicleLicenseList( ) {
		return this.vehicleLicenseList;
	}

}
