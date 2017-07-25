package com.alipay.api.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 券对象
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 券对象")
public class Voucher  {


    /**
     * 券副标题
     */
    @ApiModelProperty(notes = " 券副标题")
    @JSONField(name = "brand_name", alternateNames = "brandName")
    private String brandName;

    /**
     * 券的说明条款
     */
    @ApiModelProperty(notes = " 券的说明条款")
    @JSONField(name = "clause_terms", alternateNames = "clauseTerms")
    private List<ClauseTerm> clauseTerms;

    /**
     * 延迟生效信息
     */
    @ApiModelProperty(notes = " 延迟生效信息")
    @JSONField(name = "delay_info", alternateNames = "delayInfo")
    private DelayInfo delayInfo;

    /**
     * 券详细说明
     * 最多包含500个字符
     */
    @ApiModelProperty(notes = " 券详细说明 最多包含500个字符")
    private String desc;

    /**
     * 券使用说明描述列表
     */
    @ApiModelProperty(notes = " 券使用说明描述列表")
    @JSONField(name = "desc_detail_list", alternateNames = "descDetailList")
    private List<VoucherDescDetail> descDetailList;

    /**
     * 券的展示信息
     */
    @ApiModelProperty(notes = " 券的展示信息")
    @JSONField(name = "display_config", alternateNames = "displayConfig")
    private DisplayConfig displayConfig;

    /**
     * 券是否可转赠，默认为可转赠
     */
    @ApiModelProperty(notes = " 券是否可转赠，默认为可转赠")
    @JSONField(name = "donate_flag", alternateNames = "donateFlag")
    private boolean donateFlag = false;

    /**
     * 券生效的方式，目前支持以下方式
     * 立即生效：IMMEDIATELY
     * 延迟生效：DELAY
     * 仅在券有效期类型为相对有效期时生效
     */
    @ApiModelProperty(notes = " 券生效的方式，目前支持以下方式 立即生效：IMMEDIATELY 延迟生效：DELAY 仅在券有效期类型为相对有效期时生效")
    @JSONField(name = "effect_type", alternateNames = "effectType")
    private String effectType;

    /**
     * 券有效期的结束时间
     * 仅在券有效期类型为绝对有效期时生效
     * 必须晚于活动结束时间
     */
    @ApiModelProperty(notes = " 券有效期的结束时间 仅在券有效期类型为绝对有效期时生效 必须晚于活动结束时间")
    @JSONField(name = "end_time", alternateNames = "endTime")
    private Date endTime;

    /**
     * 券的扩展信息
     */
    @ApiModelProperty(notes = " 券的扩展信息")
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    private JSONObject extInfo;

    /**
     * 单品信息
     * 兑换券不允许设置单品信息
     * 减至券必须设置单品信息
     * 其他类型券可按需设置
     */
    @ApiModelProperty(notes = " 单品信息 兑换券不允许设置单品信息 减至券必须设置单品信息 其他类型券可按需设置")
    @JSONField(name = "item_info", alternateNames = "itemInfo")
    private ItemInfo itemInfo;

    /**
     * 券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得
     */
    @ApiModelProperty(notes = " 券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得")
    private String logo;

    /**
     * 最高优惠金额，单位元
     * 必须为合法金额类型字符串
     * 仅当券类型为DISOUNT有效
     */
    @ApiModelProperty(notes = " 最高优惠金额，单位元 必须为合法金额类型字符串 仅当券类型为DISOUNT有效")
    @JSONField(name = "max_amount", alternateNames = "maxAmount")
    private BigDecimal maxAmount;

    /**
     * 券叠加的属性，NO_MULTI:不可叠加;MULTI_USE_WITH_SINGLE:全场优惠和单品优惠的叠加；MULTI_USE_WITH_OTHERS:全场和其他所有优惠都可以叠加
     */
    @ApiModelProperty(notes = " 券叠加的属性，NO_MULTI:不可叠加;MULTI_USE_WITH_SINGLE:全场优惠和单品优惠的叠加；MULTI_USE_WITH_OTHERS:全场和其他所有优惠都可以叠加")
    @JSONField(name = "multi_use_mode", alternateNames = "multiUseMode")
    private String multiUseMode;

    /**
     * 名称
     */
    @ApiModelProperty(notes = " 名称")
    private String name;

    /**
     * 折扣率
     * 仅当券类型为折扣券时有效
     * 有效折扣率取值范围0.11-0.99
     * 仅允许保留小数点后两位
     */
    @ApiModelProperty(notes = " 折扣率 仅当券类型为折扣券时有效 有效折扣率取值范围0.11-0.99 仅允许保留小数点后两位")
    private BigDecimal rate;

    /**
     * 券相对有效期，单位天
     * 仅在券有效期类型为相对有效期时生效
     * 如，设5表示领券领取后5日内有效
     */
    @ApiModelProperty(notes = " 券相对有效期，单位天 仅在券有效期类型为相对有效期时生效 如，设5表示领券领取后5日内有效")
    @JSONField(name = "relative_time", alternateNames = "relativeTime")
    private Short relativeTime;

    /**
     * 券有效期的开始时间
     * 仅在券有效期类型为绝对有效期时生效
     */
    @ApiModelProperty(notes = " 券有效期的开始时间 仅在券有效期类型为绝对有效期时生效")
    @JSONField(name = "start_time", alternateNames = "startTime")
    private Date startTime;

