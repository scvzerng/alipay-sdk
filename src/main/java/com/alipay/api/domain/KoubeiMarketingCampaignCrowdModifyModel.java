package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

import java.util.List;

/**
 * 口碑商户人群组修改接口
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:17
 */
@ApiModel(description = " 口碑商户人群组修改接口")
public class KoubeiMarketingCampaignCrowdModifyModel extends AlipayObject {

    private static final long serialVersionUID = 7682891933911471835L;

    /**
     * 圈人的条件
     * op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
     * tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
     * value:标签值
     */
    @ApiModelProperty(notes = " 圈人的条件op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据tagCode:标签code，详细标签code参见附件。")
    private List<KoubeiMarketingCampaignCrowdCreateModel.CreateTags> conditions;

    /**
     * 人群组的唯一标识ID
     */
    @JSONField(name = "crowd_group_id", alternateNames = "crowdGroupId")
    @ApiModelProperty(notes = " 人群组的唯一标识ID")
    private String crowdGroupId;

    /**
     * 操作人id，必须和operator_type配对出现，不填时默认是商户
     */
    @JSONField(name = "operator_id", alternateNames = "operatorId")
    @ApiModelProperty(notes = " 操作人id，必须和operator_type配对出现，不填时默认是商户")
    private String operatorId;

    /**
     * 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER
     */
    @JSONField(name = "operator_type", alternateNames = "operatorType")
    @ApiModelProperty(notes = " 操作人类型,有以下值可填：MER（外部商户），MER_OPERATOR（外部商户操作员），PROVIDER（外部服务商），PROVIDER_STAFF（外部服务商员工），默认不需要填这个字段，默认为MER")
    private String operatorType;

    /**
     * 外部流水号
     */
    @JSONField(name = "out_biz_no", alternateNames = "outBizNo")
    @ApiModelProperty(notes = " 外部流水号")
    private String outBizNo;

    public List<KoubeiMarketingCampaignCrowdCreateModel.CreateTags> getConditions() {
        return conditions;
    }

    public void setConditions(List<KoubeiMarketingCampaignCrowdCreateModel.CreateTags> conditions) {
        this.conditions = conditions;
    }

    public String getCrowdGroupId() {
        return this.crowdGroupId;
    }

    public void setCrowdGroupId(String crowdGroupId) {
        this.crowdGroupId = crowdGroupId;
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

    public String getOutBizNo() {
        return this.outBizNo;
    }

    public void setOutBizNo(String outBizNo) {
        this.outBizNo = outBizNo;
    }

}
