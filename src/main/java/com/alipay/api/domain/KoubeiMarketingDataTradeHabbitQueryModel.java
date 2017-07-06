package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * 商户会员交易习惯查询接口
 *
 * @author auto create
 * @since 1.0, 2016-11-25 10:43:58
 */
@ApiModel(description = " 商户会员交易习惯查询接口")
public class KoubeiMarketingDataTradeHabbitQueryModel extends AlipayObject {

    private static final long serialVersionUID = 6544681434163256534L;

    /**
     * 业务日期 格式:yyyyMMdd
     */
    @JSONField(name = "biz_date", alternateNames = "bizDate",format = "yyyyMMdd")
    @ApiModelProperty(notes = " 业务日期 格式:yyyyMMdd")
    @NotNull(message = "开始日期不能为空")
    private Date bizDate;

    /**
     * 门店列表,最多支持10个门店。
     * 不填时,则为商户维度汇总数据
     */
    @JSONField(name = "store_ids", alternateNames = "storeIds")
    @ApiModelProperty(notes = " 门店列表,最多支持10个门店。不填时,则为商户维度汇总数据")
    private List<String> storeIds;

    public Date getBizDate() {
        return bizDate;
    }

    public void setBizDate(Date bizDate) {
        this.bizDate = bizDate;
    }

    public List<String> getStoreIds() {
        return storeIds;
    }

    public void setStoreIds(List<String> storeIds) {
        this.storeIds = storeIds;
    }


}
