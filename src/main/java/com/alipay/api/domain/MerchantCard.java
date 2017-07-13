package com.alipay.api.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EndDate;
import io.swagger.annotations.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * 商户卡信息
 *
 * @author auto create
 * @since 1.0, 2017-03-31 11:06:36
 */
@ApiModel(description = " 商户卡信息")
public class MerchantCard extends AlipayObject {

    private static final long serialVersionUID = 6577613967729739155L;

    /**
     * 资金卡余额，单位：元，精确到小数点后两位。
     */
    @ApiModelProperty(notes = " 资金卡余额，单位：元，精确到小数点后两位。")
    private String balance;

    /**
     * 支付宝业务卡号
     * 说明：
     * 1、开卡成功后返回该参数，需要保存留用；
     * 2、开卡/更新/删卡/查询卡接口请求中不需要传该参数；
     */
    @ApiModelProperty(notes = " 支付宝业务卡号 说明： 1、开卡成功后返回该参数，需要保存留用； 2、开卡/更新/删卡/查询卡接口请求中不需要传该参数；")
    @JSONField(alternateNames = "bizCardNo", name = "biz_card_no")
    private String bizCardNo;

    /**
     * 商户外部会员卡卡号
     * 说明：
     * 1、会员卡开卡接口，如果卡类型为外部会员卡，请求中则必须提供该参数；
     * 2、更新、查询、删除等接口，请求中则不需要提供该参数值；
     */
    @ApiModelProperty(notes = " 商户外部会员卡卡号 说明： 1、会员卡开卡接口，如果卡类型为外部会员卡，请求中则必须提供该参数； 2、更新、查询、删除等接口，请求中则不需要提供该参数值；")
    @JSONField(alternateNames = "externalCardNo", name = "external_card_no")
    private String externalCardNo;

    /**
     * 会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）
     */
    @ApiModelProperty(notes = " 会员卡等级（由商户自定义，并可以在卡模板创建时，定义等级信息）")
    private String level;

    /**
     * 会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss
     */
    @ApiModelProperty(notes = " 会员卡开卡时间，格式为yyyy-MM-dd HH:mm:ss")
    @JSONField(alternateNames = "openDate", name = "open_date", format = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date openDate;

    /**
     * 会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）
     */
    @ApiModelProperty(notes = " 会员卡积分，积分必须为数字型（可为浮点型，带2位小数点）")
    private Double point;

    /**
     * 会员卡更换不同的卡模板（该参数仅用在会员卡更新接口中）
     */
    @ApiModelProperty(notes = " 会员卡更换不同的卡模板（该参数仅用在会员卡更新接口中）")
    @JSONField(alternateNames = "templateId", name = "template_id")
    private String templateId;

    /**
     * 会员卡有效期
     */
    @ApiModelProperty(notes = " 会员卡有效期")
    @EndDate(field = "openDate")
    @JSONField(alternateNames = "validDate", name = "valid_date",format = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date validDate;

    public String getBalance() {
        return this.balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getBizCardNo() {
        return this.bizCardNo;
    }

    public void setBizCardNo(String bizCardNo) {
        this.bizCardNo = bizCardNo;
    }

    public String getExternalCardNo() {
        return this.externalCardNo;
    }

    public void setExternalCardNo(String externalCardNo) {
        this.externalCardNo = externalCardNo;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getOpenDate() {
        return this.openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Date getValidDate() {
        return validDate;
    }

    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }
}
