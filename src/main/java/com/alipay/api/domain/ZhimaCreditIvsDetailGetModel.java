package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反欺诈信息验证
 *
 * @author auto create
 * @since 1.0, 2016-11-04 18:37:16
 */
public class ZhimaCreditIvsDetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 5624782986111445272L;

	/**
	 * 用户地址。省+市+区/县+详细地址，其中 省+市+区/县可以为空，长度不超过150，不含",","/u0001"
	 */
	@ApiField("address")
	private String address;

	/**
	 * 银行卡号。中国大陆银行发布的银行卡:借记卡长度19位；信用卡长度16位；各位的取值位[0,9]的整数；不含虚拟卡。备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	@ApiField("bank_card")
	private String bankCard;

	/**
	 * 证件号。当前为身份证号，支持所有中国大陆合法身份证号（含15位和18位），最后一位如是字母，保持小写。备注：证件号、姓名、手机号、地址、银行卡、电子邮箱必须传其中两项
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件类型。100为身份证。备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 电子邮箱。合法email，字母小写，特殊符号以半角形式出现。备注：证件号、姓名、手机号、地址、银行卡、电子邮箱必至少传其中两项
	 */
	@ApiField("email")
	private String email;

	/**
	 * 国际移动设备标志，长度为15位的十进制数字串
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 国际移动用户识别码，长度为15位的十进制数字串
	 */
	@ApiField("imsi")
	private String imsi;

	/**
	 * ip地址，以"."分割的四段Ip，如 x.x.x.x，x为[0,255]之间的整数
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 物理地址，支持格式如下：xx:xx:xx:xx:xx:xx，xx-xx-xx-xx-xx-xx，xxxxxxxxxxxx，x取值范围[0,9]之间的整数及A，B，C，D，E，F
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * 手机号。中国大陆合法手机号，长度11位，不含国家代码。备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 姓名。备注：证件号、姓名、手机号、地址、银行卡、电子邮箱至少传其中两项
	 */
	@ApiField("name")
	private String name;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 商户请求的唯一标志，64位长度的字母数字下划线组合。该标识作为对账的关键信息，商户要保证其唯一性，对于用户使用相同transaction_id的查询，芝麻在一天（86400秒）内返回首次查询数据，超过有效期的查询即为无效并返回异常，有效期内的重复查询不重新计费。
	 */
	@ApiField("transaction_id")
	private String transactionId;

	/**
	 * wifi的物理地址，支持格式如下：xx:xx:xx:xx:xx:xx，xx-xx-xx-xx-xx-xx，xxxxxxxxxxxx，x取值范围[0,9]之间的整数及A，B，C，D，E，F
	 */
	@ApiField("wifimac")
	private String wifimac;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankCard() {
		return this.bankCard;
	}
	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getImsi() {
		return this.imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTransactionId() {
		return this.transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getWifimac() {
		return this.wifimac;
	}
	public void setWifimac(String wifimac) {
		this.wifimac = wifimac;
	}

}
