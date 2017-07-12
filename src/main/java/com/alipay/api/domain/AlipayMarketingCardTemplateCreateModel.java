package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * 会员卡模板创建
 *
 * @author auto create
 * @since 1.0, 2016-12-22 10:40:36
 */
@ApiModel(description = " 会员卡模板创建")
public class AlipayMarketingCardTemplateCreateModel extends AlipayObject {

    private static final long serialVersionUID = 5269397714928622363L;
    /**
     * 请求ID，由开发者生成并保证唯一性
     */
    @ApiModelProperty(notes = " 请求ID，由开发者生成并保证唯一性")
    @JSONField(alternateNames = "requestId", name = "request_id")
    @NotBlank
    @Length(max = 32)
    private String requestId;

    /**
     * 卡类型为固定枚举类型，可选类型如下：
     * OUT_MEMBER_CARD：外部权益卡
     */
    @ApiModelProperty(notes = " 卡类型为固定枚举类型，可选类型如下： OUT_MEMBER_CARD：外部权益卡")
    @JSONField(alternateNames = "cardType", name = "card_type")
    @EnumCheck(enums = "OUT_MEMBER_CARD")
    @Length(max = 32)
    private String cardType;

    /**
     * 业务卡号前缀，由商户自定义
     */
    @ApiModelProperty(notes = " 业务卡号前缀，由商户自定义")
    @JSONField(alternateNames = "bizNoPrefix", name = "biz_no_prefix")
    @Length(max = 32)
    private String bizNoPrefix;

    /**
     * 业务卡号后缀长度，最大int值不能超过32-biz_no_suffix长度
     */
    @ApiModelProperty(notes = " 业务卡号后缀长度，最大int值不能超过32-biz_no_suffix长度")
    @JSONField(alternateNames = "bizNoSuffixLen", name = "biz_no_suffix_len")
    @NotNull
    @Max(32)
    private Integer bizNoSuffixLen;

    /**
     * 卡包详情页面中展现出的卡码（可用于扫码核销）
     * qrcode: 二维码
     * dqrcode: 动态二维码
     * barcode: 条码
     * dbarcode: 动态条码
     * text: 文本
     * mdbarcode: 商户动态条码
     * mdqrcode: 商户动态二维码
     */
    @ApiModelProperty(notes = " 卡包详情页面中展现出的卡码（可用于扫码核销） qrcode: 二维码 dqrcode: 动态二维码 barcode: 条码 dbarcode: 动态条码 text: 文本")
    @JSONField(alternateNames = "writeOffType", name = "write_off_type")
    @EnumCheck(enums = {"qrcode", "dqrcode", "barcode", "dbarcode", "text", "mdbarcode", "mdqrcode"})
    private String writeOffType;
    /**
     * 卡级别配置
     */
    @ApiModelProperty(notes = " 卡级别配置")
    @JSONField(alternateNames = "cardLevelConf", name = "card_level_conf")
    private List<TemplateCardLevelConfDTO> cardLevelConf;


    /**
     * 栏位信息
     */
    @ApiModelProperty(notes = " 栏位信息")
    @JSONField(alternateNames = "columnInfoList", name = "column_info_list")
    @NotNull
    private List<TemplateColumnInfoDTO> columnInfoList;

    /**
     * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，
     * 例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
     */
    @ApiModelProperty(notes = " 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则， 例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE")
    @JSONField(alternateNames = "fieldRuleList", name = "field_rule_list")
    private List<TemplateFieldRuleDTO> fieldRuleList;

    /**
     * 会员卡用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址
     */
    @ApiModelProperty(notes = " 会员卡用户领卡配置，在门店等渠道露出领卡入口时，需要部署的商户领卡H5页面地址")
    @JSONField(alternateNames = "openCardConf", name = "open_card_conf")
    private TemplateOpenCardConfDTO openCardConf;

    /**
     * 卡模板投放渠道
     */
    @ApiModelProperty(notes = " 卡模板投放渠道")
    @JSONField(alternateNames = "pubChannels", name = "pub_channels")
    private List<PubChannelDTO> pubChannels;


    /**
     * 服务Code
     * HUABEI_FUWU：花呗服务（只有需要花呗服务时，才需要加入该标识）
     */
    @ApiModelProperty(notes = " 服务Code HUABEI_FUWU：花呗服务（只有需要花呗服务时，才需要加入该标识）")
    @JSONField(alternateNames = "serviceLabelList", name = "service_label_list")
    @EnumCheck(enums = "HUABEI_FUWU", required = false)
    private List<String> serviceLabelList;

