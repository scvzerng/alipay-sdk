package com.alipay.api.domain;


import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.response.KoubeiMarketingDataIndicatorQueryResponse;
import io.swagger.annotations.*;


import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


/**
 * 营销活动指标查询
 *
 * @author auto create
 * @since 1.0, 2016-11-21 19:10:30
 */
@ApiModel(description = "营销活动指标查询@authorautocreate@since1.0,2016-11-2119:10:30")
public class KoubeiMarketingDataIndicatorQueryModel extends AlipayObject {

    private static final long serialVersionUID = 1595248349336115296L;

    /**
     * 开始日期,格式:yyyyMMdd
     */
    @JSONField(name = "begin_date", alternateNames = "beginDate",format = "yyyyMMdd")
    @ApiModelProperty(notes = "开始日期,格式:yyyyMMdd")
    @NotNull(message = "开始日期不能为空")
    private Date beginDate;

    /**
     * 业务类型，可选值有六个
     * 1，MemberQuery 商户会员数据查询
     * 2，MemberQueryByStore 门店会员数据查询
     * 3，TradeQuery 商户交易数据查询
     * 4，TradeQueryByStore 门店交易数据查询
     * 5，CampaignQuery 商户活动数据查询
     * 6，CampaignQueryByStore 门店活动数据查询
     * 7，ConponsQuery 商户券数据查询
     * 8，ConponsQueryByStore 门店券数据查询
     */
    @JSONField(name = "biz_type", alternateNames = "bizType")
    @ApiModelProperty(notes = "业务类型，可选值有六个1，MemberQuery商户会员数据查询2，MemberQueryByStore门店会员数据查询3，TradeQuery商户交易数据查询4，TradeQueryByStore门店交易数据查询5，CampaignQuery商户活动数据查询6，CampaignQueryByStore门店活动数据查询7，ConponsQuery商户券数据查询8，ConponsQueryByStore门店券数据查询")
    @NotNull(message = "业务类型不能为空")
    private BizType bizType;

    /**
     * 结束日期 格式:yyyyMMdd
     */
    @JSONField(name = "end_date", alternateNames = "endDate",format = "yyyyMMdd")
    @ApiModelProperty(notes = "结束日期格式:yyyyMMdd")
    @NotNull(message = "结束日期不能为空")
    private Date endDate;

    /**
     * camp_id：为活动ID
     * sort_field：为排序指标KEY
     * sort_type：ASC表示升序,DESC表示降序
     * store_Ids：为门店ID，多个门店使用逗号分隔
     * 注意：
     * 注意：这个是JSON数组，必须以{开头，以}结尾，{}外层不能加双引号"",正确案例{"camp_id":"10000000000000000000000000000000","sort_field":"total_user_cnt","sort_type":"ASC","store_Ids":"20131133131,2031313"}，错误案例："{"camp_id":"10000000000000000000000000000000","sort_field":"total_user_cnt","sort_type":"ASC","store_Ids":"20131133131,2031313"}"
     */
    @JSONField(name = "ext_info", alternateNames = "extInfo")
    @ApiModelProperty("拓展信息")
    private ExtInfo extInfo;


    /**
     * 当前页数，默认为1
     */
    @JSONField(name = "page_num", alternateNames = "pageNum")
    @ApiModelProperty(notes = "当前页数，默认为1")
    private Integer pageNum;

    /**
     * 每页记录数,不能超过50，默认为20
     */
    @JSONField(name = "page_size", alternateNames = "pageSize")
    @ApiModelProperty(notes = "每页记录数,不能超过50，默认为20")
    private Integer pageSize;

    /**
     * 拓展信息
     */
    @ApiModel(description = "拓展信息")
    public static class ExtInfo implements Serializable {
        /**
         * 活动ID
         */
        @JSONField(name = "camp_id", alternateNames = "campId")
        @ApiModelProperty(notes = "活动ID")
        private String campId;
        /**
         * 排序字段
         */
        @JSONField(name = "sort_field", alternateNames = "sortField")
        @ApiModelProperty(notes = "排序字段")
        private String sortField;
        /**
         * 排序类型
         */
        @JSONField(name = "sort_type", alternateNames = "sortType")
        @ApiModelProperty(notes = "排序类型")
        private Order sortType;
        /**
         * 门店ID列表
         */
        @JSONField(name = "store_Ids", alternateNames = "storeIds")
        @ApiModelProperty(notes = "门店ID列表")
        private String storeIds;

        public String getCampId() {
            return campId;
        }

        public void setCampId(String campId) {
            this.campId = campId;
        }

        public String getSortField() {
            return sortField;
        }

        public void setSortField(String sortField) {
            this.sortField = sortField;
        }

        public Order getSortType() {
            return sortType;
        }

        public void setSortType(Order sortType) {
            this.sortType = sortType;
        }

        public String getStoreIds() {
            return storeIds;
        }

        public void setStoreIds(String storeIds) {
            this.storeIds = storeIds;
        }
    }

    public enum Order {
        ASC, DESC
    }

    public enum BizType {
        MemberQuery(KoubeiMarketingDataIndicatorQueryResponse.MemberQueryModel.class),
        MemberQueryByStore(KoubeiMarketingDataIndicatorQueryResponse.MemberQueryByStoreModel.class),
        TradeQuery(KoubeiMarketingDataIndicatorQueryResponse.TradeQueryModel.class),
        TradeQueryByStore(KoubeiMarketingDataIndicatorQueryResponse.TradeQueryByStoreModel.class),
        CampaignQuery(KoubeiMarketingDataIndicatorQueryResponse.CampaignQueryModel.class),
        CampaignQueryByStore(KoubeiMarketingDataIndicatorQueryResponse.CampaignQueryByStoreModel.class);

        private Class clazz;

        BizType(Class clazz) {
            this.clazz = clazz;
        }

        public Class getClazz() {
            return clazz;
        }
    }


    public BizType getBizType() {
        return bizType;
    }

    public void setBizType(BizType bizType) {
        this.bizType = bizType;
    }

    public ExtInfo getExtInfo() {
        return extInfo;
    }

    public void setExtInfo(ExtInfo extInfo) {
        this.extInfo = extInfo;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
