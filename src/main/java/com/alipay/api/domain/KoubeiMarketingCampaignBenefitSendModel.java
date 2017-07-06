package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

/**
 * 口碑权益发放接口
 *
 * @author auto create
 * @since 1.0, 2016-12-08 18:30:46
 */
@ApiModel(description = " 口碑权益发放接口")
public class KoubeiMarketingCampaignBenefitSendModel extends AlipayObject {
    private static final long serialVersionUID = 6292126411362721878L;

    /**
     * 领券渠道
     */
    @ApiModelProperty(notes = " 领券渠道")
    @NotBlank
    private String channel;

    /**
     * 优惠类型
     */
    @JSONField(name = "discount_type", alternateNames = "discountType")
    @ApiModelProperty(notes = " 优惠类型")
    @NotBlank
    private String discountType;

    /**
     * 触发权益的优惠id，当discount_type是ITEM的时候这个内容是商品id
     */
    @JSONField(name = "item_id", alternateNames = "itemId")
    @ApiModelProperty(notes = " 触发权益的优惠id，当discount_type是ITEM的时候这个内容是商品id")
    @NotBlank
    private String itemId;

    /**
     * 外部流水号，用于控制幂等
     */
    @JSONField(name = "out_biz_no", alternateNames = "outBizNo")
    @ApiModelProperty(notes = " 外部流水号，用于控制幂等")
    @NotBlank
    private String outBizNo;

    /**
     * 领券的门店id
     */
    @JSONField(name = "shop_id", alternateNames = "shopId")
    @ApiModelProperty(notes = " 领券的门店id")
    private String shopId;

    /**
     * 支付宝用户ID
     */
    @JSONField(name = "user_id", alternateNames = "userId")
    @ApiModelProperty(notes = " 支付宝用户ID")
    @NotBlank
    private String userId;

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getDiscountType() {
        return this.discountType;
    }

    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getOutBizNo() {
        return this.outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

    public String getShopId() {
        return this.shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
