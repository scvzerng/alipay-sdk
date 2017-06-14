package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * lingsanerjiu dsafdsafdsaf
 *
 * @author auto create
 * @since 1.0, 2017-03-29 22:15:21
 */
public class Lingsanerjiu extends AlipayObject {

	private static final long serialVersionUID = 5341424877453799676L;

	/**
	 * adfadsf
	 */
	@ApiField("dfasfdsaf")
	private String dfasfdsaf;

	/**
	 * lingsanerjiu
	 */
	@ApiListField("lingsanerjiu")
	@ApiField("string")
	private List<String> lingsanerjiu;

	public String getDfasfdsaf() {
		return this.dfasfdsaf;
	}
	public void setDfasfdsaf(String dfasfdsaf) {
		this.dfasfdsaf = dfasfdsaf;
	}

	public List<String> getLingsanerjiu() {
		return this.lingsanerjiu;
	}
	public void setLingsanerjiu(List<String> lingsanerjiu) {
		this.lingsanerjiu = lingsanerjiu;
	}

}
