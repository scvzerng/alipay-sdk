package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.prod.signature.task.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-10 15:51:56
 */
public class AlipaySecurityProdSignatureTaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3397762594169592125L;

	/** 
	 * 业务流水号
	 */
	@ApiField("biz_id")
	private String bizId;

	/** 
	 * 签名数据列表，格式：
{[{"sourceType":"数据类型", "fileType":"文档格式"，"outFileId": "外部数据id"," innerFileId": "支付宝内部数据id"," fileName ":"数据名" , " gmtTime ":"创建时间" , "expiredTime":"文档过期时间" ," signedData":"文档签名结果" ,"ossFileId":"签名文件oss_id","ossBucketName":"oss空间"},{..签名数据信息..}]}
参数fileType: 文档格式，例如pdf，pkcs7
参数sourceType: 
 1）DATA | 解释：原文模式
 2）FILE | 解释：文件索引
参数signedData:
1）	签名内容 | 解释：sourceType为DATA时不为空。
	 */
	@ApiField("sign_data_list")
	private String signDataList;

	/** 
	 * 签约结果
1）0 | 解释：签约失败
2）1 | 解释：完成
3）2 | 解释：签约中
4）3 | 解释：任务过期
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 签约任务编号
	 */
	@ApiField("task_id")
	private String taskId;

	public void setBizId(String bizId) {
		this.bizId = bizId;
	}
	public String getBizId( ) {
		return this.bizId;
	}

	public void setSignDataList(String signDataList) {
		this.signDataList = signDataList;
	}
	public String getSignDataList( ) {
		return this.signDataList;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskId( ) {
		return this.taskId;
	}

}
