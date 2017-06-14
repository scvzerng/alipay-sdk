package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 调查的数据项详情
 *
 * @author auto create
 * @since 1.0, 2016-12-16 18:07:17
 */
public class InvestigCategoryData extends AlipayObject {

	private static final long serialVersionUID = 2392662227835815736L;

	/**
	 * 数据项
	 */
	@ApiField("category")
	private String category;

	/**
	 * 实体code
	 */
	@ApiField("entity_code")
	private String entityCode;

	/**
	 * 实体名
	 */
	@ApiField("entity_name")
	private String entityName;

	/**
	 * 实体类别
	 */
	@ApiField("entity_type")
	private String entityType;

	/**
	 * 征信模型结果,以JSON格式输出，包括征信评分creditScore、不准入原因refuseReasons、模型标识码modelIdCode三个字段
	 */
	@ApiField("model_result_object")
	private String modelResultObject;

	/**
	 * 采集状态
	 */
	@ApiField("state")
	private String state;

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getEntityCode() {
		return this.entityCode;
	}
	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntityName() {
		return this.entityName;
	}
	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityType() {
		return this.entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public String getModelResultObject() {
		return this.modelResultObject;
	}
	public void setModelResultObject(String modelResultObject) {
		this.modelResultObject = modelResultObject;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

}
