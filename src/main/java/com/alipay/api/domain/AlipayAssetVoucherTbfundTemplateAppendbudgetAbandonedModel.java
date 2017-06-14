package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘宝现金红包模板预算追加
 *
 * @author auto create
 * @since 1.0, 2016-08-30 17:19:22
 */
public class AlipayAssetVoucherTbfundTemplateAppendbudgetAbandonedModel extends AlipayObject {

	private static final long serialVersionUID = 3631938765655438938L;

	/**
	 * 预算追加金额（单位：元）
	 */
	@ApiField("append_amount")
	private String appendAmount;

	/**
	 * 业务幂等ID
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 券模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAppendAmount() {
		return this.appendAmount;
	}
	public void setAppendAmount(String appendAmount) {
		this.appendAmount = appendAmount;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
