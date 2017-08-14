package com.alipay.api.response;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.count response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 17:14:41
 */
public class KoubeiMarketingCampaignCrowdCountResponse extends AlipayResponse {

	private static final long serialVersionUID = 6879667566881174714L;

	/** 
	 * 各个细分维度的值，label为标签code，value为该标签各个标签值对应的统计信息，本示例表示pam_gender这个标签的男有100人，女有1000人满足入参指定的圈人条件
	 */
	@ApiField("dimension_values")
	private List<Dimension> dimensionValues;

	/** 
	 * 人群组的汇总统计值total是人数，sum是交易金额
	 */
	@ApiField("summary_values")
	private Summary summaryValues;

	public List<Dimension> getDimensionValues() {
		return dimensionValues;
	}

	public void setDimensionValues(List<Dimension> dimensionValues) {
		this.dimensionValues = dimensionValues;
	}

	public Summary getSummaryValues() {
		return summaryValues;
	}

	public void setSummaryValues(Summary summaryValues) {
		this.summaryValues = summaryValues;
	}

	/**
	 * 人群组的汇总统计结果
	 */
	public static class Summary implements Serializable{
		private BigDecimal sum;
		private Integer total;

		public BigDecimal getSum() {
			return sum;
		}

		public void setSum(BigDecimal sum) {
			this.sum = sum;
		}

		public Integer getTotal() {
			return total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}
	}

	public static class Dimension implements Serializable{
		private String lalel;
		private JSONObject value;

		public String getLalel() {
			return lalel;
		}

		public void setLalel(String lalel) {
			this.lalel = lalel;
		}

		public JSONObject getValue() {
			return value;
		}

		public void setValue(JSONObject value) {
			this.value = value;
		}
	}
}
