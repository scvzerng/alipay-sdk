package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * 权益信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:41
 */
@ApiModel(description = " 权益信息")
public class BenefitInfoDetail extends AlipayObject {

    private static final long serialVersionUID = 6716789422454419154L;

    /**
     * PRE_FUND：实际核销或者商户赠送的金额
     * DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）
     * COUPON：实际核销或者商户赠送的券
     */
    @ApiModelProperty(notes = " PRE_FUND：实际核销或者商户赠送的金额DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）COUPON：实际核销或者商户赠送的券")
    private BigDecimal amount;

    /**
     * 权益类型
     * PRE_FUND（卡面额）
     * DISCOUNT：折扣金额
     * COUPON：券
     */
    @ApiModelProperty(notes = " 权益类型PRE_FUND（卡面额）DISCOUNT：折扣金额COUPON：券")
    @JSONField(alternateNames = "benefitType", name = "benefit_type")
    @EnumCheck(enums = {"PRE_FUND","DISCOUNT","COUPON"})
    @NotNull
    private String benefitType;

    /**
     * COUPON：当核销或者赠送券时，可以设置该值
     */
    @ApiModelProperty(notes = " COUPON：当核销或者赠送券时，可以设置该值")
    private String count;

    /**
     * 产生核销或者赠送权益的描述
     */
    @ApiModelProperty(notes = " 产生核销或者赠送权益的描述")
    private String description;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getBenefitType() {
        return this.benefitType;
    }

    public void setBenefitType(String benefitType) {
        this.benefitType = benefitType;
    }

    public String getCount() {
        return this.count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
