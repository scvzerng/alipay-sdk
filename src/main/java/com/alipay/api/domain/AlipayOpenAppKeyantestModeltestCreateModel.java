package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 克言测试接口
 *
 * @author auto create
 * @since 1.0, 2017-03-15 15:52:24
 */
public class AlipayOpenAppKeyantestModeltestCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3465616147112159935L;

	/**
	 * 1
	 */
	@ApiField("xwb")
	private InfoCode xwb;

	public InfoCode getXwb() {
		return this.xwb;
	}
	public void setXwb(InfoCode xwb) {
		this.xwb = xwb;
	}

}
