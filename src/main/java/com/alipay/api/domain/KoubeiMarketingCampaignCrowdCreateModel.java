package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.util.List;

/**
 * 口碑商户人群组创建接口
 *
 * @author auto create
 * @since 1.0, 2016-08-29 14:52:57
 */
@ApiModel(description = " 口碑商户人群组创建接口")
public class KoubeiMarketingCampaignCrowdCreateModel extends AlipayObject {

    private static final long serialVersionUID = 4881983287199233716L;

    /**
     * 圈人的条件
     * op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据
     * tagCode:标签code，详细标签code参见附件。<a href="http://aopsdkdownload.cn-hangzhou.alipay-pub.aliyun-inc.com/doc/tags%26usecase.zip">标签信息</a>
     * value:标签值
     */
    @ApiModelProperty(notes = " 圈人的条件op:表示操作符，目前支持EQ相等,GT大于,GTEQ大于等于,LT小于,LTEQ小于等于,NEQ不等,LIKE模糊匹配,IN在枚举范围内,NOTIN不在枚举范围内,BETWEEN范围比较,LEFTDAYS几天以内,RIGHTDAYS几天以外,LOCATE地理位置比较,LBS地图位置数据tagCode:标签code")
    private List<CreateTags> conditions;

    /**
     * 人群组的名称
     */
    @ApiModelProperty(notes = " 人群组的名称")
    private String name;

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

    public List<CreateTags> getConditions() {
        return conditions;
    }

    public void setConditions(List<CreateTags> conditions) {
        this.conditions = conditions;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    /**
     * <p>ClassName:CreateTags.java </p>
     * <p>Description: 创建人群组信息详细规则标签数据转换类 </p>
     * <p>Company:雅座在线（北京）科技发展有限公司 </p>
     *
     * @author wuqiong  2016年5月9日
     */
    @ApiModel(description = " <p>ClassName:CreateTags.java </p>")
    public static class CreateTags implements Serializable {
        private static final long serialVersionUID = -424908767474605729L;

        /**
         * 标签码
         */
        @JSONField(name = "tag_code", alternateNames = "tagCode")
        @ApiModelProperty(notes = " 标签码")
        private String tagCode;                //标签码
        /**
         * 判断条件   一个枚举值
         */
        @ApiModelProperty(notes = " 判断条件   一个枚举值")
        private KoubeiMarketingCampaignCrowdCreateModel.Operate op;                    //判断条件   一个枚举值
        /**
         * 介绍或者 标签码详细数值如       "value":"行业标签"  或者   "value":["白领","蓝领"]  或者   "value":[0526,9635]
         */
        @ApiModelProperty(notes = " 介绍或者 标签码详细数值如       'value':'行业标签'  或者   'value':['白领','蓝领'']  或者   'value':[0526,9635]")
        private Object value;                //介绍或者 标签码详细数值如       "value":"行业标签"  或者   "value":["白领","蓝领"]  或者   "value":[0526,9635]
        /**
         * 符合参数集合
         */
//        @JSONField(name = "sub_tags", alternateNames = "subTags")
//        @ApiModelProperty(notes = " 符合参数集合")
//        private List<CreateTags> subTags;    //符合参数集合

        public String getTagCode() {
            return tagCode;
        }

        public void setTagCode(String tagCode) {
            this.tagCode = tagCode;
        }

        public KoubeiMarketingCampaignCrowdCreateModel.Operate getOp() {
            return op;
        }

        public void setOp(KoubeiMarketingCampaignCrowdCreateModel.Operate op) {
            this.op = op;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

//        public List<CreateTags> getSubTags() {
//            return subTags;
//        }
//
//        public void setSubTags(List<CreateTags> subTags) {
//            this.subTags = subTags;
//        }

    }


    /**
     * Created by sundongfeng@yazuo.com on 2016/5/4 11:15.
     * 操作标识
     */
    @ApiModel(description = " Created by sundongfeng@yazuo.com on 2016/5/4 11:15.")
    public enum Operate {
        IN,     //表示     "in", "枚举"
        NOTIN,  //表示     "not in", "枚举"
        EQ,     //表示     "=", "相等"
        GT,     //表示     ">", "大于"
        GTEQ,   //表示     ">=", "大于等于"
        LEFTDAYS,   //表示    几天以内    用于标签 pam_next_birthday_days
        RIGHTDAYS,    //表示    几天以外
        LT,     //表示     "<", "小于"
        LTEQ,   //表示     "<=","小于等于"
        NEQ,    //表示     "!=", "不等"
        LIKE,   //表示     "like", "模糊匹配"
        BETWEEN,//表示     "between", "范围比较"
        LOCATE, //表示     "", "地理位置比较"
        LBS;    //表示     "", "地图位置数据"

        public static Operate instanceOf(String code) {
            for (Operate operate : Operate.values()) {
                if (operate.toString().equalsIgnoreCase(code)) return operate;
            }
            return null;
        }
    }

}
