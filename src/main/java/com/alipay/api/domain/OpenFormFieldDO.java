package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.Valid;
import java.io.Serializable;
import java.util.List;

/**
 * 开放表单字段定义数据模型
 *
 * @author auto create
 * @since 1.0, 2017-03-20 20:52:13
 */
@ApiModel(description = " 开放表单字段定义数据模型")
public class OpenFormFieldDO extends AlipayObject {

    private static final long serialVersionUID = 5229386564854421666L;

    /**
     * 表单可选字段配置，common_fields属性定义一个表单字段数组。
     */
    @ApiModelProperty(notes = " 表单可选字段配置，common_fields属性定义一个表单字段数组。")
    @Valid
    private Field optional;

    /**
     * 表单必填字段配置，common_fields属性定义一个表单字段数组。
     */
    @ApiModelProperty(notes = " 表单必填字段配置，common_fields属性定义一个表单字段数组。")
    @Valid
    private Field required;

    public Field getOptional() {
        return optional;
    }

    public void setOptional(Field optional) {
        this.optional = optional;
    }

    public Field getRequired() {
        return required;
    }

    public void setRequired(Field required) {
        this.required = required;
    }

    @ApiModel(description = "会员卡开卡时的表单字段配置信息，可定义多个通用表单字段，最大不超过20个。")
    public static class Field implements Serializable{

        @ApiModelProperty(notes = "表单必填字段配置，common_fields属性")
        @JSONField(alternateNames = "commonFields", name = "common_fields")
        @EnumCheck(enums = {"OPEN_FORM_FIELD_MOBILE","OPEN_FORM_FIELD_GENDER","OPEN_FORM_FIELD_NAME","OPEN_FORM_FIELD_BIRTHDAY","OPEN_FORM_FIELD_BIRTHDAY_WITH_YEAR","OPEN_FORM_FIELD_IDCARD","OPEN_FORM_FIELD_EMAIL","OPEN_FORM_FIELD_ADDRESS","OPEN_FORM_FIELD_CITY","OPEN_FORM_FIELD_IS_STUDENT","OPEN_FORM_FIELD_MEMBER_GRADE"})
        private List<String> commonFields;

        public List<String> getCommonFields() {
            return commonFields;
        }

        public void setCommonFields(List<String> commonFields) {
            this.commonFields = commonFields;
        }
    }

}
