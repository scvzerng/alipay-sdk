package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 会员卡更新
 *
 * @author auto create
 * @since 1.0, 2016-10-27 11:06:37
 */
@ApiModel(description = " 会员卡更新")
public class AlipayMarketingCardUpdateModel extends AlipayObject {

    private static final long serialVersionUID = 1691428457819822632L;

    /**
     * 需要修改的最新卡信息
     */
    @ApiModelProperty(notes = " 需要修改的最新卡信息")
    @JSONField(alternateNames = "cardInfo", name = "card_info")
    @NotNull
    private MerchantCard cardInfo;

    /**
     * 扩展信息(暂时无用)
     */
    @ApiModelProperty(notes = " 扩展信息(暂时无用)")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    private String extInfo;

    /**
     * 标识业务发生的时间
     */
    @ApiModelProperty(notes = " 标识业务发生的时间")
    @JSONField(alternateNames = "occurTime", name = "occur_time", format = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date occurTime;

    /**
     * 支付宝业务卡号，开卡接口中返回获取
     */
    @ApiModelProperty(notes = " 支付宝业务卡号，开卡接口中返回获取")
    @JSONField(alternateNames = "targetCardNo", name = "target_card_no")
    @NotNull
    private String targetCardNo;

    /**
     * 卡号ID类型
     * BIZ_CARD：支付宝业务卡号
     */
    @ApiModelProperty(notes = " 卡号ID类型 BIZ_CARD：支付宝业务卡号")
    @JSONField(alternateNames = "targetCardNoType", name = "target_card_no_type")
    @NotNull
    @EnumCheck(enums = {"BIZ_CARD"})
    private String targetCardNoType;
    /**
     * 会员卡卡面展示样式
     * 参考：展示位置详情参考"商户会员卡->快速接入文档->第四步"
     * 备注：mcard_style_info与card_info下的template_id不能同时更新
     */
    @ApiModelProperty(notes = " 会员卡卡面展示样式参考：展示位置详情参考 商户会员卡->快速接入文档->第四步 备注：mcard_style_info与card_info下的template_id不能同时更新")
    @JSONField(alternateNames = "mcardStyleInfo", name = "mcard_style_info")
    private McardStylInfo mcardStyleInfo;



    /**
     * 卡信息变更通知消息
     * 1、在列表中定义的消息，才会发送给用户，消息格式一定。
     * <p>
     * 2、根据卡信息变更情况，一次可发送多个消息
     */
    @ApiModelProperty(notes = " 卡信息变更通知消息1、在列表中定义的消息，才会发送给用户，消息格式一定。2、根据卡信息变更情况，一次可发送多个消息")
    @JSONField(alternateNames = "notifyMessages", name = "notify_messages")
    private List<McardNotifyMessage> notifyMessages;

    public MerchantCard getCardInfo() {
        return this.cardInfo;
    }

    public void setCardInfo(MerchantCard cardInfo) {
        this.cardInfo = cardInfo;
    }

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public Date getOccurTime() {
        return this.occurTime;
    }

    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
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

    public McardStylInfo getMcardStyleInfo() {
        return mcardStyleInfo;
    }

    public void setMcardStyleInfo(McardStylInfo mcardStyleInfo) {
        this.mcardStyleInfo = mcardStyleInfo;
    }

    public List<McardNotifyMessage> getNotifyMessages() {
        return notifyMessages;
    }

    public void setNotifyMessages(List<McardNotifyMessage> notifyMessages) {
        this.notifyMessages = notifyMessages;
    }
}
