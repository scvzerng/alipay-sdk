package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 持卡人信息
 *
 * @author auto create
 * @since 1.0, 2016-12-20 19:56:20
 */
@ApiModel(description = " 持卡人信息")
public class CardUserInfo extends AlipayObject {

    private static final long serialVersionUID = 1392669142323273884L;

    /**
     * 用户唯一标识, 根据user_id_type类型来定 （目前暂支持支付宝userId）
     * <p>
     * 支付宝userId说明：支付宝用户号是以2088开头的16位纯数字组成
     */
    @ApiModelProperty(notes = " 用户唯一标识, 根据user_id_type类型来定 （目前暂支持支付宝userId）支付宝userId说明：支付宝用户号是以2088开头的16位纯数字组成")
    @JSONField(alternateNames = "userUniId", name = "user_uni_id")
    @NotNull
    private String userUniId;

    /**
     * ID类型：UID， 即传值UID即可
     */
    @ApiModelProperty(notes = " ID类型：UID， 即传值UID即可")
    @JSONField(alternateNames = "userUniIdType", name = "user_uni_id_type")
    @EnumCheck(enums = {"UID"})
    @NotNull
    private String userUniIdType;

    public String getUserUniId() {
        return this.userUniId;
    }

    public void setUserUniId(String userUniId) {
        this.userUniId = userUniId;
    }

    public String getUserUniIdType() {
        return this.userUniIdType;
    }

    public void setUserUniIdType(String userUniIdType) {
        this.userUniIdType = userUniIdType;
    }

}
