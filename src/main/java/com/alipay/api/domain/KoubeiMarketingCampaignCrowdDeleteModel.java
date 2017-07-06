package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 口碑商户人群组删除接口
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:21
 */
@ApiModel(description = " 口碑商户人群组删除接口")
public class KoubeiMarketingCampaignCrowdDeleteModel extends AlipayObject {

    private static final long serialVersionUID = 1678772431471197331L;

    /**
     * 人群组的唯一标识ID
     */
    @ApiModelProperty(notes = " 人群组的唯一标识ID")
    @JSONField(name = "crowd_group_id", alternateNames = "crowdGroupId")
    private String crowdGroupId;

    public String getCrowdGroupId() {
        return this.crowdGroupId;
    }

    public void setCrowdGroupId(String crowdGroupId) {
        this.crowdGroupId = crowdGroupId;
    }

}
