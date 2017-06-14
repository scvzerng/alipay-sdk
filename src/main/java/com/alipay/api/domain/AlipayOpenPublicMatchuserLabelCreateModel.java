package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 匹配用户标签添加接口
 *
 * @author auto create
 * @since 1.0, 2017-04-03 17:01:46
 */
public class AlipayOpenPublicMatchuserLabelCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4297244868286292439L;

	/**
	 * 标签id，调用创建标签接口会返回label_id
	 */
	@ApiField("label_id")
	private Long labelId;

	/**
	 * 标签值，由开发者自主指定，标签值类型要满足创建标签接口中data_type参数的限定。
	 */
	@ApiField("label_value")
	private String labelValue;

	/**
	 * 支付宝用户匹配器
	 */
	@ApiField("matcher")
	private Matcher matcher;

	public Long getLabelId() {
		return this.labelId;
	}
	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}

	public String getLabelValue() {
		return this.labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}

	public Matcher getMatcher() {
		return this.matcher;
	}
	public void setMatcher(Matcher matcher) {
		this.matcher = matcher;
	}

}
