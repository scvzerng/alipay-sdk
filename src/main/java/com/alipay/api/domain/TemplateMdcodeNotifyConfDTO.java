package com.alipay.api.domain;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

/**
 * 商户动态码通知参数配置：
 * 当write_off_type指定为商户动态码mdbarcode或mdqrcode时必填；
 * 在此字段配置用户打开会员卡时支付宝通知商户生成动态码（发码）的通知参数，如接收通知地址等。
 * Created by scvzerng on 2017/7/12.
 */
@ApiModel(description = " 商户动态码通知参数配置：")
public class TemplateMdcodeNotifyConfDTO implements Serializable {
    /**
     * 商户接收发码通知的地址链接；
     * 只支持https地址；
     * 用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。
     */
    @ApiModelProperty(notes = " 商户接收发码通知的地址链接； 只支持https地址； 用户打开会员卡时，支付宝提交POST请求此url地址，通知商户发码。")
    @Length(min = 1, max = 1024)
    private String url;
    /**
     * 扩展参数信息；
     * 格式为key-value键值对；
     * 支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数
     */
    @ApiModelProperty(notes = " 扩展参数信息； 格式为key-value键值对； 支付宝POST请求指定url时，除BizCardNo等固定参数外，将带上ext_params中配置的所有key-value参数")
    @JSONField(alternateNames = "extParams", name = "ext_params")
    private JSONObject extParams;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public JSONObject getExtParams() {
        return extParams;
    }

    public void setExtParams(JSONObject extParams) {
        this.extParams = extParams;
    }
}
