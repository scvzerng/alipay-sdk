package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;


/**
 * 活动修改接口
 *
 * @author auto create
 * @since 1.0, 2016-09-20 11:32:04
 */
@ApiModel
public class KoubeiMarketingCampaignActivityModifyModel extends AlipayObject {

    private static final long serialVersionUID = 2479723247285777219L;

    /**
     * 是否自动续期活动，仅当活动下券的有效期均为相对有效期时才能设置成Y
     */
    @JSONField(name = "auto_delay_flag", alternateNames = "autoDelayFlag")
    @ApiModelProperty(notes = "是否自动续期活动，仅当活动下券的有效期均为相对有效期时才能设置成Y")
    private String autoDelayFlag;

    /**
     * 活动预算
     */
    @JSONField(name = "budget_info", alternateNames = "budgetInfo")
    @ApiModelProperty(notes = "活动预算")
    private BudgetInfo budgetInfo;

    /**
     * 活动id
     */
    @JSONField(name = "camp_id", alternateNames = "campId")
    @ApiModelProperty(notes = "活动id")
    private String campId;

    /**
     * 活动限制信息
     */
    @JSONField(name = "constraint_info", alternateNames = "constraintInfo")
    @ApiModelProperty(notes = "活动限制信息")
    private ConstraintInfo constraintInfo;

    /**
     * 活动详细说明
     * 不允许修改，必须与活动详情查询的结果保持一致
     */
    @ApiModelProperty(notes = "活动详细说明不允许修改，必须与活动详情查询的结果保持一致")
    private String desc;

    /**
     * 活动结束时间
     * 活动结束时间只允许延长
     */
    @JSONField(name = "end_time", alternateNames = "endTime")
    @ApiModelProperty(notes = "活动结束时间活动结束时间只允许延长")
    private Date endTime;

    /**
     * 活动的扩展信息
     */
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    @ApiModelProperty(notes = "活动的扩展信息")
    private String extInfo;

    /**
     * 活动名称
     * 不允许修改，必须与活动详情查询的结果保持一致
     */
    @ApiModelProperty(notes = "活动名称不允许修改，必须与活动详情查询的结果保持一致")
    private String name;

    /**
     * 操作人id，必须和operator_type配对出现，不填时默认是商户
     */
    @JSONField(name = "operator_id", alternateNames = "operatorId")
    @ApiModelProperty(notes = "操作人id，必须和operator_type配对出现，不填时默认是商户")
    private String operatorId;

    /**
     * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
     */
    @JSONField(name = "operator_type", alternateNames = "operatorType")
    @ApiModelProperty(notes = "操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER")
    private String operatorType;

    /**
     * 外部批次ID，用户指定,每次请求保持唯一
     */
    @JSONField(name = "out_biz_no", alternateNames = "outBizNo")
    @ApiModelProperty(notes = "外部批次ID，用户指定,每次请求保持唯一")
    private String outBizNo;

    /**
     * 营销工具集
     */
    @JSONField(name = "promo_tools", alternateNames = "promoTools")
    @ApiModelProperty(notes = "营销工具集")
    private List<PromoTool> promoTools;

    /**
     * 投放渠道集，当活动类型为DIRECT_SEND或者REAL_TIME_SEND时必填，为CONSUME_SEND时必须为空
     */
    @JSONField(name = "publish_channels", alternateNames = "publishChannels")
    @ApiModelProperty(notes = "投放渠道集，当活动类型为DIRECT_SEND或者REAL_TIME_SEND时必填，为CONSUME_SEND时必须为空")
    private List<PublishChannel> publishChannels;

    /**
     * 招商工具
     */
    @JSONField(name = "recruit_tool", alternateNames = "recruitTool")
    @ApiModelProperty(notes = "招商工具")
    private RecruitTool recruitTool;

    /**
     * 活动开始时间
     * 不允许修改，必须与活动详情查询的结果保持一致
     */
    @JSONField(name = "start_time", alternateNames = "startTime")
    @ApiModelProperty(notes = "活动开始时间不允许修改，必须与活动详情查询的结果保持一致")
    private Date startTime;

    /**
     * 活动类型
     * 不允许修改，必须与活动详情查询的结果保持一致
     */
    @ApiModelProperty(notes = "活动类型不允许修改，必须与活动详情查询的结果保持一致")
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

    public String getCampId() {
        return this.campId;
    }

    public void setCampId(String campId) {
        this.campId = campId;
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
