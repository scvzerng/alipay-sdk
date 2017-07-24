package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 活动创建接口
 *
 * @author auto create
 * @since 1.0, 2017-06-05 11:25:25
 */
@ApiModel(description = " 活动创建接口")
public class KoubeiMarketingCampaignActivityCreateModel extends AlipayObject {

    private static final long serialVersionUID = 7266323852236367438L;

    /**
     * 是否自动续期活动，默认为N,只有当对应营销工具券有效期为相对有效期时才能设置成Y
     */
    @ApiModelProperty(notes = " 是否自动续期活动，默认为N,只有当对应营销工具券有效期为相对有效期时才能设置成Y")
    @JSONField(alternateNames = "autoDelayFlag", name = "auto_delay_flag")
    private String autoDelayFlag;

    /**
     * 活动预算（当活动类型为GUESS_SEND且营销工具PromoTool的数量大于1时，即口令随机送活动，活动预算为空，每张券的预算数量落在SendRule里的send_budget）
     */
    @ApiModelProperty(notes = " 活动预算（当活动类型为GUESS_SEND且营销工具PromoTool的数量大于1时，即口令随机送活动，活动预算为空，每张券的预算数量落在SendRule里的send_budget）")
    @JSONField(alternateNames = "budgetInfo", name = "budget_info")
    private BudgetInfo budgetInfo;

    /**
     * 活动限制信息
     */
    @ApiModelProperty(notes = " 活动限制信息")
    @JSONField(alternateNames = "constraintInfo", name = "constraint_info")
    private ConstraintInfo constraintInfo;

    /**
     * 活动详细说明
     */
    @ApiModelProperty(notes = " 活动详细说明")
    private String desc;

    /**
     * 活动结束时间
     */
    @ApiModelProperty(notes = " 活动结束时间")
    @JSONField(alternateNames = "endTime", name = "end_time", format = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 活动的扩展信息，无需设置
     */
    @ApiModelProperty(notes = " 活动的扩展信息，无需设置")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    private String extInfo;

    /**
     * 活动名称
     */
    @ApiModelProperty(notes = " 活动名称")
    private String name;

    /**
     * 操作人id，必须和operator_type配对出现，不填时默认是商户
     */
    @ApiModelProperty(notes = " 操作人id，必须和operator_type配对出现，不填时默认是商户")
    @JSONField(alternateNames = "operatorId", name = "operator_id")
    private String operatorId;

    /**
     * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
     */
    @ApiModelProperty(notes = " 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER")
    @JSONField(alternateNames = "operatorType", name = "operator_type")
    private String operatorType;

    /**
     * 外部批次ID，同一owner创建活动需要换out_biz_no，控制幂等
     */
    @ApiModelProperty(notes = " 外部批次ID，同一owner创建活动需要换out_biz_no，控制幂等")
    @JSONField(alternateNames = "outBizNo", name = "out_biz_no")
    private String outBizNo;

    /**
     * 营销工具集
     */
    @ApiModelProperty(notes = " 营销工具集")
    @JSONField(alternateNames = "promoTools", name = "promo_tools")
    private List<PromoTool> promoTools;

    /**
     * 投放渠道集，当活动类型为DIRECT_SEND或者REAL_TIME_SEND时必填，当活动类型为CONSUME_SEND时必须为空，当活动类型为GUESS_SEND时，投放渠道只能有一个且type只能为MERCHANT_CROWD
     */
    @ApiModelProperty(notes = " 投放渠道集，当活动类型为DIRECT_SEND或者REAL_TIME_SEND时必填，当活动类型为CONSUME_SEND时必须为空，当活动类型为GUESS_SEND时，投放渠道只能有一个且type只能为MERCHANT_CROWD")
    @JSONField(alternateNames = "publishChannels", name = "publish_channels")
    private List<PublishChannel> publishChannels;

    /**
     * 招商工具信息
     */
    @ApiModelProperty(notes = " 招商工具信息")
    @JSONField(alternateNames = "recruitTool", name = "recruit_tool")
    private RecruitTool recruitTool;

    /**
     * 活动开始时间
     */
    @ApiModelProperty(notes = " 活动开始时间")
    @JSONField(alternateNames = "startTime", name = "start_time", format = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    /**
     * 活动类型，目前支持以下类型：
     * CONSUME_SEND：消费送活动
     * DIRECT_SEND：直发奖活动
     * REAL_TIME_SEND：实时立减类活动
     * GUESS_SEND：口令送
     * RECHARGE_SEND：充值送
     * POINT_SEND：集点卡活动
     */
    @ApiModelProperty(notes = " 活动类型，目前支持以下类型：CONSUME_SEND：消费送活动DIRECT_SEND：直发奖活动REAL_TIME_SEND：实时立减类活动GUESS_SEND：口令送RECHARGE_SEND：充值送POINT_SEND：集点卡活动")
    private String type;

    public String getAutoDelayFlag() {
        return this.autoDelayFlag;
    }

    public void setAutoDelayFlag(String autoDelayFlag) {
        this.autoDelayFlag = autoDelayFlag;
    }

    public BudgetInfo getBudgetInfo() {
        return this.budgetInfo;
    }

    public void setBudgetInfo(BudgetInfo budgetInfo) {
        this.budgetInfo = budgetInfo;
    }

    public ConstraintInfo getConstraintInfo() {
        return this.constraintInfo;
    }

    public void setConstraintInfo(ConstraintInfo constraintInfo) {
        this.constraintInfo = constraintInfo;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

    public String getOutBizNo() {
        return this.outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public List<PromoTool> getPromoTools() {
        return this.promoTools;
    }

    public void setPromoTools(List<PromoTool> promoTools) {
        this.promoTools = promoTools;
    }

    public List<PublishChannel> getPublishChannels() {
        return this.publishChannels;
    }

    public void setPublishChannels(List<PublishChannel> publishChannels) {
        this.publishChannels = publishChannels;
    }

    public RecruitTool getRecruitTool() {
        return this.recruitTool;
    }

    public void setRecruitTool(RecruitTool recruitTool) {
        this.recruitTool = recruitTool;
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

}