    /**
     * 会员卡上架门店id（支付宝门店id），既发放会员卡的商家门店id
     */
    @ApiModelProperty(notes = " 会员卡上架门店id（支付宝门店id），既发放会员卡的商家门店id")
    @JSONField(alternateNames = "shopIds", name = "shop_ids")
    private List<String> shopIds;

    /**
     * 权益信息，
     * 1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，
     * 2、如果添加门店渠道，则可在门店页展现会员卡的权益
     */
    @ApiModelProperty(notes = " 权益信息， 1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权， 2、如果添加门店渠道，则可在门店页展现会员卡的权益")
    @JSONField(alternateNames = "templateBenefitInfo", name = "template_benefit_info")
    private List<TemplateBenefitInfoDTO> templateBenefitInfo;

    /**
     * 模板样式信息
     */
    @ApiModelProperty(notes = " 模板样式信息")
    @JSONField(alternateNames = "templateStyleInfo", name = "template_style_info")
    private TemplateStyleInfoDTO templateStyleInfo;
    /**
     * 商户动态码通知参数配置：
     * 当write_off_type指定为商户动态码mdbarcode或mdqrcode时必填；
     * 在此字段配置用户打开会员卡时支付宝通知商户生成动态码（发码）的通知参数，如接收通知地址等。
     */
    @ApiModelProperty(notes = " 商户动态码通知参数配置： 当write_off_type指定为商户动态码mdbarcode或mdqrcode时必填； 在此字段配置用户打开会员卡时支付宝通知商户生成动态码（发码）的通知参数，如接收通知地址等。")
    @JSONField(alternateNames = "mdcodeNotifyConf", name = "mdcode_notify_conf")
    private TemplateMdcodeNotifyConfDTO mdcodeNotifyConf;

    public String getBizNoPrefix() {
        return this.bizNoPrefix;
    }

    public void setBizNoPrefix(String bizNoPrefix) {
        this.bizNoPrefix = bizNoPrefix;
    }

    public Integer getBizNoSuffixLen() {
        return bizNoSuffixLen;
    }

    public void setBizNoSuffixLen(Integer bizNoSuffixLen) {
        this.bizNoSuffixLen = bizNoSuffixLen;
    }

    public List<TemplateCardLevelConfDTO> getCardLevelConf() {
        return this.cardLevelConf;
    }

    public void setCardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
        this.cardLevelConf = cardLevelConf;
    }

    public String getCardType() {
        return this.cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public List<TemplateColumnInfoDTO> getColumnInfoList() {
        return this.columnInfoList;
    }

    public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
        this.columnInfoList = columnInfoList;
    }

    public List<TemplateFieldRuleDTO> getFieldRuleList() {
        return this.fieldRuleList;
    }

    public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
        this.fieldRuleList = fieldRuleList;
    }

    public TemplateOpenCardConfDTO getOpenCardConf() {
        return this.openCardConf;
    }

    public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
        this.openCardConf = openCardConf;
    }

    public List<PubChannelDTO> getPubChannels() {
        return this.pubChannels;
    }

    public void setPubChannels(List<PubChannelDTO> pubChannels) {
        this.pubChannels = pubChannels;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<String> getServiceLabelList() {
        return this.serviceLabelList;
    }

    public void setServiceLabelList(List<String> serviceLabelList) {
        this.serviceLabelList = serviceLabelList;
    }

    public List<String> getShopIds() {
        return this.shopIds;
    }

    public void setShopIds(List<String> shopIds) {
        this.shopIds = shopIds;
    }

    public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo() {
        return this.templateBenefitInfo;
    }

    public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
        this.templateBenefitInfo = templateBenefitInfo;
    }

    public TemplateStyleInfoDTO getTemplateStyleInfo() {
        return this.templateStyleInfo;
    }

    public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
        this.templateStyleInfo = templateStyleInfo;
    }

    public String getWriteOffType() {
        return this.writeOffType;
    }

    public void setWriteOffType(String writeOffType) {
        this.writeOffType = writeOffType;
    }

    public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf() {
        return mdcodeNotifyConf;
    }

    public void setMdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
        this.mdcodeNotifyConf = mdcodeNotifyConf;
    }
}
