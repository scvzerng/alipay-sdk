package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 通知消息
 *
 * @author auto create
 * @since 1.0, 2017-06-06 17:13:14
 */
@ApiModel(description = " 通知消息")
public class McardNotifyMessage extends AlipayObject {

    private static final long serialVersionUID = 7516739427689434568L;

    /**
     * 用户提醒信息，按如下格式拼装，需要ISV提供change_reason。
     * 积分变动模板：{change_reason}，您的积分有变动
     * 余额变动模板：{change_reason}，您的余额有变动
     * 等级变更无需提供原因。
     */
    @ApiModelProperty(notes = " 用户提醒信息，按如下格式拼装，需要ISV提供change_reason。积分变动模板：{change_reason}，您的积分有变动余额变动模板：{change_reason}，您的余额有变动等级变更无需提供原因。")
    @JSONField(alternateNames = "changeReason", name = "change_reason")
    private String changeReason;

    /**consume
     * JSON格式扩展信息，主要是发送消息中的变量
     */
    @ApiModelProperty(notes = " JSON格式扩展信息，主要是发送消息中的变量")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    private String extInfo;

    /**
     * 消息类型，每种消息都定义了固定消息模板，
     * POINT_UPDATE：积分变更消息
     * BALANCE_UPDATE：余额变更消息
     * LEVEL_UPDATE：等级变更消息
     */
    @ApiModelProperty(notes = " 消息类型，每种消息都定义了固定消息模板，POINT_UPDATE：积分变更消息BALANCE_UPDATE：余额变更消息LEVEL_UPDATE：等级变更消息")
    @JSONField(alternateNames = "messageType", name = "message_type")
    @NotNull
    private String messageType;

    public String getChangeReason() {
        return this.changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason;
    }

    public String getExtInfo() {
        return this.extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

}
