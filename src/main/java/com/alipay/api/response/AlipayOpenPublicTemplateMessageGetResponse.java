package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.fastjson.NormalizerJSON;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.open.public.template.message.get response.
 *
 * @author auto create
 * @since 1.0, 2016-12-08 11:44:54
 */@ApiModel(description = " ALIPAY API: alipay.open.public.template.message.get response.")
@NormalizerJSON(false)
public class AlipayOpenPublicTemplateMessageGetResponse extends AlipayResponse {

    private static final long serialVersionUID = 4439562879856576129L;

    /**
     * 消息模板id--商户领取母版后生成的唯一模板id
     */@ApiModelProperty(notes = " 消息模板id--商户领取母版后生成的唯一模板id")@JSONField(name = "msg_template_id", alternateNames = "msgTemplateId")
    private String msgTemplateId;

    /**
     * 模板内容
     */@ApiModelProperty(notes = " 模板内容")
    private String template;

    public void setMsgTemplateId(String msgTemplateId) {
        this.msgTemplateId = msgTemplateId;
    }

    public String getMsgTemplateId() {
        return this.msgTemplateId;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public String getTemplate() {
        return this.template;
    }

}
