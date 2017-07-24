package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

/**
 * 商户会员
 *
 * @author auto create
 * @since 1.0, 2016-12-22 10:40:16
 */
@ApiModel(description = " 商户会员")
public class MerchantMenber extends AlipayObject {

    private static final long serialVersionUID = 1831647958153682146L;

    /**
     * 生日 yyyy-MM-dd
     */
    @ApiModelProperty(notes = " 生日 yyyy-MM-dd")
    @JSONField(alternateNames = "birth", name = "birth", format = "yyyy-MM-dd")
    private Data birth;

    /**
     * 手机号
     */
    @ApiModelProperty(notes = " 手机号")
    private String cell;

    /**
     * 性别（男：MALE；女：FEMALE）
     */
    @ApiModelProperty(notes = " 性别（男：MALE；女：FEMALE）")
    @EnumCheck(enums = {"MALE","FEMALE"})
    private String gende;

    /**
     * 姓名
     */
    @ApiModelProperty(notes = " 姓名")
    private String name;

    public Data getBirth() {
        return birth;
    }

    public void setBirth(Data birth) {
        this.birth = birth;
    }

    public String getCell() {
        return this.cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getGende() {
        return this.gende;
    }

    public void setGende(String gende) {
        this.gende = gende;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
