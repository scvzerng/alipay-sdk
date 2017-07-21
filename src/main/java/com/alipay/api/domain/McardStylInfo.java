package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 会员卡卡面样式
 *
 * @author auto create
 * @since 1.0, 2017-06-06 17:13:14
 */
@ApiModel(description = " 会员卡卡面样式")
public class McardStylInfo extends AlipayObject {

    private static final long serialVersionUID = 7872157275816691632L;

    /**
     * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片
     * <p>
     * 图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；
     * 尺寸不小于1020*643px；
     * 图片不得有圆角，不得拉伸变形
     */
    @ApiModelProperty(notes = " 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；尺寸不小于1020*643px；图片不得有圆角，不得拉伸变形")
    @JSONField(alternateNames = "backgroundId", name = "background_id")
    private String backgroundId;

    /**
     * 背景色
     */
    @ApiModelProperty(notes = " 背景色")
    @JSONField(alternateNames = "bgColor", name = "bg_color")
    private String bgColor;

    /**
     * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片
     * <p>
     * 图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
     * 尺寸不小于500*500px的正方形；
     * 请优先使用商家LOGO；
     */
    @ApiModelProperty(notes = " logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；尺寸不小于500*500px的正方形；请优先使用商家LOGO；")
    @JSONField(alternateNames = "logoId", name = "logo_id")
    private String logoId;

    public String getBackgroundId() {
        return this.backgroundId;
    }

    public void setBackgroundId(String backgroundId) {
        this.backgroundId = backgroundId;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getLogoId() {
        return this.logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

}
