package com.alipay.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 活动限制信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 活动限制信息")
public class ConstraintInfo implements Serializable {

    /**
     * 人群规则组ID
     * 仅直发奖类型活动设置有效，通过调用营销活动人群组规则创建接口参数返回
     */
    @ApiModelProperty(notes = " 人群规则组ID 仅直发奖类型活动设置有效，通过调用营销活动人群组规则创建接口参数返回")
    @JSONField(name = "crowd_group_id", alternateNames = "crowdGroupId")
    private String crowdGroupId;

    /**
     * 针对指定人群的约束条件
     */
    @ApiModelProperty(notes = " 针对指定人群的约束条件")
    @JSONField(name = "crowd_restriction", alternateNames = "crowdRestriction")
    private String crowdRestriction;

    /**
     * 单品码列表
     * 仅在创建消费单品送活动时设置，最多设置500个单品码,由商户根据自己的商品管理自定义，一般为国标码
     */
    @ApiModelProperty(notes = " 单品码列表 仅在创建消费单品送活动时设置，最多设置500个单品码,由商户根据自己的商品管理自定义，一般为国标码")
    @JSONField(name = "item_ids", alternateNames = "itemIds")
    private List<String> itemIds;

    /**
     * 最低消费金额，单位元
     * 仅在创建消费送礼包活动时设置
     */
    @ApiModelProperty(notes = " 最低消费金额，单位元 仅在创建消费送礼包活动时设置")
    @JSONField(name = "min_cost", alternateNames = "minCost")
    private BigDecimal minCost;

    /**
     * 活动适用的门店列表
     * 仅品牌商发起的招商活动可为空
     * 最多支持10w家门店
     */
    @ApiModelProperty(notes = " 活动适用的门店列表 仅品牌商发起的招商活动可为空 最多支持10w家门店")
    @JSONField(name = "suit_shops", alternateNames = "suitShops")
    private List<String> suitShops;

    /**
     * 活动期间用户能够参与的次数限制
     * 如果不设置则不限制参与次数
     */
    @ApiModelProperty(notes = " 活动期间用户能够参与的次数限制 如果不设置则不限制参与次数")
    @JSONField(name = "user_win_count", alternateNames = "userWinCount")
    private Short userWinCount;

    /**
     * 活动期间用户能够参与的频率限制
     * 如果不设置则不限制参与频率
     * 每日中奖1次: D||1
     * 每周中奖2次: W||2
     * 每月中奖3次: M||3
     */
    @ApiModelProperty(notes = " 活动期间用户能够参与的频率限制 如果不设置则不限制参与频率 每日中奖1次: D||1 每周中奖2次: W||2 每月中奖3次: M||3")
    @JSONField(name = "user_win_frequency", alternateNames = "userWinFrequency")
    private String userWinFrequency;

    public String getCrowdGroupId() {
        return this.crowdGroupId;
    }

    public void setCrowdGroupId(String crowdGroupId) {
        this.crowdGroupId = crowdGroupId;
    }

    public String getCrowdRestriction() {
        return this.crowdRestriction;
    }

    public void setCrowdRestriction(String crowdRestriction) {
        this.crowdRestriction = crowdRestriction;
    }

    public List<String> getItemIds() {
        return this.itemIds;
    }

    public void setItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
    }

    public BigDecimal getMinCost() {
        return minCost;
    }

    public void setMinCost(BigDecimal minCost) {
        this.minCost = minCost;
    }

    public List<String> getSuitShops() {
        return this.suitShops;
    }

    public void setSuitShops(List<String> suitShops) {
        this.suitShops = suitShops;
    }

    public Short getUserWinCount() {
        return userWinCount;
    }

    public void setUserWinCount(Short userWinCount) {
        this.userWinCount = userWinCount;
    }

    public String getUserWinFrequency() {
        return this.userWinFrequency;
    }

    public void setUserWinFrequency(String userWinFrequency) {
        this.userWinFrequency = userWinFrequency;
    }

}
