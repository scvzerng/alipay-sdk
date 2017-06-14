package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.RiskRankInfoCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.mobilerisk.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-07-06 10:46:05
 */
public class AlipaySecurityRiskMobileriskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2113389747383145196L;

	/** 
	 * 是否有风险
	 */
	@ApiField("has_risk")
	private String hasRisk;

	/** 
	 * 返回本次模型的infocode
	 */
	@ApiField("info_code")
	private RiskRankInfoCode infoCode;

	/** 
	 * 风险等级
	 */
	@ApiField("risk_rank")
	private Long riskRank;

	/** 
	 * 风险分数
	 */
	@ApiField("risk_score")
	private Long riskScore;

	public void setHasRisk(String hasRisk) {
		this.hasRisk = hasRisk;
	}
	public String getHasRisk( ) {
		return this.hasRisk;
	}

	public void setInfoCode(RiskRankInfoCode infoCode) {
		this.infoCode = infoCode;
	}
	public RiskRankInfoCode getInfoCode( ) {
		return this.infoCode;
	}

	public void setRiskRank(Long riskRank) {
		this.riskRank = riskRank;
	}
	public Long getRiskRank( ) {
		return this.riskRank;
	}

	public void setRiskScore(Long riskScore) {
		this.riskScore = riskScore;
	}
	public Long getRiskScore( ) {
		return this.riskScore;
	}

}
