package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 诊断结果信息
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:38
 */
@ApiModel(description = " 诊断结果信息")
public class DiagnoseResult extends AlipayObject {

    private static final long serialVersionUID = 2789561588416161129L;

    /**
     * 提示文案业务参数,JSON对象形式返回，JSON的KEY包含tradeCycle，userRate，industryRate，repayRate调用方根据诊断CODE分别给出不同的诊断文案，例如：
     * TRADE_RATE	流失会员占比高	您当前${tradeCycle}(90)天未到店消费会员占总会员${userRate}(40%)，落后同行${industryRate}(60%)的商家。
     * USER_COUNT	会员数量少	您当前店均会员量较少，落后同行${industryRate}(60%)的商家。
     * <p>
     * REPAY_RATE	复购率低	您当前${tradeCycle}(60)天会员回头率为${repayRate}(30%)，落后于同行${industryRate}(60%)的商家。
     */
    @ApiModelProperty(notes = " 提示文案业务参数,JSON对象形式返回，JSON的KEY包含tradeCycle，userRate，industryRate，repayRate调用方根据诊断CODE分别给出不同的诊断文案，例如：TRADE_RATE	流失会员占比高	您当前${tradeCycle}(90)天未到店消费会员占总会员${userRate}(40%)，落后同行${industryRate}(60%)的商家。USER_COUNT	会员数量少	您当前店均会员量较少，落后同行${industryRate}(60%)的商家。REPAY_RATE	复购率低	您当前${tradeCycle}(60)天会员回头率为${repayRate}(30%)，落后于同行${industryRate}(60%)的商家。")
    @ApiField("biz_data")
    private BizData bizData;

    /**
     * 诊断结果CODE，目前有如下三个值
     * TRADE_RATE	流失会员占比高
     * USER_COUNT	会员数量少
     * REPAY_RATE	复购率低
     */
    @ApiModelProperty(notes = " 诊断结果CODE，目前有如下三个值TRADE_RATE	流失会员占比高USER_COUNT	会员数量少REPAY_RATE	复购率低")
    @ApiField("diagnose_code")
    private String diagnoseCode;

    public BizData getBizData() {
        return bizData;
    }

    public void setBizData(BizData bizData) {
        this.bizData = bizData;
    }

    public String getDiagnoseCode() {
        return this.diagnoseCode;
    }

    public void setDiagnoseCode(String diagnoseCode) {
        this.diagnoseCode = diagnoseCode;
    }

    @ApiModel

    public static class BizData {
        /**
         * 消费周期
         */
        @ApiModelProperty(notes = " 消费周期")
        @ApiField("tradeCycle")
        private Integer tradeCycle;
        /**
         * 用户占比
         */
        @ApiModelProperty(notes = " 用户占比")
        @ApiField("userRate")
        private String userRate;
        /**
         * 落后同行百分比
         */
        @ApiModelProperty(notes = " 落后同行百分比")
        @ApiField("industryRate")
        private String industryRate;
        /**
         * 回头率
         */
        @ApiModelProperty(notes = " 回头率")
        @ApiField("repayRate")
        private String repayRate;
    }
}
