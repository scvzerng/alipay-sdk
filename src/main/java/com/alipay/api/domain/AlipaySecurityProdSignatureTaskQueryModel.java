package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝可信电子签名结果查询
 *
 * @author auto create
 * @since 1.0, 2017-04-10 15:42:19
 */
public class AlipaySecurityProdSignatureTaskQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8853242595132139219L;

	/**
	 * 业务流水号，与初始化接口保持一致
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 接口协议版本，目前取值"1"
	 */
	@ApiField("s_version")
	private String sVersion;

	/**
	 * 签约任务编号，与初始化返回参数一致。
	 */
	@ApiField("task_id")
	private String taskId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getsVersion() {
		return this.sVersion;
	}
	public void setsVersion(String sVersion) {
		this.sVersion = sVersion;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

}
