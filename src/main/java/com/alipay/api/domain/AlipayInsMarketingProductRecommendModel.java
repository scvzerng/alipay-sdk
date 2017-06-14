package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保单查询接口
 *
 * @author auto create
 * @since 1.0, 2016-11-09 16:08:37
 */
public class AlipayInsMarketingProductRecommendModel extends AlipayObject {

	private static final long serialVersionUID = 8154858879819974957L;

	/**
	 * 投保人
	 */
	@ApiField("applicant")
	private InsPerson applicant;

	/**
	 * 保险标的
	 */
	@ApiField("ins_object")
	private InsObject insObject;

	/**
	 * 商户生成的外部投保业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 场景编码；识别商户在特定场景下需要的保险产品
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public InsPerson getApplicant() {
		return this.applicant;
	}
	public void setApplicant(InsPerson applicant) {
		this.applicant = applicant;
	}

	public InsObject getInsObject() {
		return this.insObject;
	}
	public void setInsObject(InsObject insObject) {
		this.insObject = insObject;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
