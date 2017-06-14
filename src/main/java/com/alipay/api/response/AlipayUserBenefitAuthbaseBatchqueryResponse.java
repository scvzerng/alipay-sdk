package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitGradePoint;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.benefit.authbase.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2016-08-12 10:49:52
 */
public class AlipayUserBenefitAuthbaseBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8727491546614844195L;

	/** 
	 * 蚂蚁会员权益配置信息列表
	 */
	@ApiListField("benefit_info_list")
	@ApiField("benefit_grade_point")
	private List<BenefitGradePoint> benefitInfoList;

	public void setBenefitInfoList(List<BenefitGradePoint> benefitInfoList) {
		this.benefitInfoList = benefitInfoList;
	}
	public List<BenefitGradePoint> getBenefitInfoList( ) {
		return this.benefitInfoList;
	}

}
