package com.alipay.api.domain;

import java.math.BigDecimal;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 券的单品信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 券的单品信息")
public class ItemInfo  {


    /**
     * 券适用的单品码列表
     * 最少配置1个单品码
     * 最多配置500个单品码
     */
    @ApiModelProperty(notes = " 券适用的单品码列表 最少配置1个单品码 最多配置500个单品码")
    @JSONField(name = "item_ids", alternateNames = "itemIds")
    private List<String> itemIds;

    /**
     * 单品图片列表
     * 单品图片不能超过3张
     */
    @ApiModelProperty(notes = " 单品图片列表 单品图片不能超过3张")
    @JSONField(name = "item_imgs", alternateNames = "itemImgs")
    private List<String> itemImgs;

    /**
     * 单品券详细介绍跳转链接
     */
    @ApiModelProperty(notes = " 单品券详细介绍跳转链接")
    @JSONField(name = "item_link", alternateNames = "itemLink")
    private String itemLink;

    /**
     * 单品名称
     */
    @ApiModelProperty(notes = " 单品名称")
    @JSONField(name = "item_name", alternateNames = "itemName")
    private String itemName;

    /**
     * 单品券说明
     */
    @ApiModelProperty(notes = " 单品券说明")
    @JSONField(name = "item_text", alternateNames = "itemText")
    private String itemText;

    /**
     * 最高优惠商品件数
     */
    @ApiModelProperty(notes = " 最高优惠商品件数")
    @JSONField(name = "max_discount_num", alternateNames = "maxDiscountNum")
    private Integer maxDiscountNum;

    /**
     * 最低购买商品件数
     */
    @ApiModelProperty(notes = " 最低购买商品件数")
    @JSONField(name = "min_consume_num", alternateNames = "minConsumeNum")
    private Integer minConsumeNum;

    /**
     * 单品的原价，单位元
     * 必须为合法金额类型字符串，如9.99
     */
    @ApiModelProperty(notes = " 单品的原价，单位元 必须为合法金额类型字符串，如9.99")
    @JSONField(name = "original_price", alternateNames = "originalPrice")
    private BigDecimal originalPrice;

    public List<String> getItemIds() {
        return this.itemIds;
    }

    public void setItemIds(List<String> itemIds) {
        this.itemIds = itemIds;
    }

    public List<String> getItemImgs() {
        return this.itemImgs;
    }

    public void setItemImgs(List<String> itemImgs) {
        this.itemImgs = itemImgs;
    }

    public String getItemLink() {
        return this.itemLink;
    }

    public void setItemLink(String itemLink) {
        this.itemLink = itemLink;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemText() {
        return this.itemText;
    }

    public void setItemText(String itemText) {
        this.itemText = itemText;
    }

    public Integer getMaxDiscountNum() {
        return maxDiscountNum;
    }

    public void setMaxDiscountNum(Integer maxDiscountNum) {
        this.maxDiscountNum = maxDiscountNum;
    }

    public Integer getMinConsumeNum() {
        return minConsumeNum;
    }

    public void setMinConsumeNum(Integer minConsumeNum) {
        this.minConsumeNum = minConsumeNum;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }
}
