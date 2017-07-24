package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 会员卡模板外部权益修改
 *
 * @author auto create
 * @since 1.0, 2017-06-23 09:40:45
 */
@ApiModel(description = " 会员卡模板外部权益修改")
public class AlipayMarketingCardBenefitModifyModel extends AlipayObject {

    private static final long serialVersionUID = 6697246194199764875L;

    /**
     * 权益ID
     */
    @ApiModelProperty(notes = " 权益ID")
    @JSONField(alternateNames = "benefitId", name = "benefit_id")
    @NotBlank
    private String benefitId;

    /**
     * 会员卡模板外部权益
     */
    @ApiModelProperty(notes = " 会员卡模板外部权益")
    @JSONField(alternateNames = "mcardTemplateBenefit", name = "mcard_template_benefit")
    private McardTemplateBenefit mcardTemplateBenefit;

    public String getBenefitId() {
        return this.benefitId;
    }

    public void setBenefitId(String benefitId) {
        this.benefitId = benefitId;
    }

    public McardTemplateBenefit getMcardTemplateBenefit() {
        return this.mcardTemplateBenefit;
    }

    public void setMcardTemplateBenefit(McardTemplateBenefit mcardTemplateBenefit) {
        this.mcardTemplateBenefit = mcardTemplateBenefit;
    }

}
