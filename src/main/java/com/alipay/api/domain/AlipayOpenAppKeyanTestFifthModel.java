package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 测试接口
 *
 * @author auto create
 * @since 1.0, 2016-11-04 17:17:18
 */
public class AlipayOpenAppKeyanTestFifthModel extends AlipayObject {

	private static final long serialVersionUID = 2312396643753849589L;

	/**
	 * 描述
	 */
	@ApiField("keyan_class")
	private KeyanClass keyanClass;

	/**
	 * test 描述
	 */
	@ApiField("ttttt")
	private String ttttt;

	public KeyanClass getKeyanClass() {
		return this.keyanClass;
	}
	public void setKeyanClass(KeyanClass keyanClass) {
		this.keyanClass = keyanClass;
	}

	public String getTtttt() {
		return this.ttttt;
	}
	public void setTtttt(String ttttt) {
		this.ttttt = ttttt;
	}

}
