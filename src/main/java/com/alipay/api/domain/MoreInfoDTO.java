package com.alipay.api.domain;

import java.io.Serializable;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

/**
 * 模板栏位的扩展信息
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
@ApiModel(description = " 模板栏位的扩展信息")
public class MoreInfoDTO implements Serializable {

    /**
     * 二级页面标题
     */
    @ApiModelProperty(notes = " 二级页面标题")
    @Length(min = 1,max = 16)
    private String title;

    /**
     * 扩展参数，需要URL地址回带的值，JSON格式(openweb时填)
     */
    @ApiModelProperty(notes = " 扩展参数，需要URL地址回带的值，JSON格式(openweb时填)")
    private JSONObject params;

    /**
     * 选择opennative的时候必须填写descs的内容
     */
    @ApiModelProperty(notes = " 选择opennative的时候必须填写descs的内容")
    private List<String> descs;
    /**
     * 超链接(选择openweb的时候必须填写url参数内容)
     */
    @ApiModelProperty(notes = " 超链接(选择openweb的时候必须填写url参数内容)")
    private String url;





    public List<String> getDescs() {
        return this.descs;
    }

    public void setDescs(List<String> descs) {
        this.descs = descs;
    }

    public JSONObject getParams() {
        return params;
    }

    public void setParams(JSONObject params) {
        this.params = params;
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
