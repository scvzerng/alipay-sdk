package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EndDate;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * 会员卡模板外部权益
 *
 * @author auto create
 * @since 1.0, 2017-04-07 20:39:34
 */
@ApiModel(description = " 会员卡模板外部权益")
public class McardTemplateBenefit  {

    /**
     * 权益描述信息
     */
    @ApiModelProperty(notes = " 权益描述信息")
    @JSONField(alternateNames = "benefitDesc", name = "benefit_desc")
    @NotNull
    private List<String> benefitDesc;

    /**
     * 权益结束时间
     */
    @ApiModelProperty(notes = " 权益结束时间")
    @JSONField(alternateNames = "endDate", name = "end_date", format = "yyyy-MM-dd HH:mm:ss")
    @EndDate(field = "startDate")
    private Date endDate;

    /**
     * 会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面
     */
    @ApiModelProperty(notes = " 会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面")
    @JSONField(alternateNames = "extInfo", name = "ext_info")
    private JSONObject extInfo;

    /**
     * 权益开始时间
     */
    @ApiModelProperty(notes = " 权益开始时间")
    @JSONField(alternateNames = "startDate", name = "start_date", format = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date startDate;

    /**
     * 会员卡模板ID
     */
    @ApiModelProperty(notes = " 会员卡模板ID")
    @JSONField(alternateNames = "templateId", name = "template_id")
    @NotBlank
    private String templateId;

    /**
     * 权益标题
     */
    @ApiModelProperty(notes = " 权益标题")
    @NotBlank
    private String title;


    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<String> getBenefitDesc() {
        return benefitDesc;
    }

    public void setBenefitDesc(List<String> benefitDesc) {
        this.benefitDesc = benefitDesc;
    }

    public JSONObject getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(JSONObject extInfo) {
        this.extInfo = extInfo;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
