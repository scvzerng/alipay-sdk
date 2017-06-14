package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租房平台临时接口
 *
 * @author auto create
 * @since 1.0, 2017-04-07 15:34:19
 */
public class AlipayEcoCplifeTempUploadModel extends AlipayObject {

	private static final long serialVersionUID = 5591715213342428612L;

	/**
	 * 城市代码
	 */
	@ApiField("city")
	private String city;

	/**
	 * 123
	 */
	@ApiField("name")
	private String name;

	/**
	 * 数值
	 */
	@ApiField("value")
	private Long value;

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Long getValue() {
		return this.value;
	}
	public void setValue(Long value) {
		this.value = value;
	}

}
