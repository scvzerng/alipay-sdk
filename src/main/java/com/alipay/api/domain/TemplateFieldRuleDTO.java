package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * 模板字段规则
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
@ApiModel(description = " 模板字段规则")
public class TemplateFieldRuleDTO implements Serializable {


    /**
     * 字段名称，现在支持如下几个Key（暂不支持自定义）
     * Balance：金额
     * Point：整数
     * Level：任意字符串
     * OpenDate：开卡日期
     * ValidDate：过期日期
     */
    @ApiModelProperty(notes = " 字段名称，现在支持如下几个Key（暂不支持自定义）Balance：金额Point：整数Level：任意字符串OpenDate：开卡日期ValidDate：过期日期")
    @JSONField(alternateNames = "fieldName", name = "field_name")
    @EnumCheck(enums = {"Balance","Point","Level","OpenDate","ValidDate"})
    private String fieldName;

    /**
     * 规则名
     * 1、ASSIGN_FROM_REQUEST:  以rule_value为key值，表示该栏位的值从会员卡开卡接口中获取，会员卡开卡接口的card_info中获取对应参数值
     * 2、DATE_IN_FUTURE: 生成一个未来的日期（格式YYYY-MM-DD)，当选择DATE_IN_FUTURE的时候，field_name 必须是OpenDate或ValidDate， 值为(10m或10d 分别表示10个月或10天)
     * 3、CONST: 常量，会员卡开卡接口进行开卡的时候使用模板创建时候设置的值，即取rule_value的值
     */
    @ApiModelProperty(notes = " 规则名1、ASSIGN_FROM_REQUEST:  以rule_value为key值，表示该栏位的值从会员卡开卡接口中获取，会员卡开卡接口的card_info中获取对应参数值2、DATE_IN_FUTURE: 生成一个未来的日期（格式YYYY-MM-DD)，当选择DATE_IN_FUTURE的时候，field_name 必须是OpenDate或ValidDate， 值为(10m或10d 分别表示10个月或10天)3、CONST: 常量，会员卡开卡接口进行开卡的时候使用模板创建时候设置的值，即取rule_value的值")
    @JSONField(alternateNames = "ruleName", name = "rule_name")
    @EnumCheck(enums = {"ASSIGN_FROM_REQUEST","DATE_IN_FUTURE","CONST"})
    private String ruleName;

    /**
     * 根据rule_name，采取相应取值策略
     * CONST：直接取rule_value作为卡属性值
     * DATE_IN_FUTURE：10m或10d 分别表示10个月或10天
     * ASSIGN_FROM_REQUEST：在开卡Reuqest请求中按rule_value取值，现在和field_name对应的为（OpenDate、ValidDate、Level、Point、Balance）
     */
    @ApiModelProperty(notes = " 根据rule_name，采取相应取值策略CONST：直接取rule_value作为卡属性值DATE_IN_FUTURE：10m或10d 分别表示10个月或10天ASSIGN_FROM_REQUEST：在开卡Reuqest请求中按rule_value取值，现在和field_name对应的为（OpenDate、ValidDate、Level、Point、Balance）")
    @JSONField(alternateNames = "ruleValue", name = "rule_value")
    @Length(min = 1,max = 512)
    private String ruleValue;

    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getRuleName() {
        return this.ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getRuleValue() {
        return this.ruleValue;
    }

    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

}
