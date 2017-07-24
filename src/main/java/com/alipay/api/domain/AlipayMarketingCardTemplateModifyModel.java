package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 会员卡模板修改
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:45
 */
@ApiModel(description = " 会员卡模板修改")
public class AlipayMarketingCardTemplateModifyModel extends AlipayObject {


    /**
     * 业务卡号前缀，由商户自定义
     */
    @ApiModelProperty(notes = " 业务卡号前缀，由商户自定义")
    @JSONField(alternateNames = "bizNoPrefix", name = "biz_no_prefix")
    private String bizNoPrefix;

    /**
     * 卡级别配置
     */
    @ApiModelProperty(notes = " 卡级别配置")
    @JSONField(alternateNames = "cardLevelConf", name = "card_level_conf")
    private List<TemplateCardLevelConfDTO> cardLevelConf;

    /**
     * 栏位信息（卡包详情页面展现的栏位）
     */
    @ApiModelProperty(notes = " 栏位信息（卡包详情页面展现的栏位）")
    @JSONField(alternateNames = "columnInfoList", name = "column_info_list")
    private List<TemplateColumnInfoDTO> columnInfoList;

    /**
     * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，
     * 例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
     */
    @ApiModelProperty(notes = " 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE")
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
     * 请求ID，由开发者生成并保证唯一性
     */
    @ApiModelProperty(notes = " 请求ID，由开发者生成并保证唯一性")
    @JSONField(alternateNames = "requestId", name = "request_id")
    private String requestId;

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
    @ApiModelProperty(notes = " 权益信息，1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，2、如果添加门店渠道，则可在门店页展现会员卡的权益")
    @JSONField(alternateNames = "templateBenefitInfo", name = "template_benefit_info")
    private List<TemplateBenefitInfoDTO> templateBenefitInfo;

    /**
     * 支付宝卡模板ID（模板创建接口返回的支付宝端模板ID）
     */
    @ApiModelProperty(notes = " 支付宝卡模板ID（模板创建接口返回的支付宝端模板ID）")
    @JSONField(alternateNames = "templateId", name = "template_id")
    private String templateId;

    /**
     * 模板样式信息
     */
    @ApiModelProperty(notes = " 模板样式信息")
    @JSONField(alternateNames = "templateStyleInfo", name = "template_style_info")
    private TemplateStyleInfoDTO templateStyleInfo;

    /**
     * 卡包详情页面中展现出的卡码（可用于扫码核销）
     * qrcode: 二维码
     * dqrcode: 动态二维码
     * barcode: 条码
     * dbarcode: 动态条码
     * text: 文本
     */
    @ApiModelProperty(notes = " 卡包详情页面中展现出的卡码（可用于扫码核销）qrcode: 二维码dqrcode: 动态二维码barcode: 条码dbarcode: 动态条码text: 文本")
    @JSONField(alternateNames = "writeOffType", name = "write_off_type")
    private String writeOffType;

    public String getBizNoPrefix() {
        return this.bizNoPrefix;
    }

    public void setBizNoPrefix(String bizNoPrefix) {
        this.bizNoPrefix = bizNoPrefix;
    }

    public List<TemplateCardLevelConfDTO> getCardLevelConf() {
        return this.cardLevelConf;
    }

    public void setCardLevelConf(List<TemplateCardLevelConfDTO> cardLevelConf) {
        this.cardLevelConf = cardLevelConf;
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

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
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

}
