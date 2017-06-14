package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iyuoiuyuiyi
 *
 * @author auto create
 * @since 1.0, 2017-03-21 15:48:28
 */
public class AlipaySecurityProdTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6162559232489174133L;

	/**
	 * 我是之旋测试用的，不用填写
	 */
	@ApiField("image_type")
	private AAATest imageType;

	public AAATest getImageType() {
		return this.imageType;
	}
	public void setImageType(AAATest imageType) {
		this.imageType = imageType;
	}

}
