package com.alipay.api.domain;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;

/**
 * 卡模板样式信息
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:45
 */
@ApiModel(description = " 卡模板样式信息")
public class TemplateStyleInfoDTO implements Serializable {
    /**
     * 钱包端显示名称（字符串长度）
     */
    @ApiModelProperty(notes = " 钱包端显示名称（字符串长度）")
    @JSONField(alternateNames = "cardShowName", name = "card_show_name")
    @Length(min = 1,max = 10)
    private String cardShowName;

    /**
     * logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片
     * <p>
     * 图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；
     * 尺寸不小于500*500px的正方形；
     * 请优先使用商家LOGO；
     */
    @ApiModelProperty(notes = " logo的图片ID，通过接口（alipay.offline.material.image.upload）上传图片图片说明：1M以内，格式bmp、png、jpeg、jpg、gif；尺寸不小于500*500px的正方形；请优先使用商家LOGO；")
    @JSONField(alternateNames = "logoId", name = "logo_id")
    @Length(min = 1,max = 1000)
    private String logoId;

    /**
     * 卡片颜色
     */
    @ApiModelProperty(notes = " 卡片颜色")
    @Length(min = 1,max = 64)
    private String color;

    /**
     * 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片
     * <p>
     * 图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；
     * 尺寸不小于1020*643px；
     * 图片不得有圆角，不得拉伸变形
     */
    @ApiModelProperty(notes = " 背景图片Id，通过接口（alipay.offline.material.image.upload）上传图片图片说明：2M以内，格式：bmp、png、jpeg、jpg、gif；尺寸不小于1020*643px；图片不得有圆角，不得拉伸变形")
    @JSONField(alternateNames = "backgroundId", name = "background_id")
    @Length(min = 1,max = 1000)
    private String backgroundId;

    /**
     * 背景色
     */
    @ApiModelProperty(notes = " 背景色")
    @JSONField(alternateNames = "bgColor", name = "bg_color")
    @Length(min = 1,max = 32)
    private String bgColor;


    /**
     * 特色信息，用于领卡预览
     */
    @ApiModelProperty(notes = " 特色信息，用于领卡预览")
    @JSONField(alternateNames = "featureDescriptions", name = "feature_descriptions")
    private List<String> featureDescriptions;


    /**
     * 标语
     */
    @ApiModelProperty(notes = " 标语")
    @Length(max = 100)
    private String slogan;


    /**
     * 标语图片， 通过接口（alipay.offline.material.image.upload）上传图片
     */
    @ApiModelProperty(notes = " 标语图片， 通过接口（alipay.offline.material.image.upload）上传图片")
    @JSONField(alternateNames = "sloganImgId", name = "slogan_img_id")
    @Length(max = 100)
    private String sloganImgId;
    /**
     * 品牌商名称
     */
    @ApiModelProperty(notes = " 品牌商名称")
    @JSONField(alternateNames = "brandName", name = "brand_name")
    @Length(max = 100)
    private String brandName;



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

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCardShowName() {
        return this.cardShowName;
    }

    public void setCardShowName(String cardShowName) {
        this.cardShowName = cardShowName;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getFeatureDescriptions() {
        return this.featureDescriptions;
    }

    public void setFeatureDescriptions(List<String> featureDescriptions) {
        this.featureDescriptions = featureDescriptions;
    }

    public String getLogoId() {
        return this.logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public String getSlogan() {
        return this.slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getSloganImgId() {
        return this.sloganImgId;
    }

    public void setSloganImgId(String sloganImgId) {
        this.sloganImgId = sloganImgId;
    }

}
