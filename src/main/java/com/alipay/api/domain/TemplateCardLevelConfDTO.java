package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * 会员卡级别配置信息
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
@ApiModel(description = " 会员卡级别配置信息")
public class TemplateCardLevelConfDTO implements Serializable {

    /**
     * 会员级别 该级别和开卡接口中的levle要一致
     */
    @ApiModelProperty(notes = " 会员级别 该级别和开卡接口中的levle要一致")
    @Length(min = 1,max = 64)
    private String level;

    /**
     * 会员级别描述
     */
    @ApiModelProperty(notes = " 会员级别描述")
    @JSONField(alternateNames = "levelDesc", name = "level_desc")
    @Length(min = 1,max = 4000)
    private String levelDesc;

    /**
     * 会员级别对应icon， 通过接口（alipay.offline.material.image.upload）上传图片
     */
    @ApiModelProperty(notes = " 会员级别对应icon， 通过接口（alipay.offline.material.image.upload）上传图片")
    @JSONField(alternateNames = "levelIcon", name = "level_icon")
    @Length(min = 1,max = 64)
    private String levelIcon;

    /**
     * 会员级别显示名称
     */
    @ApiModelProperty(notes = " 会员级别显示名称")
    @JSONField(alternateNames = "levelShowName", name = "level_show_name")
    @Length(min = 1,max = 64)
    private String levelShowName;

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelDesc() {
        return this.levelDesc;
    }

    public void setLevelDesc(String levelDesc) {
        this.levelDesc = levelDesc;
    }

    public String getLevelIcon() {
        return this.levelIcon;
    }

    public void setLevelIcon(String levelIcon) {
        this.levelIcon = levelIcon;
    }

    public String getLevelShowName() {
        return this.levelShowName;
    }

    public void setLevelShowName(String levelShowName) {
        this.levelShowName = levelShowName;
    }

}
