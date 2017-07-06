package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

/**
 * 口碑商户人群组数目统计接口
 *
 * @author auto create
 * @since 1.0, 2017-04-07 17:14:41
 */
@ApiModel(description = " 口碑商户人群组数目统计接口")
public class KoubeiMarketingCampaignCrowdCountModel extends AlipayObject {

    private static final long serialVersionUID = 2172629993459912885L;

    /**
     * 圈人的条件
     * <p>
     * op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
     * tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
     * value:标签值
     */
    @ApiModelProperty(notes = " 圈人的条件 op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据 tagCode:标签code，详细标签code参见附件。")
    private String conditions;

    /**
     * crowd_group_id和conditions不能同时为空
     * <p>
     * 如果crowd_group_id不为空则根据crowd_group_id查询人群分组的信息进行统计，否则以conditions的内容为过滤条件进行统计，如果crowd_group_id和conditions都不为空则优先使用conditions的条件
     */
    @ApiModelProperty(notes = " crowd_group_id和conditions不能同时为空 如果crowd_group_id不为空则根据crowd_group_id查询人群分组的信息进行统计，否则以conditions的内容为过滤条件进行统计，如果crowd_group_id和conditions都不为空则优先使用conditions的条件")
    @JSONField(name = "crowd_group_id", alternateNames = "crowdGroupId")
    private String crowdGroupId;

    /**
     * 画像分析的维度，目前支持:["pam_age","pam_gender","pam_constellation","pam_hometown_code","pam_city_code","pam_occupation","pam_consume_level","pam_have_baby"]，以koubei.marketing.campaign.tags.query接口返回的dimensions为准，各个维度标签的详细信息参见附件，<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
     */
    @ApiModelProperty(notes = " 画像分析的维度，目前支持:[\"pam_age\",\"pam_gender\",\"pam_constellation\",\"pam_hometown_code\",\"pam_city_code\",\"pam_occupation\",\"pam_consume_level\",\"pam_have_baby\"]，以koubei.marketing.campaign.tags.query接口返回的dimensions为准，各个维度标签的详细信息参见附件，")
    private String dimensions;

    public String getConditions() {
        return this.conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getCrowdGroupId() {
        return this.crowdGroupId;
    }

    public void setCrowdGroupId(String crowdGroupId) {
        this.crowdGroupId = crowdGroupId;
    }

    public String getDimensions() {
        return this.dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

}
