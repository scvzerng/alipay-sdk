package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 口碑广告投放券商品输出接口
 *
 * @author auto create
 * @since 1.0, 2017-01-06 11:33:44
 */
public class KoubeiAdvertDeliveryDiscountBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1891963379484493887L;

	/**
	 * 媒体编号，使用前需要找业务申请
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 城市国标码，比如310000是上海
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * Ip地址
	 */
	@ApiField("ip")
	private String ip;

	/**
	 * 纬度
	 */
	@ApiField("latitude")
	private String latitude;

	/**
	 * 经度
	 */
	@ApiField("longitude")
	private String longitude;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getIp() {
		return this.ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLatitude() {
		return this.latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
