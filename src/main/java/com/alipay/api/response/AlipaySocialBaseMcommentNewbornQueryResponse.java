package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.mcomment.newborn.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-09-08 17:37:49
 */
public class AlipaySocialBaseMcommentNewbornQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7552571512416552583L;

	/** 
	 * 大学编码
	 */
	@ApiField("campus_code")
	private String campusCode;

	/** 
	 * 大学名称
	 */
	@ApiField("campus_name")
	private String campusName;

	/** 
	 * 返回值中文 (专科  本科 硕士 博士)
	 */
	@ApiField("degree")
	private String degree;

	/** 
	 * 入学年份
	 */
	@ApiField("enrollment_time")
	private String enrollmentTime;

	/** 
	 * 毕业年份
	 */
	@ApiField("graduation_time")
	private String graduationTime;

	/** 
	 * 省份编码
	 */
	@ApiField("province_code")
	private String provinceCode;

	/** 
	 * 省份名称
	 */
	@ApiField("province_name")
	private String provinceName;

	/** 
	 * 默认0 外网无需处理此参数
	 */
	@ApiField("status_enum")
	private Long statusEnum;

	/** 
	 * 用户userId
	 */
	@ApiField("user_id")
	private String userId;

	public void setCampusCode(String campusCode) {
		this.campusCode = campusCode;
	}
	public String getCampusCode( ) {
		return this.campusCode;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}
	public String getCampusName( ) {
		return this.campusName;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getDegree( ) {
		return this.degree;
	}

	public void setEnrollmentTime(String enrollmentTime) {
		this.enrollmentTime = enrollmentTime;
	}
	public String getEnrollmentTime( ) {
		return this.enrollmentTime;
	}

	public void setGraduationTime(String graduationTime) {
		this.graduationTime = graduationTime;
	}
	public String getGraduationTime( ) {
		return this.graduationTime;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	public String getProvinceName( ) {
		return this.provinceName;
	}

	public void setStatusEnum(Long statusEnum) {
		this.statusEnum = statusEnum;
	}
	public Long getStatusEnum( ) {
		return this.statusEnum;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
