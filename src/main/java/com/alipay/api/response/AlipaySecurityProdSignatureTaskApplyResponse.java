package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.apply response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-10 19:40:41
 */
public class AlipaySecurityProdSignatureTaskApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6621123195852873111L;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 无线端，唤起支付宝签约页面app协议地址
	 */
	@ApiField("native_sign_url")
	private String nativeSignUrl;

	/** 
	 * PC端，签约页面入口地址。
	 */
	@ApiField("pc_sign_url")
	private String pcSignUrl;

	/** 
	 * 签名任务流水号
	 */
	@ApiField("task_id")
	private String taskId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setNativeSignUrl(String nativeSignUrl) {
		this.nativeSignUrl = nativeSignUrl;
	}
	public String getNativeSignUrl( ) {
		return this.nativeSignUrl;
	}

	public void setPcSignUrl(String pcSignUrl) {
		this.pcSignUrl = pcSignUrl;
	}
	public String getPcSignUrl( ) {
		return this.pcSignUrl;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
