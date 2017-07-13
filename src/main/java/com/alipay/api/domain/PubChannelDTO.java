package com.alipay.api.domain;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 卡模板投放渠道
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
@ApiModel(description = " 卡模板投放渠道")
public class PubChannelDTO implements Serializable {

    /**
     * 1、SHOP_DETAIL:店铺详情页
     * 2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）
     */
    @ApiModelProperty(notes = " 1、SHOP_DETAIL:店铺详情页 2、PAYMENT_RESULT: 支付成功页（支付成功页暂不支持）")
    @JSONField(alternateNames = "pubChannel", name = "pub_channel")
    @EnumCheck(enums = {"SHOP_DETAIL","PAYMENT_RESULT"})
    private String pubChannel;
    /**
     * 扩展信息，无需配置
     */
    @ApiModelProperty(notes = " 扩展信息，无需配置")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    @NotNull
    private String extInfo;

    public String getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(String extInfo) {
        this.extInfo = extInfo;
    }

    public String getPubChannel() {
        return this.pubChannel;
    }

    public void setPubChannel(String pubChannel) {
        this.pubChannel = pubChannel;
    }

}
