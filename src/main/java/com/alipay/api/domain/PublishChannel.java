package com.alipay.api.domain;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 投放渠道
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */@ApiModel(description = " 投放渠道")
public class PublishChannel extends AlipayObject {

    private static final long serialVersionUID = 6232418696891212327L;

    /**
     * 当type为MERCHANT_CROWD时，config需填入口令送的密码和图片，样例如下："config":"{\"PASSWORD\":\"口令送密码\",\"BACKGROUND_LOGO\":\"1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC\"}"
     */@ApiModelProperty(notes = " 当type为MERCHANT_CROWD时，config需填入口令送的密码和图片，样例如下："config":"{\"PASSWORD\":\"口令送密码\",\"BACKGROUND_LOGO\":\"1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC\"}"")
    private JSONObject config;

    /**
     * 扩展信息，无需配置
     */@ApiModelProperty(notes = " 扩展信息，无需配置")
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    private JSONObject extInfo;

    /**
     * 渠道名称
     */@ApiModelProperty(notes = " 渠道名称")
    private String name;

    /**
     * 渠道类型，目前支持以下类型：
     * QR_CODE：二维码投放；
     * SHORT_LINK：短连接投放；
     * SHOP_DETAIL：店铺页投放；
     * PAYMENT_RESULT：支付成功页；
     * MERCHANT_CROWD：口令送；
     * URL_WITH_TOKEN：外部发奖活动，只有活动类型为DIRECT_SEND时才支持；
     */@ApiModelProperty(notes = " 渠道类型，目前支持以下类型： QR_CODE：二维码投放； SHORT_LINK：短连接投放； SHOP_DETAIL：店铺页投放； PAYMENT_RESULT：支付成功页； MERCHANT_CROWD：口令送； URL_WITH_TOKEN：外部发奖活动，只有活动类型为DIRECT_SEND时才支持；")
    private String type;

    public JSONObject getConfig() {
        return config;
    }

    public void setConfig(JSONObject config) {
        this.config = config;
    }

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
