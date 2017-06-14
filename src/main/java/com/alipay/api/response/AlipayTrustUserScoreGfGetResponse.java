package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GfResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.score.gf.get response.
 * 
 * @author auto create
 * @since 1.0, 2017-01-20 16:39:06
 */
public class AlipayTrustUserScoreGfGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 5229246482677266551L;

	/** 
	 * 结果集合
	 */
	@ApiListField("gf_list")
	@ApiField("gf_result")
	private List<GfResult> gfList;

	public void setGfList(List<GfResult> gfList) {
		this.gfList = gfList;
	}
	public List<GfResult> getGfList( ) {
		return this.gfList;
	}

}
