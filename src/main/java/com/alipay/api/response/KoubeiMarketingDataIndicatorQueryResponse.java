package com.alipay.api.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.api.domain.KoubeiMarketingDataIndicatorQueryModel;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ALIPAY API: koubei.marketing.data.indicator.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-25 10:44:10
 */
public class KoubeiMarketingDataIndicatorQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2253139848599365154L;

	/** 
	 * JSON格式数组，每个对象表示一个门店某个具体日期的指标信息，KEY为指标代码，VALUE为该指标对应的值,各biz_type入参以及返回值的详细信息参见<a href="https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7629140.0.0.XQ4g6J&treeId=193&articleId=105186&docType=1#s6">快速接入</a>
	 */
	@ApiField("indicator_infos")
	private String indicatorInfos;

	/** 
	 * 总条目数,供计算分页信息使用
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setIndicatorInfos(String indicatorInfos) {
		this.indicatorInfos = indicatorInfos;
	}

	/**
	 * 使用方法 可直接用返回类型的对应数据接收 接受类型 为KoubeiMarketingDataIndicatorQueryModel下的
	 * 内部类
	 * 例如
	 * 	KoubeiMarketingDataIndicatorQueryResponse.MemberQueryModel mqm = new KoubeiMarketingDataIndicatorQueryResponse().getIndicatorInfos()
	 * 返回值为对应class的list
	 * @param bizType
	 * @param <T>
	 * @return	List<T>
	 */
	public  <T> List<T> getIndicatorInfos(KoubeiMarketingDataIndicatorQueryModel.BizType bizType) {
		return (List<T>) JSON.parseArray(this.indicatorInfos,bizType.getClazz());

	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}
	/**
	 * <p>ClassName:MemberQueryModel.java </p>
	 * <p>Description: 户维度查询会员信息 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author wuqiong  2016年7月14日
	 */
	public static class MemberQueryModel implements Serializable {
		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;                   //业务日期                                      格式:yyyyMMdd
		@JSONField(name = "today_new_user_cnt")
		private Integer todayNewUserCnt;         //当日新增会员数                                首次来商户支付的会员数
		@JSONField(name = "today_campaign_new_user_cnt")
		private Integer todayCampaignNewUserCnt;//当日活动新增会员                              首次来商户支付且首笔交易参加活动的会员
		@JSONField(name = "total_user_cnt")
		private Integer totalUserCnt;             //(截止到业务日期的)累计会员数                  累计会员数(包含支付、储值卡、积点卡等);数据开始时间为2013-01-16
		@JSONField(name = "total_trade_user_cnt")
		private Integer totalTradeUserCnt;       //(截止到业务日期的)累计交易会员数              累计支付会员数;数据开始时间为2013-01-16
		@JSONField(name = "trade_cnt_ge_twice_user_cnt")
		private Integer tradeCntGeTwiceUserCnt;//(截止到业务日期的)累计交易两次以上（含两次）会累计支付二次以上(含)会员数;数据开始时间为2013-01-16, 离线数据不包含当日数据

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public Integer getTodayNewUserCnt() {
			return todayNewUserCnt;
		}

		public void setTodayNewUserCnt(Integer todayNewUserCnt) {
			this.todayNewUserCnt = todayNewUserCnt;
		}

		public Integer getTodayCampaignNewUserCnt() {
			return todayCampaignNewUserCnt;
		}

		public void setTodayCampaignNewUserCnt(Integer todayCampaignNewUserCnt) {
			this.todayCampaignNewUserCnt = todayCampaignNewUserCnt;
		}

		public Integer getTotalUserCnt() {
			return totalUserCnt;
		}

		public void setTotalUserCnt(Integer totalUserCnt) {
			this.totalUserCnt = totalUserCnt;
		}

		public Integer getTotalTradeUserCnt() {
			return totalTradeUserCnt;
		}

		public void setTotalTradeUserCnt(Integer totalTradeUserCnt) {
			this.totalTradeUserCnt = totalTradeUserCnt;
		}

		public Integer getTradeCntGeTwiceUserCnt() {
			return tradeCntGeTwiceUserCnt;
		}

		public void setTradeCntGeTwiceUserCnt(Integer tradeCntGeTwiceUserCnt) {
			this.tradeCntGeTwiceUserCnt = tradeCntGeTwiceUserCnt;
		}
	}
	/**
	 * <p>ClassName: MemberQueryByStoreModel.java </p>
	 * <p>Description: 门店维度查询会员信息 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author wuqiong  2016年7月14日
	 */
	public static class MemberQueryByStoreModel implements Serializable {

		private static final long serialVersionUID = -7888567222365648587L;

		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;                   //业务日期
		@JSONField(name = "store_id")
		private String storeId;                   //门店ID
		@JSONField(name = "store_name")
		private String storeName;                 //门店名称
		@JSONField(name = "cat2_name")
		private String cat2Name;                  //门店行业名称
		@JSONField(name = "cat2_id")
		private String cat2Id;                    //门店行业ID
		@JSONField(name = "today_new_user_cnt")
		private String todayNewUserCnt;         //门店当日新增会员数
		@JSONField(name = "today_campaign_new_user_cnt")
		private String todayCampaignNewUserCnt;//门店当日活动引入新增会员
		@JSONField(name = "recent_7d_new_user_cnt")
		private String recent7dNewUserCnt;     //近7天新增会员数
		@JSONField(name = "recent_30d_new_user_cnt")
		private String recent30dNewUserCnt;    //近30天新增会员数
		@JSONField(name = "recent_90d_new_user_cnt")
		private String recent90dNewUserCnt;    //近90天新增会员数


		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public String getStoreId() {
			return storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getStoreName() {
			return storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public String getCat2Name() {
			return cat2Name;
		}

		public void setCat2Name(String cat2Name) {
			this.cat2Name = cat2Name;
		}

		public String getCat2Id() {
			return cat2Id;
		}

		public void setCat2Id(String cat2Id) {
			this.cat2Id = cat2Id;
		}

		public String getTodayNewUserCnt() {
			return todayNewUserCnt;
		}

		public void setTodayNewUserCnt(String todayNewUserCnt) {
			this.todayNewUserCnt = todayNewUserCnt;
		}

		public String getTodayCampaignNewUserCnt() {
			return todayCampaignNewUserCnt;
		}

		public void setTodayCampaignNewUserCnt(String todayCampaignNewUserCnt) {
			this.todayCampaignNewUserCnt = todayCampaignNewUserCnt;
		}

		public String getRecent7dNewUserCnt() {
			return recent7dNewUserCnt;
		}

		public void setRecent7dNewUserCnt(String recent7dNewUserCnt) {
			this.recent7dNewUserCnt = recent7dNewUserCnt;
		}

		public String getRecent30dNewUserCnt() {
			return recent30dNewUserCnt;
		}

		public void setRecent30dNewUserCnt(String recent30dNewUserCnt) {
			this.recent30dNewUserCnt = recent30dNewUserCnt;
		}

		public String getRecent90dNewUserCnt() {
			return recent90dNewUserCnt;
		}

		public void setRecent90dNewUserCnt(String recent90dNewUserCnt) {
			this.recent90dNewUserCnt = recent90dNewUserCnt;
		}
	}
	/**
	 * <p>ClassName: TradeQueryModel.java </p>
	 * <p>Description: 商户维度查询会员信息 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author wuqiong  2016年7月14日
	 */
	public static class TradeQueryModel implements Serializable {

		private static final long serialVersionUID = -7477049125292587003L;

		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;                //业务日期                         格式:yyyyMMdd
		@JSONField(name = "today_trade_amt")
		private BigDecimal todayTradeAmt;         //当日收益金额                     单位：分
		@JSONField(name = "today_trade_cnt")
		private Integer todayTradeCnt;         //当日消费笔数
		@JSONField(name = "today_campaign_trade_amt")
		private BigDecimal todayCampaignTradeAmt;//当日新增营销收益                 单位：分
		@JSONField(name = "today_campaign_trade_cnt")
		private Integer todayCampaignTradeCnt;//当日活动交易笔数
		@JSONField(name = "total_trade_amt")
		private BigDecimal totalTradeAmt;         //(截止到业务日期)累计收益金额     单位：分
		@JSONField(name = "total_trade_cnt")
		private Integer totalTradeCnt;         //(截止到业务日期)总交易笔数
		@JSONField(name = "total_campaign_trade_amt")
		private BigDecimal totalCampaignTradeAmt;//(截止到业务日期)累计活动收益金额 单位:分
		@JSONField(name = "total_campaign_trade_cnt")
		private Integer totalCampaignTradeCnt;//(截止到业务日期)累计活动交易笔数

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public BigDecimal getTodayTradeAmt() {
			return todayTradeAmt;
		}

		public void setTodayTradeAmt(BigDecimal todayTradeAmt) {
			this.todayTradeAmt = todayTradeAmt;
		}

		public Integer getTodayTradeCnt() {
			return todayTradeCnt;
		}

		public void setTodayTradeCnt(Integer todayTradeCnt) {
			this.todayTradeCnt = todayTradeCnt;
		}

		public BigDecimal getTodayCampaignTradeAmt() {
			return todayCampaignTradeAmt;
		}

		public void setTodayCampaignTradeAmt(BigDecimal todayCampaignTradeAmt) {
			this.todayCampaignTradeAmt = todayCampaignTradeAmt;
		}

		public Integer getTodayCampaignTradeCnt() {
			return todayCampaignTradeCnt;
		}

		public void setTodayCampaignTradeCnt(Integer todayCampaignTradeCnt) {
			this.todayCampaignTradeCnt = todayCampaignTradeCnt;
		}

		public BigDecimal getTotalTradeAmt() {
			return totalTradeAmt;
		}

		public void setTotalTradeAmt(BigDecimal totalTradeAmt) {
			this.totalTradeAmt = totalTradeAmt;
		}

		public Integer getTotalTradeCnt() {
			return totalTradeCnt;
		}

		public void setTotalTradeCnt(Integer totalTradeCnt) {
			this.totalTradeCnt = totalTradeCnt;
		}

		public BigDecimal getTotalCampaignTradeAmt() {
			return totalCampaignTradeAmt;
		}

		public void setTotalCampaignTradeAmt(BigDecimal totalCampaignTradeAmt) {
			this.totalCampaignTradeAmt = totalCampaignTradeAmt;
		}

		public Integer getTotalCampaignTradeCnt() {
			return totalCampaignTradeCnt;
		}

		public void setTotalCampaignTradeCnt(Integer totalCampaignTradeCnt) {
			this.totalCampaignTradeCnt = totalCampaignTradeCnt;
		}
	}
	/**
	 * <p>ClassName:TradeQueryByStoreModel.java </p>
	 * <p>Description: 商户门店维度查询交易信息 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author wuqiong  2016年7月14日
	 */
	public static class TradeQueryByStoreModel implements Serializable {

		private static final long serialVersionUID = -8899417032894419883L;

		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;                     //业务日期              格式:yyyyMMdd
		@JSONField(name = "store_id")
		private String storeId;                     //门店ID
		@JSONField(name = "store_name")
		private String storeName;                   //门店名称
		@JSONField(name = "cat2_name")
		private String cat2Name;                    //门店行业名称
		@JSONField(name = "cat2_id")
		private String cat2Id;                      //门店行业ID
		@JSONField(name = "today_trade_amt")
		private BigDecimal todayTradeAmt;              //当日收益金额          单位：分
		@JSONField(name = "today_trade_cnt")
		private BigDecimal todayTradeCnt;              //当日消费笔数
		@JSONField(name = "today_campaign_trade_amt")
		private BigDecimal todayCampaignradeAmt;     //当日活动收益金额      单位：分
		@JSONField(name = "today_campaign_trade_cnt")
		private BigDecimal todayCampaignTradeCnt;     //当日活动交易笔数
		@JSONField(name = "recent_7d_trade_amt")
		private BigDecimal recent7dTradeAmt;          //近7天收益金额         单位：分
		@JSONField(name = "recent_30d_trade_amt")
		private BigDecimal recent30dTradeAmt;         //近30天收益金额        单位：分
		@JSONField(name = "recent_90d_trade_amt")
		private BigDecimal recent90dTradeAmt;         //近90天收益金额        单位：分
		@JSONField(name = "recent_7d_trade_cnt")
		private BigDecimal recent7dTradeCnt;          //近7天交易笔数
		@JSONField(name = "recent_30d_trade_cnt")
		private BigDecimal recent30dTradeCnt;         //近30天交易笔数
		@JSONField(name = "recent_90d_trade_cnt")
		private BigDecimal recent90dTradeCnt;         //近90天交易笔数
		@JSONField(name = "recent_7d_campaign_trade_amt")
		private BigDecimal recent7dCampaignTradeAmt; //近7天活动收益金额     单位：分
		@JSONField(name = "recent_30d_campaign_trade_amt")
		private BigDecimal recent30dCampaignTradeAmt;//近30天活动收益金额    单位：分
		@JSONField(name = "recent_90d_campaign_trade_amt")
		private BigDecimal recent90dCampaignTradeAmt;//近90天活动收益金额    单位：分
		@JSONField(name = "recent_7d_campaign_trade_cnt")
		private Integer recent7dCampaignTradeCnt; //近7天活动交易笔数
		@JSONField(name = "recent_30d_campaign_trade_cnt")
		private Integer recent30dCampaignTradeCnt;//近30天活动交易笔数
		@JSONField(name = "recent_90d_campaign_trade_cnt")
		private Integer recent90dCampaignTradeCnt;//近90天活动交易笔数

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public String getStoreId() {
			return storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getStoreName() {
			return storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public String getCat2Name() {
			return cat2Name;
		}

		public void setCat2Name(String cat2Name) {
			this.cat2Name = cat2Name;
		}

		public String getCat2Id() {
			return cat2Id;
		}

		public void setCat2Id(String cat2Id) {
			this.cat2Id = cat2Id;
		}

		public BigDecimal getTodayTradeAmt() {
			return todayTradeAmt;
		}

		public void setTodayTradeAmt(BigDecimal todayTradeAmt) {
			this.todayTradeAmt = todayTradeAmt;
		}

		public BigDecimal getTodayTradeCnt() {
			return todayTradeCnt;
		}

		public void setTodayTradeCnt(BigDecimal todayTradeCnt) {
			this.todayTradeCnt = todayTradeCnt;
		}

		public BigDecimal getTodayCampaignradeAmt() {
			return todayCampaignradeAmt;
		}

		public void setTodayCampaignradeAmt(BigDecimal todayCampaignradeAmt) {
			this.todayCampaignradeAmt = todayCampaignradeAmt;
		}

		public BigDecimal getTodayCampaignTradeCnt() {
			return todayCampaignTradeCnt;
		}

		public void setTodayCampaignTradeCnt(BigDecimal todayCampaignTradeCnt) {
			this.todayCampaignTradeCnt = todayCampaignTradeCnt;
		}

		public BigDecimal getRecent7dTradeAmt() {
			return recent7dTradeAmt;
		}

		public void setRecent7dTradeAmt(BigDecimal recent7dTradeAmt) {
			this.recent7dTradeAmt = recent7dTradeAmt;
		}

		public BigDecimal getRecent30dTradeAmt() {
			return recent30dTradeAmt;
		}

		public void setRecent30dTradeAmt(BigDecimal recent30dTradeAmt) {
			this.recent30dTradeAmt = recent30dTradeAmt;
		}

		public BigDecimal getRecent90dTradeAmt() {
			return recent90dTradeAmt;
		}

		public void setRecent90dTradeAmt(BigDecimal recent90dTradeAmt) {
			this.recent90dTradeAmt = recent90dTradeAmt;
		}

		public BigDecimal getRecent7dTradeCnt() {
			return recent7dTradeCnt;
		}

		public void setRecent7dTradeCnt(BigDecimal recent7dTradeCnt) {
			this.recent7dTradeCnt = recent7dTradeCnt;
		}

		public BigDecimal getRecent30dTradeCnt() {
			return recent30dTradeCnt;
		}

		public void setRecent30dTradeCnt(BigDecimal recent30dTradeCnt) {
			this.recent30dTradeCnt = recent30dTradeCnt;
		}

		public BigDecimal getRecent90dTradeCnt() {
			return recent90dTradeCnt;
		}

		public void setRecent90dTradeCnt(BigDecimal recent90dTradeCnt) {
			this.recent90dTradeCnt = recent90dTradeCnt;
		}

		public BigDecimal getRecent7dCampaignTradeAmt() {
			return recent7dCampaignTradeAmt;
		}

		public void setRecent7dCampaignTradeAmt(BigDecimal recent7dCampaignTradeAmt) {
			this.recent7dCampaignTradeAmt = recent7dCampaignTradeAmt;
		}

		public BigDecimal getRecent30dCampaignTradeAmt() {
			return recent30dCampaignTradeAmt;
		}

		public void setRecent30dCampaignTradeAmt(BigDecimal recent30dCampaignTradeAmt) {
			this.recent30dCampaignTradeAmt = recent30dCampaignTradeAmt;
		}

		public BigDecimal getRecent90dCampaignTradeAmt() {
			return recent90dCampaignTradeAmt;
		}

		public void setRecent90dCampaignTradeAmt(BigDecimal recent90dCampaignTradeAmt) {
			this.recent90dCampaignTradeAmt = recent90dCampaignTradeAmt;
		}

		public Integer getRecent7dCampaignTradeCnt() {
			return recent7dCampaignTradeCnt;
		}

		public void setRecent7dCampaignTradeCnt(Integer recent7dCampaignTradeCnt) {
			this.recent7dCampaignTradeCnt = recent7dCampaignTradeCnt;
		}

		public Integer getRecent30dCampaignTradeCnt() {
			return recent30dCampaignTradeCnt;
		}

		public void setRecent30dCampaignTradeCnt(Integer recent30dCampaignTradeCnt) {
			this.recent30dCampaignTradeCnt = recent30dCampaignTradeCnt;
		}

		public Integer getRecent90dCampaignTradeCnt() {
			return recent90dCampaignTradeCnt;
		}

		public void setRecent90dCampaignTradeCnt(Integer recent90dCampaignTradeCnt) {
			this.recent90dCampaignTradeCnt = recent90dCampaignTradeCnt;
		}
	}
	/**
	 * <p>ClassName:CampaignQueryModel.java </p>
	 * <p>Description: 商户维度查询活动信息 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author wuqiong  2016年7月14日
	 */
	public static class CampaignQueryModel implements Serializable {

		private static final long serialVersionUID = -7984739046613054783L;

		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;                   //业务日期                            格式:yyyyMMdd
		@JSONField(name = "camp_name")
		private String campName;				   //活动名称
		@JSONField(name = "today_taken_cnt")
		private Integer todayTakenCnt;            //当日[修改为当日]领券量
		@JSONField(name = "today_taken_user_cnt")
		private Integer todayTakenUserCnt;       //当日领券人数
		@JSONField(name = "today_used_cnt")
		private Integer todayUsedCnt;             //当日核销量
		@JSONField(name = "today_used_user_cnt")
		private Integer todayUsedUserCnt;        //当日核销人数
		@JSONField(name = "today_campaign_trade_amt")
		private BigDecimal todayCampaignTradeAmt;   //当日活动收益金额                    单位：分
		@JSONField(name = "today_campaign_new_user_cnt")
		private Integer todayCampaignNewUserCnt;//当日活动新增会员数
		@JSONField(name = "total_taken_cnt")
		private Integer totalTakenCnt;            //(截止到业务日期的)累计领券量
		@JSONField(name = "total_taken_user_cnt")
		private Integer totalTakenUserCnt;       //(截止到业务日期的)累计领券人数
		@JSONField(name = "total_used_cnt")
		private Integer totalUsedCnt;             //(截止到业务日期的)累计核券量
		@JSONField(name = "total_used_user_cnt")
		private Integer totalUsedUserCnt;        //(截止到业务日期的)累计核券人数
		@JSONField(name = "total_campaign_trade_amt")
		private BigDecimal totalCampaignTradeAmt;   //(截止到业务日期的)累计活动收益金额  单位：分
		@JSONField(name = "total_campaign_trade_cnt")
		private Integer totalCampaignTradeCnt;   //(截止到业务日期的)累计活动交易笔数
		@JSONField(name = "total_campaign_order_amt")
		private BigDecimal totalCampaignOrderAmt;   //(截止到业务日期的)累计活动订单金额  单位：分
		@JSONField(name = "total_campaign_new_user_cnt")
		private Integer totalCampaignNewUserCnt;//(截止到业务日期的)累计活动新增会员数
		@JSONField(name = "total_taken_repay_user_cnt")
		private Integer totalTakenRepayUserCnt;//累计活动领券回头会员数
		@JSONField(name = "total_taken_repay_trade_cnt")
		private Integer totalTakenRepayTradeCnt;//累计活动领券回头交易笔数
		@JSONField(name = "total_taken_repay_order_amt")
		private BigDecimal totalTakenRepayOrderAmt;//累计活动领券回头订单金额
		@JSONField(name = "total_taken_repay_trade_amt")
		private BigDecimal totalTakenRepayTradeAmt;//累计活动领券回头实收金额
		@JSONField(name = "total_relative_period_pid_trade_cnt")
		private Integer totalRelativePeriodPidTradeCnt;//累计活动环比同跨期商户总交易数
		@JSONField(name = "total_relative_period_pid_repay_trade_cnt")
		private Integer totalRelativePeriodPidRepayTradeCnt;//累计活动环比同跨期商户总回头交易笔数
		@JSONField(name = "total_relative_period_pid_trade_user_cnt")
		private Integer totalRelativePeriodPidTradeUserCnt;//累计活动环比同跨期商户总交易会员数
		@JSONField(name = "total_relative_period_pid_repay_order_amt")
		private BigDecimal totalRelativePeriodPidRepayOrderAmt;//累计活动环比同跨期商户总回头订单金额
		@JSONField(name = "total_relative_period_pid_repay_trade_amt")
		private BigDecimal totalRelativePeriodPidRepayTradeAmt;//累计活动环比同跨期商户总回头实收金额
		@JSONField(name = "total_camp_period_pid_loss_trade_cnt")
		private Integer totalCampPeriodPidLossTradeCnt;//累计活动期商户流失会员交易笔数
		@JSONField(name = "total_camp_period_pid_loss_trade_user_cnt")
		private Integer totalCampPeriodPidLossTradeUserCnt;//累计活动期商户流失会员交易会员数
		@JSONField(name = "total_camp_period_pid_loss_order_amt")
		private BigDecimal totalCampPeriodPidLossOrderAmt;//累计活动期商户流失会员交易订单金额
		@JSONField(name = "total_camp_period_pid_loss_trade_amt")
		private BigDecimal totalCampPeriodPidLossTradeAmt;//累计活动期商户流失会员交易实收金额
		@JSONField(name = "total_relative_period_pid_loss_trade_cnt")
		private Integer totalRelativePeriodPidLossTradeCnt;//累计活动环比同跨期商户流失会员交易数
		@JSONField(name = "total_relative_period_pid_loss_trade_user_cnt")
		private Integer totalRelativePeriodPidLossTradeUserCnt;//累计活动环比同跨期商户流失会员交易会员数
		@JSONField(name = "total_relative_period_pid_loss_order_amt")
		private BigDecimal totalRelativePeriodPidLossOrderAmt;//累计活动期环比同跨期商户流失会员订单金额
		@JSONField(name = "total_relative_period_pid_loss_trade_amt")
		private BigDecimal totalRelativePeriodPidLossTradeAmt;//累计活动期环比同跨期商户流失会员实收金额

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public String getCampName() {
			return campName;
		}

		public void setCampName(String campName) {
			this.campName = campName;
		}

		public Integer getTodayTakenCnt() {
			return todayTakenCnt;
		}

		public void setTodayTakenCnt(Integer todayTakenCnt) {
			this.todayTakenCnt = todayTakenCnt;
		}

		public Integer getTodayTakenUserCnt() {
			return todayTakenUserCnt;
		}

		public void setTodayTakenUserCnt(Integer todayTakenUserCnt) {
			this.todayTakenUserCnt = todayTakenUserCnt;
		}

		public Integer getTodayUsedCnt() {
			return todayUsedCnt;
		}

		public void setTodayUsedCnt(Integer todayUsedCnt) {
			this.todayUsedCnt = todayUsedCnt;
		}

		public Integer getTodayUsedUserCnt() {
			return todayUsedUserCnt;
		}

		public void setTodayUsedUserCnt(Integer todayUsedUserCnt) {
			this.todayUsedUserCnt = todayUsedUserCnt;
		}

		public BigDecimal getTodayCampaignTradeAmt() {
			return todayCampaignTradeAmt;
		}

		public void setTodayCampaignTradeAmt(BigDecimal todayCampaignTradeAmt) {
			this.todayCampaignTradeAmt = todayCampaignTradeAmt;
		}

		public Integer getTodayCampaignNewUserCnt() {
			return todayCampaignNewUserCnt;
		}

		public void setTodayCampaignNewUserCnt(Integer todayCampaignNewUserCnt) {
			this.todayCampaignNewUserCnt = todayCampaignNewUserCnt;
		}

		public Integer getTotalTakenCnt() {
			return totalTakenCnt;
		}

		public void setTotalTakenCnt(Integer totalTakenCnt) {
			this.totalTakenCnt = totalTakenCnt;
		}

		public Integer getTotalTakenUserCnt() {
			return totalTakenUserCnt;
		}

		public void setTotalTakenUserCnt(Integer totalTakenUserCnt) {
			this.totalTakenUserCnt = totalTakenUserCnt;
		}

		public Integer getTotalUsedCnt() {
			return totalUsedCnt;
		}

		public void setTotalUsedCnt(Integer totalUsedCnt) {
			this.totalUsedCnt = totalUsedCnt;
		}

		public Integer getTotalUsedUserCnt() {
			return totalUsedUserCnt;
		}

		public void setTotalUsedUserCnt(Integer totalUsedUserCnt) {
			this.totalUsedUserCnt = totalUsedUserCnt;
		}

		public BigDecimal getTotalCampaignTradeAmt() {
			return totalCampaignTradeAmt;
		}

		public void setTotalCampaignTradeAmt(BigDecimal totalCampaignTradeAmt) {
			this.totalCampaignTradeAmt = totalCampaignTradeAmt;
		}

		public Integer getTotalCampaignTradeCnt() {
			return totalCampaignTradeCnt;
		}

		public void setTotalCampaignTradeCnt(Integer totalCampaignTradeCnt) {
			this.totalCampaignTradeCnt = totalCampaignTradeCnt;
		}

		public BigDecimal getTotalCampaignOrderAmt() {
			return totalCampaignOrderAmt;
		}

		public void setTotalCampaignOrderAmt(BigDecimal totalCampaignOrderAmt) {
			this.totalCampaignOrderAmt = totalCampaignOrderAmt;
		}

		public Integer getTotalCampaignNewUserCnt() {
			return totalCampaignNewUserCnt;
		}

		public void setTotalCampaignNewUserCnt(Integer totalCampaignNewUserCnt) {
			this.totalCampaignNewUserCnt = totalCampaignNewUserCnt;
		}

		public Integer getTotalTakenRepayUserCnt() {
			return totalTakenRepayUserCnt;
		}

		public void setTotalTakenRepayUserCnt(Integer totalTakenRepayUserCnt) {
			this.totalTakenRepayUserCnt = totalTakenRepayUserCnt;
		}

		public Integer getTotalTakenRepayTradeCnt() {
			return totalTakenRepayTradeCnt;
		}

		public void setTotalTakenRepayTradeCnt(Integer totalTakenRepayTradeCnt) {
			this.totalTakenRepayTradeCnt = totalTakenRepayTradeCnt;
		}

		public BigDecimal getTotalTakenRepayOrderAmt() {
			return totalTakenRepayOrderAmt;
		}

		public void setTotalTakenRepayOrderAmt(BigDecimal totalTakenRepayOrderAmt) {
			this.totalTakenRepayOrderAmt = totalTakenRepayOrderAmt;
		}

		public BigDecimal getTotalTakenRepayTradeAmt() {
			return totalTakenRepayTradeAmt;
		}

		public void setTotalTakenRepayTradeAmt(BigDecimal totalTakenRepayTradeAmt) {
			this.totalTakenRepayTradeAmt = totalTakenRepayTradeAmt;
		}

		public Integer getTotalRelativePeriodPidTradeCnt() {
			return totalRelativePeriodPidTradeCnt;
		}

		public void setTotalRelativePeriodPidTradeCnt(Integer totalRelativePeriodPidTradeCnt) {
			this.totalRelativePeriodPidTradeCnt = totalRelativePeriodPidTradeCnt;
		}

		public Integer getTotalRelativePeriodPidRepayTradeCnt() {
			return totalRelativePeriodPidRepayTradeCnt;
		}

		public void setTotalRelativePeriodPidRepayTradeCnt(Integer totalRelativePeriodPidRepayTradeCnt) {
			this.totalRelativePeriodPidRepayTradeCnt = totalRelativePeriodPidRepayTradeCnt;
		}

		public Integer getTotalRelativePeriodPidTradeUserCnt() {
			return totalRelativePeriodPidTradeUserCnt;
		}

		public void setTotalRelativePeriodPidTradeUserCnt(Integer totalRelativePeriodPidTradeUserCnt) {
			this.totalRelativePeriodPidTradeUserCnt = totalRelativePeriodPidTradeUserCnt;
		}

		public BigDecimal getTotalRelativePeriodPidRepayOrderAmt() {
			return totalRelativePeriodPidRepayOrderAmt;
		}

		public void setTotalRelativePeriodPidRepayOrderAmt(BigDecimal totalRelativePeriodPidRepayOrderAmt) {
			this.totalRelativePeriodPidRepayOrderAmt = totalRelativePeriodPidRepayOrderAmt;
		}

		public BigDecimal getTotalRelativePeriodPidRepayTradeAmt() {
			return totalRelativePeriodPidRepayTradeAmt;
		}

		public void setTotalRelativePeriodPidRepayTradeAmt(BigDecimal totalRelativePeriodPidRepayTradeAmt) {
			this.totalRelativePeriodPidRepayTradeAmt = totalRelativePeriodPidRepayTradeAmt;
		}

		public Integer getTotalCampPeriodPidLossTradeCnt() {
			return totalCampPeriodPidLossTradeCnt;
		}

		public void setTotalCampPeriodPidLossTradeCnt(Integer totalCampPeriodPidLossTradeCnt) {
			this.totalCampPeriodPidLossTradeCnt = totalCampPeriodPidLossTradeCnt;
		}

		public Integer getTotalCampPeriodPidLossTradeUserCnt() {
			return totalCampPeriodPidLossTradeUserCnt;
		}

		public void setTotalCampPeriodPidLossTradeUserCnt(Integer totalCampPeriodPidLossTradeUserCnt) {
			this.totalCampPeriodPidLossTradeUserCnt = totalCampPeriodPidLossTradeUserCnt;
		}

		public BigDecimal getTotalCampPeriodPidLossOrderAmt() {
			return totalCampPeriodPidLossOrderAmt;
		}

		public void setTotalCampPeriodPidLossOrderAmt(BigDecimal totalCampPeriodPidLossOrderAmt) {
			this.totalCampPeriodPidLossOrderAmt = totalCampPeriodPidLossOrderAmt;
		}

		public BigDecimal getTotalCampPeriodPidLossTradeAmt() {
			return totalCampPeriodPidLossTradeAmt;
		}

		public void setTotalCampPeriodPidLossTradeAmt(BigDecimal totalCampPeriodPidLossTradeAmt) {
			this.totalCampPeriodPidLossTradeAmt = totalCampPeriodPidLossTradeAmt;
		}

		public Integer getTotalRelativePeriodPidLossTradeCnt() {
			return totalRelativePeriodPidLossTradeCnt;
		}

		public void setTotalRelativePeriodPidLossTradeCnt(Integer totalRelativePeriodPidLossTradeCnt) {
			this.totalRelativePeriodPidLossTradeCnt = totalRelativePeriodPidLossTradeCnt;
		}

		public Integer getTotalRelativePeriodPidLossTradeUserCnt() {
			return totalRelativePeriodPidLossTradeUserCnt;
		}

		public void setTotalRelativePeriodPidLossTradeUserCnt(Integer totalRelativePeriodPidLossTradeUserCnt) {
			this.totalRelativePeriodPidLossTradeUserCnt = totalRelativePeriodPidLossTradeUserCnt;
		}

		public BigDecimal getTotalRelativePeriodPidLossOrderAmt() {
			return totalRelativePeriodPidLossOrderAmt;
		}

		public void setTotalRelativePeriodPidLossOrderAmt(BigDecimal totalRelativePeriodPidLossOrderAmt) {
			this.totalRelativePeriodPidLossOrderAmt = totalRelativePeriodPidLossOrderAmt;
		}

		public BigDecimal getTotalRelativePeriodPidLossTradeAmt() {
			return totalRelativePeriodPidLossTradeAmt;
		}

		public void setTotalRelativePeriodPidLossTradeAmt(BigDecimal totalRelativePeriodPidLossTradeAmt) {
			this.totalRelativePeriodPidLossTradeAmt = totalRelativePeriodPidLossTradeAmt;
		}
	}
	/**
	 * <p>ClassName:CampaignQueryByStoreModel.java </p>
	 * <p>Description: 商户门店维度查询活动信息 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author wuqiong  2016年7月14日
	 */
	public static class CampaignQueryByStoreModel implements Serializable {

		private static final long serialVersionUID = 3877935574888235123L;
		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;                        //业务日期               格式:yyyyMMdd
		@JSONField(name = "store_id")
		private String storeId;                        //门店ID
		@JSONField(name = "store_name")
		private String storeName;                      //门店名称
		@JSONField(name = "cat2_name")
		private String cat2Name;                       //门店行业名称
		@JSONField(name = "cat2_id")
		private String cat2Id;                         //门店行业ID
		@JSONField(name = "camp_name")
		private String campName;                       //活动名称
		@JSONField(name = "today_used_cnt")
		private Integer todayUsedCnt;                  //当日核销量
		@JSONField(name = "today_used_user_cnt")
		private Integer todayUsedUserCnt;             //当日核销人数
		@JSONField(name = "today_campaign_trade_amt")
		private BigDecimal todayCampaignTradeAmt;        //当日活动收益金额       单位：分
		@JSONField(name = "today_campaign_new_user_cnt")
		private Integer todayCampaignNewUserCnt;     //当日活动新增会员数
		@JSONField(name = "recent_7d_used_cnt")
		private Integer recent7dUsedCnt;              //近7天核券量
		@JSONField(name = "recent_30d_used_cnt")
		private Integer recent30dUsedCnt;             //近30天核券量
		@JSONField(name = "recent_90d_used_cnt")
		private Integer recent90dUsedCnt;             //近90天核券量
		@JSONField(name = "recent_7d_used_user_cnt")
		private Integer recent7dUsedUserCnt;         //近7天核券人数
		@JSONField(name = "recent_30d_used_user_cnt")
		private Integer recent30dUsedUserCnt;        //近30天核券人数
		@JSONField(name = "recent_90d_used_user_cnt")
		private Integer recent90dUsedUserCnt;        //近90天核券人数
		@JSONField(name = "recent_7d_campaign_trade_amt")
		private BigDecimal recent7dCampaignTradeAmt;    //近7天活动收益金额      单位：分
		@JSONField(name = "recent_30d_campaign_trade_amt")
		private BigDecimal recent30dCampaignTradeAmt;   //近30天活动收益金额     单位：分
		@JSONField(name = "recent_90d_campaign_trade_amt")
		private BigDecimal recent90dCampaignTradeAmt;   //近90天活动收益金额     单位：分
		@JSONField(name = "recent_7d_campaign_new_user_cnt")
		private Integer recent7dCampaignNewUserCnt; //近7天活动新增会员数
		@JSONField(name = "recent_30d_campaign_new_user_cnt")
		private Integer recent30dCampaignNewUserCnt;//近30天活动新增会员数
		@JSONField(name = "recent_90d_campaign_new_user_cnt")
		private Integer recent90dCampaignNewUserCnt;//近90天活动新增会员数
		@JSONField(name = "recent_7d_new_user_cnt")
		private Integer recent7dNewUserCnt;          //近7天新增会员数
		@JSONField(name = "recent_30d_new_user_cnt")
		private Integer recent30dNewUserCnt;         //近30天新增会员数
		@JSONField(name = "recent_90d_new_user_cnt")
		private Integer recent90dNewUserCnt;         //近90天新增会员数

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public String getStoreId() {
			return storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public String getStoreName() {
			return storeName;
		}

		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}

		public String getCat2Name() {
			return cat2Name;
		}

		public void setCat2Name(String cat2Name) {
			this.cat2Name = cat2Name;
		}

		public String getCat2Id() {
			return cat2Id;
		}

		public void setCat2Id(String cat2Id) {
			this.cat2Id = cat2Id;
		}

		public String getCampName() {
			return campName;
		}

		public void setCampName(String campName) {
			this.campName = campName;
		}

		public Integer getTodayUsedCnt() {
			return todayUsedCnt;
		}

		public void setTodayUsedCnt(Integer todayUsedCnt) {
			this.todayUsedCnt = todayUsedCnt;
		}

		public Integer getTodayUsedUserCnt() {
			return todayUsedUserCnt;
		}

		public void setTodayUsedUserCnt(Integer todayUsedUserCnt) {
			this.todayUsedUserCnt = todayUsedUserCnt;
		}

		public BigDecimal getTodayCampaignTradeAmt() {
			return todayCampaignTradeAmt;
		}

		public void setTodayCampaignTradeAmt(BigDecimal todayCampaignTradeAmt) {
			this.todayCampaignTradeAmt = todayCampaignTradeAmt;
		}

		public Integer getTodayCampaignNewUserCnt() {
			return todayCampaignNewUserCnt;
		}

		public void setTodayCampaignNewUserCnt(Integer todayCampaignNewUserCnt) {
			this.todayCampaignNewUserCnt = todayCampaignNewUserCnt;
		}

		public Integer getRecent7dUsedCnt() {
			return recent7dUsedCnt;
		}

		public void setRecent7dUsedCnt(Integer recent7dUsedCnt) {
			this.recent7dUsedCnt = recent7dUsedCnt;
		}

		public Integer getRecent30dUsedCnt() {
			return recent30dUsedCnt;
		}

		public void setRecent30dUsedCnt(Integer recent30dUsedCnt) {
			this.recent30dUsedCnt = recent30dUsedCnt;
		}

		public Integer getRecent90dUsedCnt() {
			return recent90dUsedCnt;
		}

		public void setRecent90dUsedCnt(Integer recent90dUsedCnt) {
			this.recent90dUsedCnt = recent90dUsedCnt;
		}

		public Integer getRecent7dUsedUserCnt() {
			return recent7dUsedUserCnt;
		}

		public void setRecent7dUsedUserCnt(Integer recent7dUsedUserCnt) {
			this.recent7dUsedUserCnt = recent7dUsedUserCnt;
		}

		public Integer getRecent30dUsedUserCnt() {
			return recent30dUsedUserCnt;
		}

		public void setRecent30dUsedUserCnt(Integer recent30dUsedUserCnt) {
			this.recent30dUsedUserCnt = recent30dUsedUserCnt;
		}

		public Integer getRecent90dUsedUserCnt() {
			return recent90dUsedUserCnt;
		}

		public void setRecent90dUsedUserCnt(Integer recent90dUsedUserCnt) {
			this.recent90dUsedUserCnt = recent90dUsedUserCnt;
		}

		public BigDecimal getRecent7dCampaignTradeAmt() {
			return recent7dCampaignTradeAmt;
		}

		public void setRecent7dCampaignTradeAmt(BigDecimal recent7dCampaignTradeAmt) {
			this.recent7dCampaignTradeAmt = recent7dCampaignTradeAmt;
		}

		public BigDecimal getRecent30dCampaignTradeAmt() {
			return recent30dCampaignTradeAmt;
		}

		public void setRecent30dCampaignTradeAmt(BigDecimal recent30dCampaignTradeAmt) {
			this.recent30dCampaignTradeAmt = recent30dCampaignTradeAmt;
		}

		public BigDecimal getRecent90dCampaignTradeAmt() {
			return recent90dCampaignTradeAmt;
		}

		public void setRecent90dCampaignTradeAmt(BigDecimal recent90dCampaignTradeAmt) {
			this.recent90dCampaignTradeAmt = recent90dCampaignTradeAmt;
		}

		public Integer getRecent7dCampaignNewUserCnt() {
			return recent7dCampaignNewUserCnt;
		}

		public void setRecent7dCampaignNewUserCnt(Integer recent7dCampaignNewUserCnt) {
			this.recent7dCampaignNewUserCnt = recent7dCampaignNewUserCnt;
		}

		public Integer getRecent30dCampaignNewUserCnt() {
			return recent30dCampaignNewUserCnt;
		}

		public void setRecent30dCampaignNewUserCnt(Integer recent30dCampaignNewUserCnt) {
			this.recent30dCampaignNewUserCnt = recent30dCampaignNewUserCnt;
		}

		public Integer getRecent90dCampaignNewUserCnt() {
			return recent90dCampaignNewUserCnt;
		}

		public void setRecent90dCampaignNewUserCnt(Integer recent90dCampaignNewUserCnt) {
			this.recent90dCampaignNewUserCnt = recent90dCampaignNewUserCnt;
		}

		public Integer getRecent7dNewUserCnt() {
			return recent7dNewUserCnt;
		}

		public void setRecent7dNewUserCnt(Integer recent7dNewUserCnt) {
			this.recent7dNewUserCnt = recent7dNewUserCnt;
		}

		public Integer getRecent30dNewUserCnt() {
			return recent30dNewUserCnt;
		}

		public void setRecent30dNewUserCnt(Integer recent30dNewUserCnt) {
			this.recent30dNewUserCnt = recent30dNewUserCnt;
		}

		public Integer getRecent90dNewUserCnt() {
			return recent90dNewUserCnt;
		}

		public void setRecent90dNewUserCnt(Integer recent90dNewUserCnt) {
			this.recent90dNewUserCnt = recent90dNewUserCnt;
		}
	}
	/**
	 * <p>ConponsQueryModel.java </p>
	 * <p>Description: 用户券数据查询 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author zhangfei  2016年11月14日
	 */
	public static class ConponsQueryModel  implements Serializable {

		private static final long serialVersionUID = 7525174079967978332L;

		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;// 业务日期
		@JSONField(name = "partner_id")
		private String partnerId;// 商户id
		@JSONField(name = "template_id")
		private String templateId;// 券模板id
		@JSONField(name = "template_name")
		private String templateName;// 券模板名称
		@JSONField(name = "activity_id")
		private String activityId;// 外部传入的活动id
		@JSONField(name = "camp_name")
		private String campName;// 活动名称
		@JSONField(name = "today_taken_cnt")
		private Integer todayTakenCnt;// 领券量
		@JSONField(name = "today_taken_user_cnt")
		private Integer todayTakenUserCnt;// 领券人数
		@JSONField(name = "today_use_cnt")
		private Integer todayUseCnt;// 核券量
		@JSONField(name = "today_use_user_cnt")
		private Integer todayUseUserCnt;// 核券人数
		@JSONField(name = "today_campaign_trade_amt")
		private BigDecimal todayCampaignTradeAmt;// 活动收益金额 单位：分
		@JSONField(name = "today_campaign_new_user_cnt")
		private Integer todayCampaignNewUserCnt;// 活动新增会员数
		@JSONField(name = "total_taken_cnt")
		private Integer totalTakenCnt;// 累计领券量
		@JSONField(name = "total_taken_user_cnt")
		private Integer totalTakenUserCnt;// 累计领券人数
		@JSONField(name = "total_use_cnt")
		private Integer totalUseCnt;// 累计核券量
		@JSONField(name = "total_use_user_cnt")
		private Integer totalUseUserCnt;// 累计核券人数
		@JSONField(name = "total_campaign_trade_amt")
		private BigDecimal totalCampaignTradeAmt;// 累计活动收益金额 单位：分
		@JSONField(name = "total_campaign_trade_cnt")
		private Integer totalCampaignTradeCnt;// 累计活动交易笔数
		@JSONField(name = "total_campaign_order_amt")
		private BigDecimal totalCampaignOrderAmt;// 累计活动订单金额 单位：分
		@JSONField(name = "total_campaign_new_user_cnt")
		private Integer totalCampaignNewUserCnt;// 累计新增会员数

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public String getPartnerId() {
			return partnerId;
		}

		public void setPartnerId(String partnerId) {
			this.partnerId = partnerId;
		}

		public String getTemplateId() {
			return templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getActivityId() {
			return activityId;
		}

		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}

		public String getCampName() {
			return campName;
		}

		public void setCampName(String campName) {
			this.campName = campName;
		}

		public Integer getTodayTakenCnt() {
			return todayTakenCnt;
		}

		public void setTodayTakenCnt(Integer todayTakenCnt) {
			this.todayTakenCnt = todayTakenCnt;
		}

		public Integer getTodayTakenUserCnt() {
			return todayTakenUserCnt;
		}

		public void setTodayTakenUserCnt(Integer todayTakenUserCnt) {
			this.todayTakenUserCnt = todayTakenUserCnt;
		}

		public Integer getTodayUseCnt() {
			return todayUseCnt;
		}

		public void setTodayUseCnt(Integer todayUseCnt) {
			this.todayUseCnt = todayUseCnt;
		}

		public Integer getTodayUseUserCnt() {
			return todayUseUserCnt;
		}

		public void setTodayUseUserCnt(Integer todayUseUserCnt) {
			this.todayUseUserCnt = todayUseUserCnt;
		}

		public BigDecimal getTodayCampaignTradeAmt() {
			return todayCampaignTradeAmt;
		}

		public void setTodayCampaignTradeAmt(BigDecimal todayCampaignTradeAmt) {
			this.todayCampaignTradeAmt = todayCampaignTradeAmt;
		}

		public Integer getTodayCampaignNewUserCnt() {
			return todayCampaignNewUserCnt;
		}

		public void setTodayCampaignNewUserCnt(Integer todayCampaignNewUserCnt) {
			this.todayCampaignNewUserCnt = todayCampaignNewUserCnt;
		}

		public Integer getTotalTakenCnt() {
			return totalTakenCnt;
		}

		public void setTotalTakenCnt(Integer totalTakenCnt) {
			this.totalTakenCnt = totalTakenCnt;
		}

		public Integer getTotalTakenUserCnt() {
			return totalTakenUserCnt;
		}

		public void setTotalTakenUserCnt(Integer totalTakenUserCnt) {
			this.totalTakenUserCnt = totalTakenUserCnt;
		}

		public Integer getTotalUseCnt() {
			return totalUseCnt;
		}

		public void setTotalUseCnt(Integer totalUseCnt) {
			this.totalUseCnt = totalUseCnt;
		}

		public Integer getTotalUseUserCnt() {
			return totalUseUserCnt;
		}

		public void setTotalUseUserCnt(Integer totalUseUserCnt) {
			this.totalUseUserCnt = totalUseUserCnt;
		}

		public BigDecimal getTotalCampaignTradeAmt() {
			return totalCampaignTradeAmt;
		}

		public void setTotalCampaignTradeAmt(BigDecimal totalCampaignTradeAmt) {
			this.totalCampaignTradeAmt = totalCampaignTradeAmt;
		}

		public Integer getTotalCampaignTradeCnt() {
			return totalCampaignTradeCnt;
		}

		public void setTotalCampaignTradeCnt(Integer totalCampaignTradeCnt) {
			this.totalCampaignTradeCnt = totalCampaignTradeCnt;
		}

		public BigDecimal getTotalCampaignOrderAmt() {
			return totalCampaignOrderAmt;
		}

		public void setTotalCampaignOrderAmt(BigDecimal totalCampaignOrderAmt) {
			this.totalCampaignOrderAmt = totalCampaignOrderAmt;
		}

		public Integer getTotalCampaignNewUserCnt() {
			return totalCampaignNewUserCnt;
		}

		public void setTotalCampaignNewUserCnt(Integer totalCampaignNewUserCnt) {
			this.totalCampaignNewUserCnt = totalCampaignNewUserCnt;
		}
	}
	/**
	 * <p>ConponsQueryByStoreModel.java </p>
	 * <p>Description: 门店券数据查询 </p>
	 * <p>Company:雅座在线（北京）科技发展有限公司 </p>
	 * @author zhangfei  2016年11月14日
	 */
	public class ConponsQueryByStoreModel implements Serializable  {

		private static final long serialVersionUID = -7922467944480347554L;

		@JSONField(name = "biz_date",format = "yyyyMMdd")
		private Date bizDate;//业务日期
		@JSONField(name = "partner_id")
		private String partnerId;//商户pid
		@JSONField(name = "activity_id")
		private String activityId;//外部传入的活动id
		@JSONField(name = "camp_name")
		private String campName;//活动名称
		@JSONField(name = "template_id")
		private String templateId;//券模板id
		@JSONField(name = "template_name")
		private String templateName;//券模板名称
		@JSONField(name = "shop_name")
		private String shopName;//门店名称
		@JSONField(name = "shop_id")
		private String shopId;//门店id
		@JSONField(name = "use_cnt_1d")
		private Integer useCnt1d;//核券量
		@JSONField(name = "use_user_cnt_1d")
		private Integer useUserCnt1d;//核券人数
		@JSONField(name = "campaign_trade_amt_1d")
		private BigDecimal campaignTradeAmt1d;//活动收益金额 单位：分
		@JSONField(name = "new_user_cnt_1d")
		private Integer newUserCnt1d;//新增会员数
		@JSONField(name = "use_cnt_7d")
		private Integer useCnt7d;//7天核券量
		@JSONField(name = "use_user_cnt_7d")
		private Integer useUserCnt7d;//7天核券人数
		@JSONField(name = "campaign_trade_amt_7d")
		private BigDecimal campaignTradeAmt7d;//7天活动收益金额 单位：分
		@JSONField(name = "new_user_cnt_7d")
		private Integer newUserCnt7d;//7天新增会员数
		@JSONField(name = "use_cnt_30d")
		private Integer useCnt30d;//30天核券量
		@JSONField(name = "use_user_cnt_30d")
		private Integer useUserCnt30d;//30天核券人数
		@JSONField(name = "campaign_trade_amt_30d")
		private BigDecimal campaignTradeAmt30d;//30天活动收益金额 单位：分
		@JSONField(name = "new_user_cnt_30d")
		private Integer newUserCnt30d;//30天新增会员数
		@JSONField(name = "use_cnt_90d")
		private Integer useCnt90d;//90天核销量
		@JSONField(name = "use_user_cnt_90d")
		private Integer useUserCnt90d;//90天核券人数
		@JSONField(name = "campaign_trade_amt_90d")
		private BigDecimal campaignTradeAmt90d;//90天活动收益金额 单位：分
		@JSONField(name = "new_user_cnt_90d")
		private Integer newUserCnt90d;//90天新增会员数

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public String getPartnerId() {
			return partnerId;
		}

		public void setPartnerId(String partnerId) {
			this.partnerId = partnerId;
		}

		public String getActivityId() {
			return activityId;
		}

		public void setActivityId(String activityId) {
			this.activityId = activityId;
		}

		public String getCampName() {
			return campName;
		}

		public void setCampName(String campName) {
			this.campName = campName;
		}

		public String getTemplateId() {
			return templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public String getTemplateName() {
			return templateName;
		}

		public void setTemplateName(String templateName) {
			this.templateName = templateName;
		}

		public String getShopName() {
			return shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public String getShopId() {
			return shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public Integer getUseCnt1d() {
			return useCnt1d;
		}

		public void setUseCnt1d(Integer useCnt1d) {
			this.useCnt1d = useCnt1d;
		}

		public Integer getUseUserCnt1d() {
			return useUserCnt1d;
		}

		public void setUseUserCnt1d(Integer useUserCnt1d) {
			this.useUserCnt1d = useUserCnt1d;
		}

		public BigDecimal getCampaignTradeAmt1d() {
			return campaignTradeAmt1d;
		}

		public void setCampaignTradeAmt1d(BigDecimal campaignTradeAmt1d) {
			this.campaignTradeAmt1d = campaignTradeAmt1d;
		}

		public Integer getNewUserCnt1d() {
			return newUserCnt1d;
		}

		public void setNewUserCnt1d(Integer newUserCnt1d) {
			this.newUserCnt1d = newUserCnt1d;
		}

		public Integer getUseCnt7d() {
			return useCnt7d;
		}

		public void setUseCnt7d(Integer useCnt7d) {
			this.useCnt7d = useCnt7d;
		}

		public Integer getUseUserCnt7d() {
			return useUserCnt7d;
		}

		public void setUseUserCnt7d(Integer useUserCnt7d) {
			this.useUserCnt7d = useUserCnt7d;
		}

		public BigDecimal getCampaignTradeAmt7d() {
			return campaignTradeAmt7d;
		}

		public void setCampaignTradeAmt7d(BigDecimal campaignTradeAmt7d) {
			this.campaignTradeAmt7d = campaignTradeAmt7d;
		}

		public Integer getNewUserCnt7d() {
			return newUserCnt7d;
		}

		public void setNewUserCnt7d(Integer newUserCnt7d) {
			this.newUserCnt7d = newUserCnt7d;
		}

		public Integer getUseCnt30d() {
			return useCnt30d;
		}

		public void setUseCnt30d(Integer useCnt30d) {
			this.useCnt30d = useCnt30d;
		}

		public Integer getUseUserCnt30d() {
			return useUserCnt30d;
		}

		public void setUseUserCnt30d(Integer useUserCnt30d) {
			this.useUserCnt30d = useUserCnt30d;
		}

		public BigDecimal getCampaignTradeAmt30d() {
			return campaignTradeAmt30d;
		}

		public void setCampaignTradeAmt30d(BigDecimal campaignTradeAmt30d) {
			this.campaignTradeAmt30d = campaignTradeAmt30d;
		}

		public Integer getNewUserCnt30d() {
			return newUserCnt30d;
		}

		public void setNewUserCnt30d(Integer newUserCnt30d) {
			this.newUserCnt30d = newUserCnt30d;
		}

		public Integer getUseCnt90d() {
			return useCnt90d;
		}

		public void setUseCnt90d(Integer useCnt90d) {
			this.useCnt90d = useCnt90d;
		}

		public Integer getUseUserCnt90d() {
			return useUserCnt90d;
		}

		public void setUseUserCnt90d(Integer useUserCnt90d) {
			this.useUserCnt90d = useUserCnt90d;
		}

		public BigDecimal getCampaignTradeAmt90d() {
			return campaignTradeAmt90d;
		}

		public void setCampaignTradeAmt90d(BigDecimal campaignTradeAmt90d) {
			this.campaignTradeAmt90d = campaignTradeAmt90d;
		}

		public Integer getNewUserCnt90d() {
			return newUserCnt90d;
		}

		public void setNewUserCnt90d(Integer newUserCnt90d) {
			this.newUserCnt90d = newUserCnt90d;
		}
	}

}
