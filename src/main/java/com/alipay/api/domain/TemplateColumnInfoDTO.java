package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.yazuo.xiaoya.common.annotation.validate.EnumCheck;
import io.swagger.annotations.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;
import java.io.Serializable;

/**
 * 模板栏位信息
 *
 * @author auto create
 * @since 1.0, 2016-12-28 15:26:46
 */
@ApiModel(description = " 模板栏位信息")
public class TemplateColumnInfoDTO implements Serializable {


    /**
     * 标准栏位：行为由支付宝统一定，同时已经分配标准Code
     * BALANCE：会员卡余额
     * POINT：积分
     * LEVEL：等级
     * TELEPHOME：联系方式
     * 自定义栏位：行为由商户定义，自定义Code码（只要无重复）
     */
    @ApiModelProperty(notes = " 标准栏位：行为由支付宝统一定，同时已经分配标准CodeBALANCE：会员卡余额POINT：积分LEVEL：等级TELEPHOME：联系方式自定义栏位：行为由商户定义，自定义Code码（只要无重复）")
    @Length(min = 1,max = 32)
    private String code;

    /**
     * 扩展信息
     */
    @ApiModelProperty(notes = " 扩展信息")
    @JSONField(alternateNames = "moreInfo", name = "more_info")
    @Valid
    private MoreInfoDTO moreInfo;
    /**
         * 栏目的标题
     */
    @ApiModelProperty(notes = " 栏目的标题")
    @Length(min = 1,max = 16)
    private String title;


    /**
     * 1、openNative：打开二级页面，展现 more中descs
     * 2、openWeb：打开URL
     * 3、staticinfo：静态信息
     */
    @ApiModelProperty(notes = "openNative：打开二级页面，展现 more中descs openWeb：打开URL staticinfo：静态信息")
    @JSONField(name = "operate_type",alternateNames = "operateType")
    @EnumCheck(enums = {"openNative","openWeb","staticinfo"})
    private String operateType;


    /**
     * 卡包详情页面，卡栏位右边展现的值
     */
    @ApiModelProperty(notes = " 卡包详情页面，卡栏位右边展现的值")
    @Length(max = 32)
    private String value;

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public MoreInfoDTO getMoreInfo() {
        return this.moreInfo;
    }

    public void setMoreInfo(MoreInfoDTO moreInfo) {
        this.moreInfo = moreInfo;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
