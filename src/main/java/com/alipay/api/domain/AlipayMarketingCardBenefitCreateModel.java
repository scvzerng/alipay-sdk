package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * 会员卡模板外部权益创建
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:35
 */
@ApiModel(description = " 会员卡模板外部权益创建")
public class AlipayMarketingCardBenefitCreateModel extends AlipayObject {

    private static final long serialVersionUID = 8199132812387321835L;

    /**
     * 会员卡模板外部权益
     */
    @ApiModelProperty(notes = " 会员卡模板外部权益")
    @JSONField(alternateNames = "mcardTemplateBenefit", name = "mcard_template_benefit")
    @NotNull
    @Valid
    private McardTemplateBenefit mcardTemplateBenefit;

    public McardTemplateBenefit getMcardTemplateBenefit() {
        return this.mcardTemplateBenefit;
    }

    public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
        this.mcardTemplateBenefit = mcardTemplateBenefit;
    }

}
