package com.alipay.api.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.yazuo.xiaoya.common.annotation.validate.EndDate;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * 卡模板权益信息
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
@ApiModel(description = " 卡模板权益信息")
public class TemplateBenefitInfoDTO implements Serializable {
    /**
     * 权益描述
     */
    @ApiModelProperty(notes = " 权益描述")
    @Length(min = 1,max = 16)
    private String title;
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
    @NotNull
    @EndDate(field = "startDate")
    private Date endDate;

    /**
     * 开始时间
     */
    @ApiModelProperty(notes = " 开始时间")
    @JSONField(alternateNames = "startDate", name = "start_date", format = "yyyy-MM-dd HH:mm:ss")
    @NotNull
    private Date startDate;



    public List<String> getBenefitDesc() {
        return this.benefitDesc;
    }

    public void setBenefitDesc(List<String> benefitDesc) {
        this.benefitDesc = benefitDesc;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
