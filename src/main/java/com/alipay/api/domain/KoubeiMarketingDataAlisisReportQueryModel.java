package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 报表详情查询接口
 *
 * @author auto create
 * @since 1.0, 2017-03-24 16:17:12
 */
@ApiModel(description = " 报表详情查询接口")
public class KoubeiMarketingDataAlisisReportQueryModel extends AlipayObject {


    /**
     * 报表唯一标识
     */
    @JSONField(name = "report_uk", alternateNames = "reportUk")
    @ApiModelProperty(notes = " 报表唯一标识")
    private String reportUk;

    public String getReportUk() {
        return this.reportUk;
    }

    public void setReportUk(String reportUk) {
        this.reportUk = reportUk;
    }

}
