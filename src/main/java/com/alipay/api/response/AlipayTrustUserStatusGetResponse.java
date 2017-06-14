package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trust.user.status.get response.
 * 
 * @author auto create
 * @since 1.0, 2015-02-06 13:11:14
 */
public class AlipayTrustUserStatusGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 3329653577747947766L;

	/** 
	 * 短信授权时间
	 */
	@ApiField("auth_time")
	private Date authTime;

	/** 
	 * 短信授权过期失效时间
	 */
	@ApiField("over_time")
	private Date overTime;

	/** 
	 * 短信授权发起时间
	 */
	@ApiField("request_time")
	private Date requestTime;

	/** 
	 * 1：暂未发起授权；2：已发起授权，但暂未授权；3：授权已到期失效；4：已授权，且有效；5：授权码已失效
	 */
	@ApiField("status")
	private String status;

	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}
	public Date getAuthTime( ) {
		return this.authTime;
	}

	public void setOverTime(Date overTime) {
		this.overTime = overTime;
	}
	public Date getOverTime( ) {
		return this.overTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}
	public Date getRequestTime( ) {
		return this.requestTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
