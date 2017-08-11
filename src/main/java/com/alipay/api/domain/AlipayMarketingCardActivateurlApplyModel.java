package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 会员卡领卡链接获取接口
 *
 * @author auto create
 * @since 1.0, 2017-04-06 11:10:44
 */
@ApiModel(description = " 会员卡领卡链接获取接口")
public class AlipayMarketingCardActivateurlApplyModel extends AlipayObject {

    private static final long serialVersionUID = 8729444165126556394L;

    /**
     * 会员卡开卡表单提交后回调地址。
     * 1.该地址不可带参数，如需回传参数，可设置out_string入参。
     * 2.若不设置回调地址，则会员卡开卡表单提交后跳转到应用配置的授权地址。
     */
    @ApiModelProperty(notes = " 会员卡开卡表单提交后回调地址。1.该地址不可带参数，如需回传参数，可设置out_string入参。2.若不设置回调地址，则会员卡开卡表单提交后跳转到应用配置的授权地址。")
    private String callback;

    /**
     * 扩展信息，会员领卡完成后将此参数原样带回商户页面。
     */
    @JSONField(alternateNames = "outString", name = "out_string")
    @ApiModelProperty(notes = " 扩展信息，会员领卡完成后将此参数原样带回商户页面。")
    private String outString;

    /**
     * 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果
     */
    @JSONField(alternateNames = "templateId", name = "template_id")
    @ApiModelProperty(notes = " 会员卡模板id。使用会员卡模板创建接口(alipay.marketing.card.template.create)返回的结果")
    private String templateId;

    /**
     * 需要关注的生活号AppId。若需要在领卡页面展示“关注生活号”提示，可设置此参数为待关注的生活号AppId
     */
    @JSONField(alternateNames = "followAppId", name = "follow_app_id")
    @ApiModelProperty(notes = " 需要关注的生活号AppId。若需要在领卡页面展示“关注生活号”提示，可设置此参数为待关注的生活号AppId")
    private String followAppId;

    public String getCallback() {
        return this.callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }

    public String getOutString() {
        return this.outString;
    }

    public void setOutString(String outString) {
        this.outString = outString;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getFollowAppId() {
        return followAppId;
    }

    public void setFollowAppId(String followAppId) {
        this.followAppId = followAppId;
    }
}
