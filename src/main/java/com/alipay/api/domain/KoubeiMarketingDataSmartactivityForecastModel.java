package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.math.BigDecimal;


/**
 * 商户智能活动效果预测接口
 *
 * @author auto create
 * @since 1.0, 2017-03-31 20:30:46
 */
@ApiModel(description = " 商户智能活动效果预测接口")
public class KoubeiMarketingDataSmartactivityForecastModel extends AlipayObject {

    private static final long serialVersionUID = 7686246652868985537L;

    /**
     * 活动配置CODE
     */
    @JSONField(name = "config_code", alternateNames = "configCode")
    @ApiModelProperty(notes = " 活动配置CODE")
    private String configCode;

    /**
     * 诊断结果CODE，目前有如下四个值
     * TRADE_RATE	流失会员占比高
     * USER_COUNT	会员数量少
     * REPAY_RATE	复购率低
     * COMPOSED_ACTIVITY 方案组诊断
     * 当入参为TRADE_RATE和USER_COUNT时暂时不支持预测，会返回错误码UNSUPPORT_PARAMETER
     */
    @JSONField(name = "diagnose_code", alternateNames = "diagnoseCode")
    @ApiModelProperty(notes = " 诊断结果CODE，目前有如下四个值TRADE_RATE	流失会员占比高USER_COUNT	会员数量少REPAY_RATE	复购率低COMPOSED_ACTIVITY 方案组诊断当入参为TRADE_RATE和USER_COUNT时暂时不支持预测，会返回错误码UNSUPPORT_PARAMETER")
    private String diagnoseCode;

    /**
     * 可选参数有如下几个：
     * worth_value:奖品面额,可以阶梯送数据（示例：10|20|30）单位：分
     * min_consume:门槛,可以阶梯送数据（示例：100|200|300）单位：分
     * voucher_valid_days:券有效期天数
     * activity_valid_days:活动有效期天数
     * min_cost:领券门槛,可以阶梯送数据（示例：100|200|300）单位：分
     * unconsume_days:会员流失天数
     * crowd_group:人群对象
     * consume_code:消费送活动形式包含
     * commission_rate:口碑客分佣比例
     * 注意：对于消费送数据，min_consume/min_cost/worth_value是必填的且必须成组出现，对于诊断码为COMPOSED_ACTIVITY的预测，必须传入全量数据，并且各个参数使用竖线分隔多个值的场景
     */
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    @ApiModelProperty(notes = " 可选参数有如下几个：worth_value:奖品面额,可以阶梯送数据（示例：10|20|30）单位：分min_consume:门槛,可以阶梯送数据（示例：100|200|300）单位：分voucher_valid_days:券有效期天数activity_valid_days:活动有效期天数min_cost:领券门槛,可以阶梯送数据（示例：100|200|300）单位：分unconsume_days:会员流失天数crowd_group:人群对象consume_code:消费送活动形式包含commission_rate:口碑客分佣比例注意：对于消费送数据，min_consume/min_cost/worth_value是必填的且必须成组出现，对于诊断码为COMPOSED_ACTIVITY的预测，必须传入全量数据，并且各个参数使用竖线分隔多个值的场景")
    private ExtInfo extInfo;

    @ApiModel

    public static class ExtInfo implements Serializable {
        /**
         * 奖品面额,可以阶梯送数据（示例：10|20|30）单位：分
         */
        @JSONField(name = "worth_value", alternateNames = "worthValue")
        @ApiModelProperty(notes = " 奖品面额,可以阶梯送数据（示例：10|20|30）单位：分")
        private String worthValue;
        /**
         * 门槛,可以阶梯送数据（示例：100|200|300）单位：分
         */
        @JSONField(name = "min_consume", alternateNames = "minConsume")
        @ApiModelProperty(notes = " 门槛,可以阶梯送数据（示例：100|200|300）单位：分")
        private String minConsume;
        /**
         * 券有效期天数
         */
        @JSONField(name = "voucher_valid_days", alternateNames = "voucherValidDays")
        @ApiModelProperty(notes = " 券有效期天数")
        private Integer voucherValidDays;
        /**
         * 活动有效期天数
         */
        @JSONField(name = "activity_valid_days", alternateNames = "activityValidDays")
        @ApiModelProperty(notes = " 活动有效期天数")
        private Integer activityValidDays;
        /**
         * 领券门槛,可以阶梯送数据（示例：100|200|300）单位：分
         */
        @JSONField(name = "min_cost", alternateNames = "minCost")
        @ApiModelProperty(notes = " 领券门槛,可以阶梯送数据（示例：100|200|300）单位：分")
        private String minCost;
        /**
         * 会员流失天数
         */
        @JSONField(name = "unconsume_days", alternateNames = "unconsumeDays")
        @ApiModelProperty(notes = " 会员流失天数")
        private Integer unconsumeDays;
        /**
         * 人群对象
         */
        @JSONField(name = "crowd_group", alternateNames = "crowdGroup")
        @ApiModelProperty(notes = " 人群对象")
        private String crowdGroup;
        /**
         * 消费送活动形式包含
         */
        @JSONField(name = "consume_code", alternateNames = "consumeCode")
        @ApiModelProperty(notes = " 消费送活动形式包含")
        private String consumeCode;
        /**
         * 口碑客分佣比例
         */
        @JSONField(name = "commission_rate", alternateNames = "commissionRate")
        @ApiModelProperty(notes = " 口碑客分佣比例")
        private BigDecimal commissionRate;

        public String getWorthValue() {
            return worthValue;
        }

        public void setWorthValue(String worthValue) {
            this.worthValue = worthValue;
        }

        public String getMinConsume() {
            return minConsume;
        }

        public void setMinConsume(String minConsume) {
            this.minConsume = minConsume;
        }

        public Integer getVoucherValidDays() {
            return voucherValidDays;
        }

        public void setVoucherValidDays(Integer voucherValidDays) {
            this.voucherValidDays = voucherValidDays;
        }

        public Integer getActivityValidDays() {
            return activityValidDays;
        }

        public void setActivityValidDays(Integer activityValidDays) {
            this.activityValidDays = activityValidDays;
        }

        public String getMinCost() {
            return minCost;
        }

        public void setMinCost(String minCost) {
            this.minCost = minCost;
        }

        public Integer getUnconsumeDays() {
            return unconsumeDays;
        }

        public void setUnconsumeDays(Integer unconsumeDays) {
            this.unconsumeDays = unconsumeDays;
        }

        public String getCrowdGroup() {
            return crowdGroup;
        }

        public void setCrowdGroup(String crowdGroup) {
            this.crowdGroup = crowdGroup;
        }

        public String getConsumeCode() {
            return consumeCode;
        }

        public void setConsumeCode(String consumeCode) {
            this.consumeCode = consumeCode;
        }

        public BigDecimal getCommissionRate() {
            return commissionRate;
        }

        public void setCommissionRate(BigDecimal commissionRate) {
            this.commissionRate = commissionRate;
        }
    }

    public String getConfigCode() {
        return this.configCode;
    }

    public void setConfigCode(String configCode) {
        this.configCode = configCode;
    }

    public String getDiagnoseCode() {
        return this.diagnoseCode;
    }

    public void setDiagnoseCode(String diagnoseCode) {
        this.diagnoseCode = diagnoseCode;
    }

    public ExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(ExtInfo extInfo) {
        this.extInfo = extInfo;
    }
}
