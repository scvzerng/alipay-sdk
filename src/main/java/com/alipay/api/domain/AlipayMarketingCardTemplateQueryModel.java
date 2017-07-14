package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 会员卡模板查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-18 15:46:31
 */
@ApiModel(description = " 会员卡模板查询接口")
public class AlipayMarketingCardTemplateQueryModel extends AlipayObject {

    /**
     * 支付宝卡模板ID（模板创建接口返回的支付宝端模板ID）
     */
    @ApiModelProperty(notes = " 支付宝卡模板ID（模板创建接口返回的支付宝端模板ID）")
    @JSONField(alternateNames = "templateId", name = "template_id")
    @Length(min = 1,max = 32)
    private String templateId;

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

}
