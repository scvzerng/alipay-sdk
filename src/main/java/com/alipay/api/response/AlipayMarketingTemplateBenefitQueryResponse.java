package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.McardTemplateBenefit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.template.benefit.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 20:57:43
 */
public class AlipayMarketingTemplateBenefitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6371916871533471451L;

	/** 
	 * 会员卡模板外部权益列表
	 */
	@ApiListField("mcard_template_benefit")
	@ApiField("mcard_template_benefit")
	private List<McardTemplateBenefit> mcardTemplateBenefit;

	public void setMcardTemplateBenefit(List<McardTemplateBenefit> mcardTemplateBenefit) {
		this.mcardTemplateBenefit = mcardTemplateBenefit;
	}
	public List<McardTemplateBenefit> getMcardTemplateBenefit( ) {
		return this.mcardTemplateBenefit;
	}

}
