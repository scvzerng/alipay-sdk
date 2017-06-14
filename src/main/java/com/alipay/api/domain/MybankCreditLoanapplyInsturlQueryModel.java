package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构跳转链接查询接口
 *
 * @author auto create
 * @since 1.0, 2017-04-10 14:59:11
 */
public class MybankCreditLoanapplyInsturlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5383595988664435657L;

	/**
	 * 机构合约编号，商户接入企业信贷业务时自动分配，具体可询问业务接口人；
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 参数值为：Dsd、Ptd；Dsd为大数据贷款类型，Ptd为平台贷款类型；具体需要可以咨询业务接口人；
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 机构内部客户身份证号，当biz_type为Dsd时，cert_no +user_name或者user_id不能同时为null；
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 机构客群标签，由业务接口人提供；仅当arrangement_no不存在的时候，此值可以为空；
	 */
	@ApiField("cust_group_code")
	private String custGroupCode;

	/**
	 * 机构内部客户工商注册号；
	 */
	@ApiField("ext_business_license_no")
	private String extBusinessLicenseNo;

	/**
	 * 机构用户ID，机构须保证编号唯一；
	 */
	@ApiField("ext_user_id")
	private String extUserId;

	/**
	 * 机构内部客户手机号，如果没有，默认值为11位0；
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 运营产品编码，由业务接口人提供；仅当arrangement_no不存在的时候，此值可以为空；
	 */
	@ApiField("op_pd_code")
	private String opPdCode;

	/**
	 * 跳转链接的类型：scheme、landing；scheme为支付宝扫码跳转链接，landing为外部App跳转链接；
	 */
	@ApiField("url_type")
	private String urlType;

	/**
	 * 机构内部客户的支付宝ID，当biz_type为Dsd时，cert_no +user_name或者user_id不能同时为null；
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 机构内部客户姓名，当biz_type为Dsd时，cert_no + user_name或者user_id不能同时为null；
	 */
	@ApiField("user_name")
	private String userName;

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCustGroupCode() {
		return this.custGroupCode;
	}
	public void setCustGroupCode(String custGroupCode) {
		this.custGroupCode = custGroupCode;
	}

	public String getExtBusinessLicenseNo() {
		return this.extBusinessLicenseNo;
	}
	public void setExtBusinessLicenseNo(String extBusinessLicenseNo) {
		this.extBusinessLicenseNo = extBusinessLicenseNo;
	}

	public String getExtUserId() {
		return this.extUserId;
	}
	public void setExtUserId(String extUserId) {
		this.extUserId = extUserId;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpPdCode() {
		return this.opPdCode;
	}
	public void setOpPdCode(String opPdCode) {
		this.opPdCode = opPdCode;
	}

	public String getUrlType() {
		return this.urlType;
	}
	public void setUrlType(String urlType) {
		this.urlType = urlType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
