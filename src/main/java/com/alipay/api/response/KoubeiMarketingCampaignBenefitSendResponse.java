package com.alipay.api.response;

import java.util.List;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: koubei.marketing.campaign.benefit.send response.
 *
 * @author auto create
 * @since 1.0, 2016-12-08 18:30:46
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.benefit.send response.")
public class KoubeiMarketingCampaignBenefitSendResponse extends AlipayResponse {

    private static final long serialVersionUID = 4218493348297423474L;

    /**
     * 领取的权益列表
     */
    @ApiModelProperty(notes = " 领取的权益列表")
    @ApiListField("benefit_ids")
    @ApiField("string")
    private List<String> benefitIds;

    public void setBenefitIds(List<String> benefitIds) {
        this.benefitIds = benefitIds;
    }

    public List<String> getBenefitIds() {
        return this.benefitIds;
    }

}
