package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑内容关联对象，包括城市、店铺、标签等。
 *
 * @author auto create
 * @since 1.0, 2017-04-05 17:47:00
 */
public class KbContentRelationModel extends AlipayObject {

	private static final long serialVersionUID = 4447477789367255115L;

	/**
	 * 内容关联的城市列表。注意：城市ID必须是口碑内容的城市ID，外部系统如需使用，请先设置映射。
	 */
	@ApiListField("city_list")
	@ApiField("string")
	private List<String> cityList;

	/**
	 * 内容关联标签列表
	 */
	@ApiListField("feature_list")
	@ApiField("string")
	private List<String> featureList;

	/**
	 * 内容关联店铺列表。注意：店铺ID必须是口碑内部店铺ID，外部系统如需使用，请先设置映射。
	 */
	@ApiListField("shop_list")
	@ApiField("string")
	private List<String> shopList;

	public List<String> getCityList() {
		return this.cityList;
	}
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}

	public List<String> getFeatureList() {
		return this.featureList;
	}
	public void setFeatureList(List<String> featureList) {
		this.featureList = featureList;
	}

	public List<String> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<String> shopList) {
		this.shopList = shopList;
	}

}
