package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 报表列表查询接口
 *
 * @author auto create
 * @since 1.0, 2016-10-28 10:26:26
 */
@ApiModel(description = " 报表列表查询接口")
public class KoubeiMarketingDataAlisisReportBatchqueryModel extends AlipayObject {


    /**
     * 当前页码
     */
    @ApiModelProperty(notes = " 当前页码")
    private String page;

    /**
     * 每页最大条数，最大为30
     */
    @ApiModelProperty(notes = " 每页最大条数，最大为30")
    private String size;

    public String getPage() {
        return this.page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