    /**
     * 券类型，目前支持以下类型：
     * EXCHANGE：兑换券
     * MONEY：代金券
     * REDUCETO：减至券
     * RATE：折扣券
     */
    @ApiModelProperty(notes = " 券类型，目前支持以下类型： EXCHANGE：兑换券 MONEY：代金券 REDUCETO：减至券 RATE：折扣券")
    private String type;

    /**
     * 券的使用说明
     * 使用须知最多6条，且每条最多100字
     */
    @ApiModelProperty(notes = " 券的使用说明 使用须知最多6条，且每条最多100字")
    @JSONField(name = "use_instructions", alternateNames = "useInstructions")
    private List<String> useInstructions;

    /**
     * 券的使用规则信息
     */
    @ApiModelProperty(notes = " 券的使用规则信息")
    @JSONField(name = "use_rule", alternateNames = "useRule")
    private UseRule useRule;

    /**
     * 券有效期类型，目前支持以下类型：
     * RELATIVE：相对有效期
     * FIXED：绝对有效期
     */
    @ApiModelProperty(notes = " 券有效期类型，目前支持以下类型： RELATIVE：相对有效期 FIXED：绝对有效期")
    @JSONField(name = "validate_type", alternateNames = "validateType")
    private String validateType;

    /**
     * 该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式
     * USER_CLICK:用户自己点击券上的按钮核销
     * MERCHANT_SCAN：商户通过APP扫码核销
     * 其他情况下此字段为空
     */
    @ApiModelProperty(notes = " 该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式 USER_CLICK:用户自己点击券上的按钮核销 MERCHANT_SCAN：商户通过APP扫码核销 其他情况下此字段为空")
    @JSONField(name = "verify_mode", alternateNames = "verifyMode")
    private String verifyMode;

    /**
     * 券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得
     */
    @ApiModelProperty(notes = " 券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得")
    @JSONField(name = "voucher_img", alternateNames = "voucherImg")
    private String voucherImg;

    /**
     * 券的备注
     */
    @ApiModelProperty(notes = " 券的备注")
    @JSONField(name = "voucher_note", alternateNames = "voucherNote")
    private String voucherNote;

    /**
     * 券面额，单位元
     * 必须为合法金额类型字符串
     * 券类型为代金券、减至券时，券面额必须设置
     * 单品减至券的券面额必须低于单品原价
     */
    @ApiModelProperty(notes = " 券面额，单位元 必须为合法金额类型字符串 券类型为代金券、减至券时，券面额必须设置 单品减至券的券面额必须低于单品原价")
    @JSONField(name = "worth_value", alternateNames = "worthValue")
    private BigDecimal worthValue;

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<ClauseTerm> getClauseTerms() {
        return this.clauseTerms;
    }

    public void setClauseTerms(List<ClauseTerm> clauseTerms) {
        this.clauseTerms = clauseTerms;
    }

    public DelayInfo getDelayInfo() {
        return this.delayInfo;
    }

    public void setDelayInfo(DelayInfo delayInfo) {
        this.delayInfo = delayInfo;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<VoucherDescDetail> getDescDetailList() {
        return this.descDetailList;
    }

    public void setDescDetailList(List<VoucherDescDetail> descDetailList) {
        this.descDetailList = descDetailList;
    }

    public DisplayConfig getDisplayConfig() {
        return this.displayConfig;
    }

    public void setDisplayConfig(DisplayConfig displayConfig) {
        this.displayConfig = displayConfig;
    }

    public boolean isDonateFlag() {
        return donateFlag;
    }

    public void setDonateFlag(boolean donateFlag) {
        this.donateFlag = donateFlag;
    }

    public String getEffectType() {
        return this.effectType;
    }

    public void setEffectType(String effectType) {
        this.effectType = effectType;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public ItemInfo getItemInfo() {
        return this.itemInfo;
    }

    public void setItemInfo(ItemInfo itemInfo) {
        this.itemInfo = itemInfo;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getMultiUseMode() {
        return this.multiUseMode;
    }

    public void setMultiUseMode(String multiUseMode) {
        this.multiUseMode = multiUseMode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Short getRelativeTime() {
        return relativeTime;
    }

    public void setRelativeTime(Short relativeTime) {
        this.relativeTime = relativeTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getUseInstructions() {
        return this.useInstructions;
    }

    public void setUseInstructions(List<String> useInstructions) {
        this.useInstructions = useInstructions;
    }

    public UseRule getUseRule() {
        return this.useRule;
    }

    public void setUseRule(UseRule useRule) {
        this.useRule = useRule;
    }

    public String getValidateType() {
        return this.validateType;
    }

    public void setValidateType(String validateType) {
        this.validateType = validateType;
    }

    public String getVerifyMode() {
        return this.verifyMode;
    }

    public void setVerifyMode(String verifyMode) {
        this.verifyMode = verifyMode;
    }

    public String getVoucherImg() {
        return this.voucherImg;
    }

    public void setVoucherImg(String voucherImg) {
        this.voucherImg = voucherImg;
    }

    public String getVoucherNote() {
        return this.voucherNote;
    }

    public void setVoucherNote(String voucherNote) {
        this.voucherNote = voucherNote;
    }

    public BigDecimal getWorthValue() {
        return worthValue;
    }

    public void setWorthValue(BigDecimal worthValue) {
        this.worthValue = worthValue;
    }
}
