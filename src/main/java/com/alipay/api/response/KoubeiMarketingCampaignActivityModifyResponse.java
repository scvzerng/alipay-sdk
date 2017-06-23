package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;


/**
 * ALIPAY API: koubei.marketing.campaign.activity.modify response.
 *
 * @author auto create
 * @since 1.0, 2016-10-08 15:39:40
 */
@ApiModel
public class KoubeiMarketingCampaignActivityModifyResponse extends AlipayResponse {

    private static final long serialVersionUID = 4282283824937741787L;

    /**
     * 活动子状态，如审核中
     */
    @ApiModelProperty(notes = "活动子状态，如审核中")
    @ApiField("audit_status")
    private String auditStatus;

    /**
     * 活动状态
     */
    @ApiModelProperty(notes = "活动状态")
    @ApiField("camp_status")
    private String campStatus;

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getAuditStatus() {
        return this.auditStatus;
    }

    public void setCampStatus(String campStatus) {
        this.campStatus = campStatus;
    }

    public String getCampStatus() {
        return this.campStatus;
    }

}
