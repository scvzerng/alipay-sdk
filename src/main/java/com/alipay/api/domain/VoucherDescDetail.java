package com.alipay.api.domain;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 券的使用说明描述
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 券的使用说明描述")
public class VoucherDescDetail implements Serializable {


    /**
     * 具体描述信息列表
     */
    @ApiModelProperty(notes = " 具体描述信息列表")
    private List<String> details;

    /**
     * 图片描述信息
     */
    @ApiModelProperty(notes = " 图片描述信息")
    private List<String> images;

    /**
     * 券说明的标题
     */
    @ApiModelProperty(notes = " 券说明的标题")
    private String title;

    /**
     * 券外部详情描述
     */
    @ApiModelProperty(notes = " 券外部详情描述")
    private String url;

    public List<String> getDetails() {
        return this.details;
    }

    public void setDetails(List<String> details) {
        this.details = details;
    }

    public List<String> getImages() {
        return this.images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
