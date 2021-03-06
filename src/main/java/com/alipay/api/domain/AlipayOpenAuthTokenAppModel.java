package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.fastjson.NormalizerJSON;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 用应用授权码（app_auth_code）换取或者刷新应用授权令牌(app_auth_token)
 *
 * @author auto create
 * @since 1.0, 2016-10-27 16:28:06
 */
@ApiModel(description = " 用应用授权码（app_auth_code）换取或者刷新应用授权令牌(app_auth_token)")
public class AlipayOpenAuthTokenAppModel extends AlipayObject {

    private static final long serialVersionUID = 1217736144721624145L;

    /**
     * 授权码，如果grant_type的值为authorization_code。该值必须填写
     */
    @ApiModelProperty(notes = " 授权码，如果grant_type的值为authorization_code。该值必须填写")
    @Length(min=1, max=40)
    private String code;

    /**
     * authorization_code表示换取app_auth_token。
     * refresh_token表示刷新app_auth_token。
     */
    @JSONField(name = "grant_type", alternateNames = "grantType")
    @ApiModelProperty(notes = " authorization_code表示换取app_auth_token。refresh_token表示刷新app_auth_token。")
    @NotNull(message = "grant_type值不能为空")
    @Length(min=1 ,max =20)
    private String grantType;

    /**
     * 刷新令牌，如果grant_type值为refresh_token。该值不能为空。该值来源于此接口的返回值app_refresh_token（至少需要通过grant_type=authorization_code调用此接口一次才能获取）
     */
    @JSONField(name = "refresh_token", alternateNames = "refreshToken")
    @ApiModelProperty(notes = " 刷新令牌，如果grant_type值为refresh_token。该值不能为空。该值来源于此接口的返回值app_refresh_token（至少需要通过grant_type=authorization_code调用此接口一次才能获取）")
    @Length(min=1,max=40)
    private String refreshToken;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGrantType() {
        return this.grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

}
