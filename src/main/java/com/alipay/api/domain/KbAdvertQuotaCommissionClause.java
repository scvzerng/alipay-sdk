package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 固定金额
 *
 * @author auto create
 * @since 1.0, 2017-03-02 11:28:27
 */
@ApiModel(description = " 固定金额")
public class KbAdvertQuotaCommissionClause extends AlipayObject {

    private static final long serialVersionUID = 3123559866263725728L;

    /**
     * 固定金额
     */
    @JSONField(name = "quota_amount", alternateNames = "quotaAmount")
    @ApiModelProperty(notes = " 固定金额")
    @NotNull
    private String quotaAmount;

    public String getQuotaAmount() {
        return this.quotaAmount;
    }

    public void setQuotaAmount(String quotaAmount) {
        this.quotaAmount = quotaAmount;
    }

}
