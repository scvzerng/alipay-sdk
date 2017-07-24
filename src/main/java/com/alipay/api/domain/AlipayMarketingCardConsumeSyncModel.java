package com.alipay.api.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 会员卡消费记录同步
 *
 * @author auto create
 * @since 1.0, 2016-10-18 15:46:55
 */
@ApiModel(description = " 会员卡消费记录同步")
public class AlipayMarketingCardConsumeSyncModel extends AlipayObject {

    private static final long serialVersionUID = 7319299298833349272L;

    /**
     * 用户实际付的现金金额
     * 1.针对预付卡面额的核销金额在use_benefit_list展现，作为权益金额
     * 2.权益金额不叠加在该金额上
     */
    @ApiModelProperty(notes = " 用户实际付的现金金额1.针对预付卡面额的核销金额在use_benefit_list展现，作为权益金额2.权益金额不叠加在该金额上")
    @JSONField(alternateNames = "actPayAmount", name = "act_pay_amount")
    private BigDecimal actPayAmount;

    /**
     * 卡信息（交易后的实际卡信息）
     */
    @ApiModelProperty(notes = " 卡信息（交易后的实际卡信息）")
    @JSONField(alternateNames = "cardInfo", name = "card_info")
    private MerchantCard cardInfo;

    /**
     * 获取权益列表
     */
    @ApiModelProperty(notes = " 获取权益列表")
    @JSONField(alternateNames = "gainBenefitList", name = "gain_benefit_list")
    private List<BenefitInfoDetail> gainBenefitList;

    /**
     * 备注信息，现有直接填写门店信息
     */
    @ApiModelProperty(notes = " 备注信息，现有直接填写门店信息")
    private String memo;

    /**
     * 门店编号
     */
    @ApiModelProperty(notes = " 门店编号")
    @JSONField(alternateNames = "shopCode", name = "shop_code")
    private String shopCode;

    /**
     * 产生该笔交易时，用户出具的凭证类型
     * ALIPAY：支付宝电子卡
     * ENTITY：实体卡
     * OTHER：其他
     */
    @ApiModelProperty(notes = " 产生该笔交易时，用户出具的凭证类型ALIPAY：支付宝电子卡ENTITY：实体卡OTHER：其他")
    @JSONField(alternateNames = "swipeCertType", name = "swipe_cert_type")
    @EnumCheck(enums = {"ALIPAY","ENTITY","OTHER"})
    @NotNull
    private String swipeCertType;

    /**
     * 支付宝业务卡号，开卡接口中返回获取
     */
    @ApiModelProperty(notes = " 支付宝业务卡号，开卡接口中返回获取")
    @JSONField(alternateNames = "targetCardNo", name = "target_card_no")
    @NotNull
    private String targetCardNo;

    /**
     * 卡号类型
     * BIZ_CARD：支付宝业务卡号
     */
    @ApiModelProperty(notes = " 卡号类型BIZ_CARD：支付宝业务卡号")
    @JSONField(alternateNames = "targetCardNoType", name = "target_card_no_type")
    @NotNull
    private String targetCardNoType;

    /**
     * 交易金额：本次交易的实际总金额（可认为标价金额）
     */
    @ApiModelProperty(notes = " 交易金额：本次交易的实际总金额（可认为标价金额）")
    @JSONField(alternateNames = "tradeAmount", name = "trade_amount")
    private BigDecimal tradeAmount;

    /**
     * 交易名称
     * 为空时根据交易类型提供默认名称
     */
    @ApiModelProperty(notes = " 交易名称为空时根据交易类型提供默认名称")
    @JSONField(alternateNames = "tradeName", name = "trade_name")
    private String tradeName;

    /**
     * 支付宝交易号
     */
    @ApiModelProperty(notes = " 支付宝交易号")
    @JSONField(alternateNames = "tradeNo", name = "trade_no")
    @NotNull
    private String tradeNo;

    /**
     * 线下交易时间（是用户付款的交易时间）
     * 当交易时间晚于上次消费记录同步时间，则会发生卡信息变更
     */
    @ApiModelProperty(notes = " 线下交易时间（是用户付款的交易时间）当交易时间晚于上次消费记录同步时间，则会发生卡信息变更")
    @JSONField(alternateNames = "tradeTime", name = "trade_time", format = "yyyy-MM-dd HH:mm:ss" )
    @NotNull
    private Date tradeTime;

    /**
     * 交易类型
     * 开卡：OPEN
     * 消费：TRADE
     * 充值：DEPOSIT
     * 退卡：RETURN
     */
    @ApiModelProperty(notes = " 交易类型开卡：OPEN消费：TRADE充值：DEPOSIT退卡：RETURN")
    @JSONField(alternateNames = "tradeType", name = "trade_type")
    @NotNull
    @EnumCheck(enums = {"OPEN","TRADE","DEPOSIT","RETURN"})
    private String tradeType;

    /**
     * 实际消耗的权益
     */
    @ApiModelProperty(notes = " 实际消耗的权益")
    @JSONField(alternateNames = "useBenefitList", name = "use_benefit_list")
    private List<BenefitInfoDetail> useBenefitList;



    public MerchantCard getCardInfo() {
        return this.cardInfo;
    }

    public void setCardInfo(MerchantCard cardInfo) {
        this.cardInfo = cardInfo;
    }

    public List<BenefitInfoDetail> getGainBenefitList() {
        return this.gainBenefitList;
    }

    public void setGainBenefitList(List<BenefitInfoDetail> gainBenefitList) {
        this.gainBenefitList = gainBenefitList;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getShopCode() {
        return this.shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getSwipeCertType() {
        return this.swipeCertType;
    }

    public void setSwipeCertType(String swipeCertType) {
        this.swipeCertType = swipeCertType;
    }

    public String getTargetCardNo() {
        return this.targetCardNo;
    }

    public void setTargetCardNo(String targetCardNo) {
        this.targetCardNo = targetCardNo;
    }

    public String getTargetCardNoType() {
        return this.targetCardNoType;
    }

    public void setTargetCardNoType(String targetCardNoType) {
        this.targetCardNoType = targetCardNoType;
    }

    public BigDecimal getActPayAmount() {
        return actPayAmount;
    }

    public void setActPayAmount(BigDecimal actPayAmount) {
        this.actPayAmount = actPayAmount;
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeName() {
        return this.tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getTradeNo() {
        return this.tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Date getTradeTime() {
        return this.tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getTradeType() {
        return this.tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public List<BenefitInfoDetail> getUseBenefitList() {
        return this.useBenefitList;
    }

    public void setUseBenefitList(List<BenefitInfoDetail> useBenefitList) {
        this.useBenefitList = useBenefitList;
    }

}
