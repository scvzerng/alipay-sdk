package com.alipay.api.domain;

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 集点卡工具
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 集点卡工具")
public class PointCard implements Serializable {


    /**
     * 工具的描述
     */
    @ApiModelProperty(notes = " 工具的描述")
    private String desc;

    /**
     * 工具的有效期的结束时间（必须晚于活动的结束时间）
     */
    @ApiModelProperty(notes = " 工具的有效期的结束时间（必须晚于活动的结束时间）")
    @JSONField(name = "end_time", alternateNames = "endTime")
    private Date endTime;

    /**
     * 工具的LOGO文件ID
     */
    @ApiModelProperty(notes = " 工具的LOGO文件ID")
    private String logo;

    /**
     * 工具的名称
     */
    @ApiModelProperty(notes = " 工具的名称")
    private String name;

    /**
     * 工具的有效期的起始时间
     */
    @ApiModelProperty(notes = " 工具的有效期的起始时间")
    @JSONField(name = "start_time", alternateNames = "startTime")
    private Date startTime;

    /**
     * 工具类型，目前支持：
     * 集点卡：POINT_CARD
     */
    @ApiModelProperty(notes = " 工具类型，目前支持： 集点卡：POINT_CARD")
    private String type;

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

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
