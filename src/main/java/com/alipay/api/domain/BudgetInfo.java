package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 预算信息
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
@ApiModel(description = " 预算信息")
public class BudgetInfo  {


    /**
     * 预算数量
     */
    @ApiModelProperty(notes = " 预算数量")
    @JSONField(name = "budget_total", alternateNames = "budgetTotal")
    private Integer budgetTotal;

    /**
     * 预算类型
     */
    @ApiModelProperty(notes = " 预算类型")
    @JSONField(name = "budget_type", alternateNames = "budgetType")
    private String budgetType;

    public Integer getBudgetTotal() {
        return budgetTotal;
    }

    public void setBudgetTotal(Integer budgetTotal) {
        this.budgetTotal = budgetTotal;
    }

    public String getBudgetType() {
        return this.budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

}
