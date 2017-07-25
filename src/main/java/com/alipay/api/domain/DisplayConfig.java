package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import java.io.Serializable;

/**
 * 券的描述信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 券的描述信息")
public class DisplayConfig implements Serializable {


    /**
     * 券的宣传语
     * 含圈人的直领活动，且投放渠道选择了支付成功页或店铺的情况下必填
     */
    @ApiModelProperty(notes = " 券的宣传语 含圈人的直领活动，且投放渠道选择了支付成功页或店铺的情况下必填")
    private String slogan;

    /**
     * 券的宣传图片文件ID
     * 含圈人的直领活动，且投放渠道选择了店铺的情况下必填
     */
    @ApiModelProperty(notes = " 券的宣传图片文件ID 含圈人的直领活动，且投放渠道选择了店铺的情况下必填")
    @JSONField(name = "slogan_img", alternateNames = "sloganImg")
    private String sloganImg;

    public String getSlogan() {
        return this.slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getSloganImg() {
        return this.sloganImg;
    }

    public void setSloganImg(String sloganImg) {
        this.sloganImg = sloganImg;
    }

}
