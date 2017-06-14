package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝可信电子签名申请
 *
 * @author auto create
 * @since 1.0, 2017-04-10 19:39:51
 */
public class AlipaySecurityProdSignatureTaskApplyModel extends AlipayObject {

	private static final long serialVersionUID = 8276927591165399862L;

	/**
	 * 应用名称
	 */
	@ApiField("biz_app")
	private String bizApp;

	/**
	 * 业务扩展参数，JSON格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 业务流水号，保证唯一性
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务唯一标识，由支付宝统一分配
	 */
	@ApiField("biz_product")
	private String bizProduct;

	/**
	 * 客户端回调方式。
1）H5_CB_APP，支付宝签约流程由H5实现，回调支付宝钱包以外的App
	 */
	@ApiField("cb_type")
	private String cbType;

	/**
	 * 回调外部业务系统的地址
	 */
	@ApiField("cb_url")
	private String cbUrl;

	/**
	 * 签约用户信息，JSON格式。格式：{"name":"用户姓名","certNo":"身份证号", "type":"认证类型"}
参数type：
  1） individual  | 解释：个人
  2） entreprise  | 解释：企业
	 */
	@ApiField("outer_info")
	private String outerInfo;

	/**
	 * 接口版本信息，目前传入"1"
	 */
	@ApiField("s_version")
	private String sVersion;

	/**
	 * 待签名文档列表，JSON格式。数据格式：
[{签名数据信息},{签名数据信息},{签名数据信息}]

参数data_type: 
 1）DATA | 解释：原文模式, source_data不为空
 2）FILE | 解释：文件索引，oss_file_id,oss_bucket_name不为空
	 */
	@ApiField("sign_data_list")
	private String signDataList;

	/**
	 * 引导页文档信息，JSON格式。
数据格式：
{"guide_tip":"说明提醒文案","group_list":"[{签约组信息},{签约组信息}]"}
签约组信息数据格式：
{"group_title":"签约组名1", "file_list" :[{"file_name":"协议名","file_url":"协议预览地址"}]}
	 */
	@ApiField("sign_guide_info")
	private String signGuideInfo;

	public String getBizApp() {
		return this.bizApp;
	}
	public void setBizApp(String bizApp) {
		this.bizApp = bizApp;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizProduct() {
		return this.bizProduct;
	}
	public void setBizProduct(String bizProduct) {
		this.bizProduct = bizProduct;
	}

	public String getCbType() {
		return this.cbType;
	}
	public void setCbType(String cbType) {
		this.cbType = cbType;
	}

	public String getCbUrl() {
		return this.cbUrl;
	}
	public void setCbUrl(String cbUrl) {
		this.cbUrl = cbUrl;
	}

	public String getOuterInfo() {
		return this.outerInfo;
	}
	public void setOuterInfo(String outerInfo) {
		this.outerInfo = outerInfo;
	}

	public String getsVersion() {
		return this.sVersion;
	}
	public void setsVersion(String sVersion) {
		this.sVersion = sVersion;
	}

	public String getSignDataList() {
		return this.signDataList;
	}
	public void setSignDataList(String signDataList) {
		this.signDataList = signDataList;
	}

	public String getSignGuideInfo() {
		return this.signGuideInfo;
	}
	public void setSignGuideInfo(String signGuideInfo) {
		this.signGuideInfo = signGuideInfo;
	}

}
