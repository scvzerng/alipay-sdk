package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.data.auto.score.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-01 17:49:45
 */
public class AlipayInsDataAutoScoreQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8181722344541761284L;

	/** 
	 * 唯一流水号，调用方应持久化本字段
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 扩展信息，标准JSON格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 车险分
	 */
	@ApiField("score")
	private Long score;

	/** 
	 * 请求发起时通过程序生成并传递UUID，调用方应持久化本字段
	 */
	@ApiField("uuid")
	private String uuid;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setScore(Long score) {
		this.score = score;
	}
	public Long getScore( ) {
		return this.score;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getUuid( ) {
		return this.uuid;
	}

}
