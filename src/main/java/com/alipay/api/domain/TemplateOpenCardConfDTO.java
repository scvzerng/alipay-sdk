package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * 模板开卡配置
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
@ApiModel(description = " 模板开卡配置")
public class TemplateOpenCardConfDTO implements Serializable {

    /**
     * ISV：外部系统
     * MER：直连商户
     */
    @ApiModelProperty(notes = " ISV：外部系统MER：直连商户")
    @JSONField(alternateNames = "openCardSourceType", name = "open_card_source_type")
    @EnumCheck(enums = {"ISV","MER"})
    private String openCardSourceType;

    /**
     * 渠道APPID，提供领卡页面的服务提供方
     */
    @ApiModelProperty(notes = " 渠道APPID，提供领卡页面的服务提供方")
    @JSONField(alternateNames = "sourceAppId", name = "source_app_id")
    @Length(min = 1,max = 32)
    private String sourceAppId;
    /**
     * 开卡连接，必须http、https开头
     */
    @ApiModelProperty(notes = " 开卡连接，必须http、https开头")
    @JSONField(alternateNames = "openCardUrl", name = "open_card_url")
    @Length(min = 1,max = 256)
    private String openCardUrl;

    /**
     * 配置，预留字段，暂时不用
     */
    @ApiModelProperty(notes = " 配置，预留字段，暂时不用")
    private String conf;




    public String getConf() {
        return this.conf;
    }

    public void setConf(String conf) {
        this.conf = conf;
    }

    public String getOpenCardSourceType() {
        return this.openCardSourceType;
    }

    public void setOpenCardSourceType(String openCardSourceType) {
        this.openCardSourceType = openCardSourceType;
    }

    public String getOpenCardUrl() {
        return this.openCardUrl;
    }

    public void setOpenCardUrl(String openCardUrl) {
        this.openCardUrl = openCardUrl;
    }

    public String getSourceAppId() {
        return this.sourceAppId;
    }

    public void setSourceAppId(String sourceAppId) {
        this.sourceAppId = sourceAppId;
    }

}
