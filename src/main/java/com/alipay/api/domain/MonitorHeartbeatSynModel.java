package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 通过同步商户终端信息，保障商户收银效果。
 *
 * @author auto create
 * @since 1.0, 2016-02-25 19:40:04
 */
public class MonitorHeartbeatSynModel extends AlipayObject {

	private static final long serialVersionUID = 7126814235741524156L;

	/**
	 * 发送心跳的设备ID，发起方为收银机，则为收银机设备的ID，设备ID最短长度6位；如没有设备ID，可填MAC地址
	 */
	@ApiField("equipment_id")
	private String equipmentId;

	/**
	 * 发送心跳时的设备状态：
10——开机/开启收银软件；
20——关机/关闭收银软件；
30——正常
	 */
	@ApiField("equipment_status")
	private String equipmentStatus;

	/**
	 * 心跳时间段内的机具异常原因，如有多个用“|”分隔。
HE_PRINTER——打印机异常；
HE_SCANER——扫描枪异常；
HE_OTHER——其他硬件异常
	 */
	@ApiField("exception_info")
	private String exceptionInfo;

	/**
	 * 扩展信息，心跳信息发送方自定义，json格式
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * Mac地址
	 */
	@ApiField("mac")
	private String mac;

	/**
	 * pos设备连接的网络类型：2G、3G、WIFI、LAN。 LAN：有线网络
	 */
	@ApiField("network_type")
	private String networkType;

	/**
	 * 发送心跳的设备所依赖的支付宝产品，发送心跳的设备所依赖的支付宝产品，目前仅支持FP：当面付产品
	 */
	@ApiField("product")
	private String product;

	/**
	 * 门店ID。需要和交易接口中的门店ID保持一致。 如无门店ID，请填“DF”
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 系统商编号
	 */
	@ApiField("sys_service_provider_id")
	private String sysServiceProviderId;

	/**
	 * 产生心跳的时间，格式为：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time")
	private String time;

	/**
	 * 两次心跳时间内的交易相关信息。包括期间所有交易的商户订单号、耗时和状态。最多发送前30笔交易信息。json格式，具体参见下面的“交易性能信息参数说明”。
多笔交易按时间顺序直接拼接。
如果由于网络等原因心跳发送失败，则该交易性能信息本地继续累积，直到有心跳发送成功后，本地数据才可以清除。
此数据非常重要，有交易则必填，无交易可传空
	 */
	@ApiField("trade_info")
	private String tradeInfo;

	/**
	 * 发送心跳的设备类型：
CR——收银机；
STORE——门店；
VM——售卖
	 */
	@ApiField("type")
	private String type;

	public String getEquipmentId() {
		return this.equipmentId;
	}
	public void setEquipmentId(String equipmentId) {
		this.equipmentId = equipmentId;
	}

	public String getEquipmentStatus() {
		return this.equipmentStatus;
	}
	public void setEquipmentStatus(String equipmentStatus) {
		this.equipmentStatus = equipmentStatus;
	}

	public String getExceptionInfo() {
		return this.exceptionInfo;
	}
	public void setExceptionInfo(String exceptionInfo) {
		this.exceptionInfo = exceptionInfo;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getMac() {
		return this.mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getNetworkType() {
		return this.networkType;
	}
	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getProduct() {
		return this.product;
	}
	public void setProduct(String product) {
		this.product = product;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getSysServiceProviderId() {
		return this.sysServiceProviderId;
	}
	public void setSysServiceProviderId(String sysServiceProviderId) {
		this.sysServiceProviderId = sysServiceProviderId;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String getTradeInfo() {
		return this.tradeInfo;
	}
	public void setTradeInfo(String tradeInfo) {
		this.tradeInfo = tradeInfo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
