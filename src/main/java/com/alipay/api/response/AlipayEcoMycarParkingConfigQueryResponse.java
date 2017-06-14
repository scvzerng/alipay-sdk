package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterfaceInfoList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.config.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-03-02 18:18:47
 */
public class AlipayEcoMycarParkingConfigQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3799936515645252157L;

	/** 
	 * 签约支付宝账号
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 业务接口列表数据
Json格式数据
	 */
	@ApiField("interface_info_list")
	private InterfaceInfoList interfaceInfoList;

	/** 
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/** 
	 * 商户客服电话
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setInterfaceInfoList(InterfaceInfoList interfaceInfoList) {
		this.interfaceInfoList = interfaceInfoList;
	}
	public InterfaceInfoList getInterfaceInfoList( ) {
		return this.interfaceInfoList;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getMerchantName( ) {
		return this.merchantName;
	}

	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}
	public String getMerchantServicePhone( ) {
		return this.merchantServicePhone;
	}

}
