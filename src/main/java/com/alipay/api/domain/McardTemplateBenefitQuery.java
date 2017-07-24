package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员卡模板外部权益查询结果模型
 *
 * @author auto create
 * @since 1.0, 2017-04-20 22:02:34
 */
public class McardTemplateBenefitQuery extends AlipayObject {


	/**
	 * 权益描述信息
	 */
	@ApiField("benefit_desc")
	private List<String> benefitDesc;

	/**
	 * 权益ID
	 */
	@ApiField("benefit_id")
	private String benefitId;

	/**
	 * 权益结束时间
	 */
	@ApiField("end_date")
	private Date endDate;

	/**
	 * 会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面
	 */
	@ApiField("ext_info")
	private JSONObject extInfo;

	/**
	 * 权益开始时间
	 */
	@ApiField("start_date")
	private Date startDate;

	/**
	 * 会员卡模板ID
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 权益标题
	 */
	@ApiField("title")
	private String title;

	public List<String> getBenefitDesc() {
		return benefitDesc;
	}

	public void setBenefitDesc(List<String> benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public JSONObject getExtInfo() {
		return extInfo;
	}

	public void setExtInfo(JSONObject extInfo) {
		this.extInfo = extInfo;
	}

	public String getBenefitId() {
		return this.benefitId;
	}
	public void setBenefitId(String benefitId) {
		this.benefitId = benefitId;
	}

	public Date getEndDate() {
		return this.endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public Date getStartDate() {
		return this.startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
