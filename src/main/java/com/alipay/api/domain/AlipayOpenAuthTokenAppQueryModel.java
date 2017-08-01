package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 查询某个ISV下的指定app_auth_token的授权信息：授权者、授权接口列表、状态、过期时间等
 *
 * @author auto create
 * @since 1.0, 2016-07-18 13:35:47
 */@ApiModel(description = " 查询某个ISV下的指定app_auth_token的授权信息：授权者、授权接口列表、状态、过期时间等")
public class AlipayOpenAuthTokenAppQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6641553395873731754L;

	/**
	 * 应用授权令牌
	 */@ApiModelProperty(notes = " 应用授权令牌")@JSONField(name = "app_auth_token", alternateNames = "appAuthToken")
	@NotNull(message="应用授权令牌不能为空")
	@Length(min = 1,max = 128)
	private String appAuthToken;

	public String getAppAuthToken() {
		return this.appAuthToken;
	}
	public void setAppAuthToken(String appAuthToken) {
		this.appAuthToken = appAuthToken;
	}

}
