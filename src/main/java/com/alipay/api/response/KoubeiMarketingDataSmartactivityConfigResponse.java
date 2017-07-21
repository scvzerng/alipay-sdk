package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * ALIPAY API: koubei.marketing.data.smartactivity.config response.
 *
 * @author auto create
 * @since 1.0, 2017-03-31 20:30:59
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.data.smartactivity.config response.")
public class KoubeiMarketingDataSmartactivityConfigResponse extends AlipayResponse {

    private static final long serialVersionUID = 7485296719589284334L;

    /**
     * 活动类型
     * CONSUME_SEND 消费送
     * DIRECT_SEND 直发奖
     * GUESS_SEND 口令送
     */
    @ApiModelProperty(notes = " 活动类型CONSUME_SEND 消费送DIRECT_SEND 直发奖GUESS_SEND 口令送")
    @ApiField("activity_type")
    private String activityType;

    /**
     * 活动有效天数
     */
    @ApiModelProperty(notes = " 活动有效天数")
    @ApiField("activity_valid_days")
    private Integer activityValidDays;

    /**
     * 活动配置CODE
     */
    @ApiModelProperty(notes = " 活动配置CODE")
    @ApiField("config_code")
    private String configCode;

    /**
     * 活动人群对象，包含针对N天未消费的用户/所有用户
     */
    @ApiModelProperty(notes = " 活动人群对象，包含针对N天未消费的用户/所有用户")
    @ApiField("crowd_group")
    private String crowdGroup;

    /**
     * 扩展信息，对于拉新的会返回commission_rate(口碑客分佣比例)，对于方案组的会返回SMART_PROMO_GROUP_ID(方案组ID),SMART_PROMO_PLAN_ID方案ID，多个方案竖线分隔，consume_code表示消费送活动形式，包含RULES/USRLEVEL两个枚举值，分别表示按照用户规则和会员分层来创建活动组
     */
    @ApiModelProperty(notes = " 扩展信息，对于拉新的会返回commission_rate(口碑客分佣比例)，对于方案组的会返回SMART_PROMO_GROUP_ID(方案组ID),SMART_PROMO_PLAN_ID方案ID，多个方案竖线分隔，consume_code表示消费送活动形式，包含RULES/USRLEVEL两个枚举值，分别表示按照用户规则和会员分层来创建活动组")
    @ApiField("ext_info")
    private ExtInfo extInfo;

    /**
     * 商品ID，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
     */
    @ApiModelProperty(notes = " 商品ID，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔")
    @ApiField("item_id")
    private String itemId;

    /**
     * 商品名称，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
     */
    @ApiModelProperty(notes = " 商品名称，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔")
    @ApiField("item_name")
    private String itemName;

    /**
     * 奖品面额门槛（阶梯状），消费满不同的金额可以使用不同的券,单位：分
     */
    @ApiModelProperty(notes = " 奖品面额门槛（阶梯状），消费满不同的金额可以使用不同的券,单位：分")
    @ApiField("min_consume")
    private String minConsume;

    /**
     * 领券门槛（阶梯状），消费满不同的金额发不同金额的券券
     * 活动类型为消费送且不是消费送礼包时设置
     * 多营销工具之间不允许设置重复值
     * 单位：分
     */
    @ApiModelProperty(notes = " 领券门槛（阶梯状），消费满不同的金额发不同金额的券券活动类型为消费送且不是消费送礼包时设置多营销工具之间不允许设置重复值单位：分")
    @ApiField("min_cost")
    private String minCost;

    /**
     * 营销类型，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔
     */
    @ApiModelProperty(notes = " 营销类型，只有在诊断码为SUPER_ITEM表示菜品营销时此字段才可能有值，多个值之间使用竖线|分隔")
    @ApiField("pro_type")
    private String proType;

    /**
     * 目前支持以下类型：
     * EXCHANGE：兑换券
     * MONEY：代金券
     * REDUCETO：减至券
     * RATE：折扣券
     */
    @ApiModelProperty(notes = " 目前支持以下类型：EXCHANGE：兑换券MONEY：代金券REDUCETO：减至券RATE：折扣券")
    @ApiField("voucher_type")
    private String voucherType;

    /**
     * 券有效天数
     */
    @ApiModelProperty(notes = " 券有效天数")
    @ApiField("voucher_valid_days")
    private Integer voucherValidDays;

    /**
     * 券面额，折扣券为折扣比例、立减为金额 单位：分
     */
    @ApiModelProperty(notes = " 券面额，折扣券为折扣比例、立减为金额 单位：分")
    @ApiField("worth_value")
    private String worthValue;

    @ApiModel

    public static class ExtInfo implements Serializable {
        /**
         * 方案组ID
         */
        @ApiModelProperty(notes = " 方案组ID")
        @ApiField("SMART_PROMO_GROUP_ID")
        private String smartPromoGroupId;
        /**
         * 方案ID
         */
        @ApiModelProperty(notes = " 方案ID")
        @ApiField("SMART_PROMO_PLAN_ID")
        private String smartPromoPlanId;
        /**
         * 口碑客分佣比例
         */
        @ApiModelProperty(notes = " 口碑客分佣比例")
        @ApiField("commission_rate")
        private BigDecimal commissionRate;

        public String getSmartPromoGroupId() {
            return smartPromoGroupId;
        }

        public void setSmartPromoGroupId(String smartPromoGroupId) {
            this.smartPromoGroupId = smartPromoGroupId;
        }

        public String getSmartPromoPlanId() {
            return smartPromoPlanId;
        }

        public void setSmartPromoPlanId(String smartPromoPlanId) {
            this.smartPromoPlanId = smartPromoPlanId;
        }

        public BigDecimal getCommissionRate() {
            return commissionRate;
        }

        public void setCommissionRate(BigDecimal commissionRate) {
            this.commissionRate = commissionRate;
        }
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getActivityType() {
        return this.activityType;
    }

    public Integer getActivityValidDays() {
        return activityValidDays;
    }

    public void setActivityValidDays(Integer activityValidDays) {
        this.activityValidDays = activityValidDays;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getConfigCode() {
        return this.configCode;
    }

    public void setCrowdGroup(String crowdGroup) {
        this.crowdGroup = crowdGroup;
    }

    public String getCrowdGroup() {
        return this.crowdGroup;
    }

    public ExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(ExtInfo extInfo) {
        this.extInfo = extInfo;
    }



    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return this.itemName;
    }

    public String getMinConsume() {
        return minConsume;
    }

    public void setMinConsume(String minConsume) {
        this.minConsume = minConsume;
    }

    public String getMinCost() {
        return minCost;
    }

    public void setMinCost(String minCost) {
        this.minCost = minCost;
    }

    public void setProType(String proType) {
        this.proType = proType;
    }

    public String getProType() {
        return this.proType;
    }

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    public String getVoucherType() {
        return this.voucherType;
    }

    public Integer getVoucherValidDays() {
        return voucherValidDays;
    }

    public void setVoucherValidDays(Integer voucherValidDays) {
        this.voucherValidDays = voucherValidDays;
    }

    public String getWorthValue() {
        return worthValue;
    }

    public void setWorthValue(String worthValue) {
        this.worthValue = worthValue;
    }
}
