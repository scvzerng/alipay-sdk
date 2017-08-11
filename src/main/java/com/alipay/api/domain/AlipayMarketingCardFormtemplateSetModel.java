package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 开卡组件表单配置
 *
 * @author auto create
 * @since 1.0, 2017-04-06 11:11:41
 */
@ApiModel(description = " 开卡组件表单配置")
public class AlipayMarketingCardFormtemplateSetModel extends AlipayObject  {

    private static final long serialVersionUID = 5476782938224836144L;

    /**
     * 会员卡开卡时的表单字段配置信息，可定义多个通用表单字段，最大不超过20个。
     * 目前支付宝提供的通用表单字段，可选值如下：
     * OPEN_FORM_FIELD_MOBILE – 手机号
     * OPEN_FORM_FIELD_GENDER – 性别
     * OPEN_FORM_FIELD_NAME – 姓名
     * OPEN_FORM_FIELD_BIRTHDAY – 生日
     * OPEN_FORM_FIELD_IDCARD – 身份证
     * OPEN_FORM_FIELD_EMAIL – 邮箱
     * OPEN_FORM_FIELD_ADDRESS – 地址
     * OPEN_FORM_FIELD_CITY -- 城市
     * OPEN_FORM_FIELD_IS_STUDENT -- 是否学生认证
     * OPEN_FORM_FIELD_MEMBER_GRADE -- 会员等级
     */
    @ApiModelProperty(notes = " 会员卡开卡时的表单字段配置信息，可定义多个通用表单字段，最大不超过20个。目前支付宝提供的通用表单字段，可选值如下：OPEN_FORM_FIELD_MOBILE – 手机号OPEN_FORM_FIELD_GENDER – 性别OPEN_FORM_FIELD_NAME – 姓名OPEN_FORM_FIELD_BIRTHDAY – 生日OPEN_FORM_FIELD_IDCARD – 身份证OPEN_FORM_FIELD_EMAIL – 邮箱OPEN_FORM_FIELD_ADDRESS – 地址OPEN_FORM_FIELD_CITY -- 城市OPEN_FORM_FIELD_IS_STUDENT -- 是否学生认证OPEN_FORM_FIELD_MEMBER_GRADE -- 会员等级")
    @Valid
    private OpenFormFieldDO fields;

    /**
     * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
     */
    @ApiModelProperty(notes = " 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果")
    @JSONField(alternateNames = "templateId", name = "template_id")
    @NotNull
    private String templateId;

    public OpenFormFieldDO getFields() {
        return this.fields;
    }

    public void setFields(OpenFormFieldDO fields) {
        this.fields = fields;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
