package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISP功能测试接口
 *
 * @author auto create
 * @since 1.0, 2016-09-21 23:23:27
 */
public class AlipayOpenAppPackagetestModel extends AlipayObject {

	private static final long serialVersionUID = 1247534855319928525L;

	/**
	 * 123123
	 */
	@ApiField("aasdgasjdasd")
	private String aasdgasjdasd;

	/**
	 * 123
	 */
	@ApiField("testasdasdasd")
	private String testasdasdasd;

	/**
	 * testtest
	 */
	@ApiField("testparam")
	private String testparam;

	/**
	 * 1
	 */
	@ApiField("testparamtestest")
	private String testparamtestest;

	/**
	 * testtest
	 */
	@ApiField("testtest")
	private String testtest;

	public String getAasdgasjdasd() {
		return this.aasdgasjdasd;
	}
	public void setAasdgasjdasd(String aasdgasjdasd) {
		this.aasdgasjdasd = aasdgasjdasd;
	}

	public String getTestasdasdasd() {
		return this.testasdasdasd;
	}
	public void setTestasdasdasd(String testasdasdasd) {
		this.testasdasdasd = testasdasdasd;
	}

	public String getTestparam() {
		return this.testparam;
	}
	public void setTestparam(String testparam) {
		this.testparam = testparam;
	}

	public String getTestparamtestest() {
		return this.testparamtestest;
	}
	public void setTestparamtestest(String testparamtestest) {
		this.testparamtestest = testparamtestest;
	}

	public String getTesttest() {
		return this.testtest;
	}
	public void setTesttest(String testtest) {
		this.testtest = testtest;
	}

}
