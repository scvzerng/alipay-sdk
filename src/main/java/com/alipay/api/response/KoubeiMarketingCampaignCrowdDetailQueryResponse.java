package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;

import com.alipay.api.AlipayResponse;
import com.alipay.api.domain.KoubeiMarketingCampaignCrowdCreateModel;
import io.swagger.annotations.*;

import java.util.List;

/**
 * ALIPAY API: koubei.marketing.campaign.crowd.detail.query response.
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:14
 */
@ApiModel(description = " ALIPAY API: koubei.marketing.campaign.crowd.detail.query response.")
public class KoubeiMarketingCampaignCrowdDetailQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 8865161583647622112L;

    /**
     * op:表示操作符，目前支持的有EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
     * tagCode:就是标签code，详细标签信息参见附件<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
     * value：标签对应的值
     */
    @ApiModelProperty(notes = " op:表示操作符，目前支持的有EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据tagCode:就是标签code")
    @JSONField(name = "crowd_group_info", alternateNames = "crowdGroupInfo")
//    private List<KoubeiMarketingCampaignCrowdCreateModel.CreateTags> crowdGroupInfo;
    private String crowdGroupInfo;

    /**
     * 人群名称
     */
    @ApiModelProperty(notes = " 人群名称")
    private String name;

    public String getCrowdGroupInfo() {
        return crowdGroupInfo;
    }

    public void setCrowdGroupInfo(String crowdGroupInfo) {
        this.crowdGroupInfo = crowdGroupInfo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}
