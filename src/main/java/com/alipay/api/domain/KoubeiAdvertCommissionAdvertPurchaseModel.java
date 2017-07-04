package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 广告推广用于参与接口
 *
 * @author auto create
 * @since 1.0, 2017-01-17 21:29:21
 */
@ApiModel(description = " 广告推广用于参与接口")
public class KoubeiAdvertCommissionAdvertPurchaseModel extends AlipayObject {

    private static final long serialVersionUID = 5593151481292123338L;

    /**
     * 渠道ID
     */
    @ApiModelProperty(notes = " 渠道ID")
    @ApiField("channel_id")
    private String channelId;

    /**
     * 外部用户唯一标识(用于生成校验码，只有白名单ISV才可不填)
     */
    @ApiModelProperty(notes = " 外部用户唯一标识(用于生成校验码，只有白名单ISV才可不填)")
    @ApiField("out_unique_id")
    @NotBlank
    private String outUniqueId;

    /**
     * 校验码（只有白名单ISV才可不填）
     * <p>
     * 生成地址：
     * http://pin.aliyun.com/get_img
     * 参数：
     * sessionid-外部用户唯一标识(和上面的out_unique_id保持一致)
     * identity-固定值，请输入kbadvert
     * type-验证码图片类型
     * 【type取值说明】
     * type - 内容 - 尺寸
     * default - 4位数字&大小写 - 100x30
     * number - 6位纯数字 - 100x30
     * 150_40 - 4位数字&大小写 - 150x40
     * <p>
     * 请求示例：http://pin.aliyun.com/get_img?sessionid=13000000000&identity=kbadvert&type=default
     * <p>
     * 验证码校验地址示例：http://pin.aliyun.com/check_code?sessionid=13000000000&identity=kbadvert&code=PNRT
     */
    @ApiModelProperty(notes = " 校验码（只有白名单ISV才可不填）生成地址：http://pin.aliyun.com/get_img参数：sessionid-外部用户唯一标识(和上面的out_unique_id保持一致)identity-固定值，请输入kbadverttype-验证码图片类型【type取值说明】type - 内容 - 尺寸default - 4位数字&大小写 - 100x30number - 6位纯数字 - 100x30150_40 - 4位数字&大小写 - 150x40请求示例：http://pin.aliyun.com/get_img?sessionid=13000000000&identity=kbadvert&type=default验证码校验地址示例：http://pin.aliyun.com/check_code?sessionid=13000000000&identity=kbadvert&code=PNRT")
    @ApiField("security_code")
    private String securityCode;

    /**
     * 推广参与打标(无实际业务作用，后期可供ISV分析不同渠道的推广效能)
     */
    @ApiModelProperty(notes = " 推广参与打标(无实际业务作用，后期可供ISV分析不同渠道的推广效能)")
    @ApiField("tag")
    private String tag;

    /**
     * 参与主键列表
     * trigger_identify_type=advert所有值都必须是广告ID
     */
    @ApiModelProperty(notes = " 参与主键列表trigger_identify_type=advert所有值都必须是广告ID")
    @ApiListField("trigger_identifies")
    @ApiField("string")
    @NotNull
    private List<String> triggerIdentifies;

    /**
     * 参与主键类型
     * advert-广告ID
     */
    @ApiModelProperty(notes = " 参与主键类型advert-广告ID")
    @ApiField("trigger_identify_type")
    @EnumCheck(enums = "advert")
    private String triggerIdentifyType;

    /**
     * 用户身份主键
     * user_identify_type=phone-值必须是用户手机号
     * user_identify_type=logon_id-值必须是用户支付宝登录账号
     */
    @ApiModelProperty(notes = " 用户身份主键user_identify_type=phone-值必须是用户手机号user_identify_type=logon_id-值必须是用户支付宝登录账号")
    @ApiField("user_identify")
    @NotBlank
    private String userIdentify;

    /**
     * 用户身份主键类型
     * phone-手机号
     * logon_id-支付宝登录账号
     * user_id - 支付宝账户ID
     */
    @ApiModelProperty(notes = " 用户身份主键类型phone-手机号logon_id-支付宝登录账号user_id - 支付宝账户ID")
    @ApiField("user_identify_type")
    @EnumCheck(enums = {"phone","logon_id","user_id"})
    private String userIdentifyType;

    public String getChannelId() {
        return this.channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getOutUniqueId() {
        return this.outUniqueId;
    }

    public void setOutUniqueId(String outUniqueId) {
        this.outUniqueId = outUniqueId;
    }

    public String getSecurityCode() {
        return this.securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public List<String> getTriggerIdentifies() {
        return this.triggerIdentifies;
    }

    public void setTriggerIdentifies(List<String> triggerIdentifies) {
        this.triggerIdentifies = triggerIdentifies;
    }

    public String getTriggerIdentifyType() {
        return this.triggerIdentifyType;
    }

    public void setTriggerIdentifyType(String triggerIdentifyType) {
        this.triggerIdentifyType = triggerIdentifyType;
    }

    public String getUserIdentify() {
        return this.userIdentify;
    }

    public void setUserIdentify(String userIdentify) {
        this.userIdentify = userIdentify;
    }

    public String getUserIdentifyType() {
        return this.userIdentifyType;
    }

    public void setUserIdentifyType(String userIdentifyType) {
        this.userIdentifyType = userIdentifyType;
    }

}
