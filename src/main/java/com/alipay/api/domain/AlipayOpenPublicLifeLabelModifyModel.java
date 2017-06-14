package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签修改接口
 *
 * @author auto create
 * @since 1.0, 2017-03-30 16:20:33
 */
public class AlipayOpenPublicLifeLabelModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4445162159247464174L;

	/**
	 * 标签id，调用创建标签接口后由支付宝返回
	 */
	@ApiField("label_id")
	private Long labelId;

	/**
	 * 标签名
	 */
	@ApiField("label_name")
	private String labelName;

	public Long getLabelId() {
		return this.labelId;
	}
	public void setLabelId(Long labelId) {
		this.labelId = labelId;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

}
