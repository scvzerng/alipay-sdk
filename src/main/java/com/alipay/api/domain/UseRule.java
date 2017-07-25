package com.alipay.api.domain;

import java.math.BigDecimal;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 券的使用规则信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 券的使用规则信息")
public class UseRule {


    /**
     * 扩展属性，无需设置
     */
    @ApiModelProperty(notes = " 扩展属性，无需设置")
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    private JSONObject extInfo;

    /**
     * 券的不可用时间
     */
    @ApiModelProperty(notes = " 券的不可用时间")
    @JSONField(name = "forbidden_time", alternateNames = "forbiddenTime")
    private ForbbidenTime forbiddenTime;

    /**
     * 券核销的最低消费门槛，单位元
     */
    @ApiModelProperty(notes = " 券核销的最低消费门槛，单位元")
    @JSONField(name = "min_consume", alternateNames = "minConsume")
    private BigDecimal minConsume;

    /**
     * 券买单跳转链接
     */
    @ApiModelProperty(notes = " 券买单跳转链接")
    @JSONField(name = "pay_redirect_url", alternateNames = "payRedirectUrl")
    private String payRedirectUrl;

    /**
     * 券适用门店列表
     * 仅品牌商发起的招商活动可为空
     * 直发奖类型活动必须与活动适用门店一致
     * 最多支持10w家门店
     */
    @ApiModelProperty(notes = " 券适用门店列表仅品牌商发起的招商活动可为空直发奖类型活动必须与活动适用门店一致最多支持10w家门店")
    @JSONField(name = "suit_shops", alternateNames = "suitShops")
    private List<String> suitShops;

    /**
     * 券可用时间段
     */
    @ApiModelProperty(notes = " 券可用时间段")
    @JSONField(name = "use_time", alternateNames = "useTime")
    private List<UseTime> useTime;

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public ForbbidenTime getForbiddenTime() {
        return this.forbiddenTime;
    }

    public void setForbiddenTime(ForbbidenTime forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
    }

    public BigDecimal getMinConsume() {
        return minConsume;
    }

    public void setMinConsume(BigDecimal minConsume) {
        this.minConsume = minConsume;
    }

    public String getPayRedirectUrl() {
        return this.payRedirectUrl;
    }

    public void setPayRedirectUrl(String payRedirectUrl) {
        this.payRedirectUrl = payRedirectUrl;
    }

    public List<String> getSuitShops() {
        return this.suitShops;
    }

    public void setSuitShops(List<String> suitShops) {
        this.suitShops = suitShops;
    }

    public List<UseTime> getUseTime() {
        return this.useTime;
    }

    public void setUseTime(List<UseTime> useTime) {
        this.useTime = useTime;
    }

}
