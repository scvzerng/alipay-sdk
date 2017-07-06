package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动详情查询
 *
 * @author auto create
 * @since 1.0, 2017-02-27 11:23:14
 */
public class KoubeiMarketingCampaignActivityQueryModel extends AlipayObject {

    private static final long serialVersionUID = 7896373588538324966L;

    /**
     * 活动id
     */
    @JSONField(name = "camp_id", alternateNames = "campId")
    private String campId;

    /**
     * 操作人id，必须和operator_type配对出现，不填时默认是商户
     */
    @JSONField(name = "operator_id", alternateNames = "operatorId")
    private String operatorId;

    /**
     * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
     */
    @JSONField(name = "operator_type", alternateNames = "operatorType")
    private String operatorType;

    public String getCampId() {
        return this.campId;
    }

    public void setCampId(String campId) {
        this.campId = campId;
    }

    public String getOperatorId() {
        return this.operatorId;
    }

    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorType() {
        return this.operatorType;
    }

    public void setOperatorType(String operatorType) {
        this.operatorType = operatorType;
    }

}
