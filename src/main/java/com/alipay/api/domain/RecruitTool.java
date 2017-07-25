package com.alipay.api.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 创建活动的招商信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 创建活动的招商信息")
public class RecruitTool implements Serializable {


    /**
     * 招商结束时间
     */
    @ApiModelProperty(notes = " 招商结束时间")
    @JSONField(name = "end_time", alternateNames = "endTime")
    private Date endTime;

    /**
     * 如果这个值是true,那么活动的参与门店不需要招商
     */
    @ApiModelProperty(notes = " 如果这个值是true,那么活动的参与门店不需要招商")
    @JSONField(name = "exclude_constraint_shops", alternateNames = "excludeConstraintShops")
    private Boolean excludeConstraintShops;

    /**
     * 招商pid和pid对应的门店列表（对于品牌商，此字段必填，活动和券的适用门店为空。对于商圈，此字段需为空，门店需要填在活动和券的适用门店上）
     */
    @ApiModelProperty(notes = " 招商pid和pid对应的门店列表（对于品牌商，此字段必填，活动和券的适用门店为空。对于商圈，此字段需为空，门店需要填在活动和券的适用门店上）")
    @JSONField(name = "pid_shops", alternateNames = "pidShops")
    private List<PidShopInfo> pidShops;

    /**
     * 招商开始时间
     */
    @ApiModelProperty(notes = " 招商开始时间")
    @JSONField(name = "start_time", alternateNames = "startTime")
    private Date startTime;

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getExcludeConstraintShops() {
        return this.excludeConstraintShops;
    }

    public void setExcludeConstraintShops(Boolean excludeConstraintShops) {
        this.excludeConstraintShops = excludeConstraintShops;
    }

    public List<PidShopInfo> getPidShops() {
        return this.pidShops;
    }

    public void setPidShops(List<PidShopInfo> pidShops) {
        this.pidShops = pidShops;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

}
