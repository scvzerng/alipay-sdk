package com.alipay.api.response;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.internal.mapping.DateFormatter;
import io.swagger.annotations.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * ALIPAY API: koubei.marketing.data.trade.habbit.query response.
 * 
 * @author auto create
 * @since 1.0, 2016-11-25 10:43:58
 */@ApiModel(description = " ALIPAY API: koubei.marketing.data.trade.habbit.query response.")
public class KoubeiMarketingDataTradeHabbitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5631768584823572337L;

	/** 
	 * biz_date: 业务日期  格式:yyyyMMdd
     partner_industry_type:商户行业标识（轻餐or正餐）
     shop_id: 门店id
     shop_name: 门店名称
     trade_again_ratio_7d: （近7天）复购率
     trade_again_ratio_active_7d: （近7天）复购率（口碑活跃用户）
     trade_user_cnt_7d: （近7天）交易会员数
     trade_user_cnt_active_7d: （近7天）交易活跃会员数（口碑活跃用户贡献）
     zdj_order_amt_7d: （近7天）桌单价（订单金额）(单位:分)
     zdj_service_amt_7d: （近7天）桌单价（实收金额）(单位:分)
     zdj_service_amt_distribution_7d: （近7天）桌单价（实收金额）段分布（示例：0-15:0.2799,15-20:0.1775,20-25:0.1058,25-30:0.0956,30-35:0.0648,35-40:0.0751,40-45:0.0444,45-50:0.0137,50-55:0.0171,55及以上:0.1263 意思是消费0-15元的比例占消费总人数的0.2799）
注意：出参中还包含30天/60天/90天的类似指标，篇幅有限不一一列举
	 */
	@ApiModelProperty(notes = " biz_date: 业务日期  格式:yyyyMMddpartner_industry_type:商户行业标识（轻餐or正餐）shop_id: 门店idshop_name: 门店名称trade_again_ratio_7d: （近7天）复购率trade_again_ratio_active_7d: （近7天）复购率（口碑活跃用户）trade_user_cnt_7d: （近7天）交易会员数trade_user_cnt_active_7d: （近7天）交易活跃会员数（口碑活跃用户贡献）zdj_order_amt_7d: （近7天）桌单价（订单金额）(单位:分)zdj_service_amt_7d: （近7天）桌单价（实收金额）(单位:分)zdj_service_amt_distribution_7d: （近7天）桌单价（实收金额）段分布（示例：0-15:0.2799,15-20:0.1775,20-25:0.1058,25-30:0.0956,30-35:0.0648,35-40:0.0751,40-45:0.0444,45-50:0.0137,50-55:0.0171,55及以上:0.1263 意思是消费0-15元的比例占消费总人数的0.2799）注意：出参中还包含30天/60天/90天的类似指标，篇幅有限不一一列举")

	@ApiListField("trade_habit_info")
	@ApiField("trade_habit")
	private List<TradeHabit> tradeHabitInfo;

	public List<TradeHabit> getTradeHabitInfo() {
		return tradeHabitInfo;
	}

	public void setTradeHabitInfo(List<TradeHabit> tradeHabitInfo) {
		this.tradeHabitInfo = tradeHabitInfo;
	}

	public static class TradeHabit implements Serializable {

		@ApiField("biz_date")
		@DateFormatter("yyyyMMdd")
		private Date bizDate;// 业务日期 格式:yyyyMMdd
		@ApiField("partner_industry_type")
		private String partnerIndustryType;// 商户行业标识（轻餐or正餐）
		@ApiField("shop_id")
		private String shopId;// 门店id
		@ApiField("shop_name")
		private String shopName;// 门店名称
		@ApiField("trade_again_ratio_7d")
		private Double tradeAgainRatio7d;// （近7天）复购率
		@ApiField("trade_again_ratio_active_7d")
		private Double tradeAgainRatioActive7d;// （近7天）复购率（口碑活跃用户）
		@ApiField("trade_user_cnt_7d")
		private Integer tradeUserCnt7d;// （近7天）交易会员数
		@ApiField("trade_user_cnt_active_7d")
		private Integer tradeUserCntActive7d;// （近7天）交易活跃会员数（口碑活跃用户贡献）
		@ApiField("zdj_order_amt_7d")
		private BigDecimal zdjOrderAmt7d;// （近7天）笔单价（订单金额）(单位:分)
		@ApiField("zdj_service_amt_7d")
		private BigDecimal zdjServiceAmt7d;// （近7天）笔单价（实收金额）(单位:分)
		@ApiField("zdj_service_amt_distribution_7d")
		private String zdjServiceAmtDistribution_7d;// （近7天）笔单价（实收金额）段分布（示例：0-15:0.2799,15-20:0.1775,20-25:0.1058,25-30:0.0956,30-35:0.0648,35-40:0.0751,40-45:0.0444,45-50:0.0137,50-55:0.0171,55及以上:0.1263）
		@ApiField("trade_again_ratio_30d")
		private Double tradeAgainRatio30d;// （近30天）复购率
		@ApiField("trade_again_ratio_active_30d")
		private Double tradeAgainRatioActive30d;// （近30天）复购率（口碑活跃用户）
		@ApiField("trade_user_cnt_30d")
		private Integer tradeUserCnt30d;// （近30天）交易会员数
		@ApiField("trade_user_cnt_active_30d")
		private Integer tradeUserCntActive30d;// （近30天）交易活跃会员数（口碑活跃用户贡献）
		@ApiField("zdj_order_amt_30d")
		private BigDecimal zdjOrderAmt30d;// （近30天）笔单价（订单金额）(单位:分)
		@ApiField("zdj_service_amt_30d")
		private BigDecimal zdjServiceAmt30d;// （近30天）笔单价（实收金额）(单位:分)
		@ApiField("zdj_order_amt_distribution_30d")
		private String zdjOrderAmtDistribution30d;// （近30天）笔单价（订单金额）段分布
		@ApiField("zdj_service_amt_distribution_30d")
		private String zdjServiceAmtDistribution30d;// （近30天）笔单价（实收金额）段分布
		@ApiField("trade_again_ratio_60d")
		private Double tradeAgainRatio60d;// （近60天）复购率
		@ApiField("trade_again_ratio_active_60d")
		private Double tradeAgainRatioActive60d;// （近60天）复购率（口碑活跃用户）
		@ApiField("trade_user_cnt_60d")
		private Integer tradeUserCnt60d;// （近60天）交易会员数
		@ApiField("trade_user_cnt_active_60d")
		private Integer tradeUserCntActive60d;// （近60天）交易活跃会员数（口碑活跃用户贡献）
		@ApiField("zdj_order_amt_60d")
		private BigDecimal zdjOrderAmt60d;// （近60天）笔单价（订单金额）(单位:分)
		@ApiField("zdj_service_amt_60d")
		private BigDecimal zdjServiceAmt60d;// （近60天）笔单价（实收金额）(单位:分)
		@ApiField("zdj_order_amt_distribution_60d")
		private String zdjOrderAmtDistribution60d;// （近60天）笔单价（订单金额）段分布
		@ApiField("zdj_service_amt_distribution_60d")
		private String zdjServiceAmtDistribution60d;// （近60天）笔单价（实收金额）段分布
		@ApiField("trade_again_ratio_90d")
		private Double tradeAgainRatio90d;// （近90天）复购率
		@ApiField("trade_again_ratio_active_90d")
		private Double tradeAgainRatioActive90d;// （近90天）复购率（口碑活跃用户）
		@ApiField("trade_user_cnt_90d")
		private Integer tradeUserCnt90d;// （近90天）交易会员数
		@ApiField("trade_user_cnt_active_90d")
		private Integer tradeUserCntActive90d;// （近90天）交易活跃会员数（口碑活跃用户贡献）
		@ApiField("zdj_order_amt_90d")
		private BigDecimal zdjOrderAmt90d;// （近90天）笔单价（订单金额）(单位:分)
		@ApiField("zdj_service_amt_90d")
		private BigDecimal zdjServiceAmt90d;// （近90天）笔单价（实收金额）(单位:分)
		@ApiField("zdj_order_amt_distribution_90d")
		private String zdjOrderAmtDistribution90d;// （近90天）笔单价（订单金额）段分布
		@ApiField("zdj_service_amt_distribution_90d")
		private String zdjServiceAmtDistribution90d;// （近90天）笔单价（实收金额）段分布"

		public Date getBizDate() {
			return bizDate;
		}

		public void setBizDate(Date bizDate) {
			this.bizDate = bizDate;
		}

		public String getPartnerIndustryType() {
			return partnerIndustryType;
		}

		public void setPartnerIndustryType(String partnerIndustryType) {
			this.partnerIndustryType = partnerIndustryType;
		}

		public String getShopId() {
			return shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public String getShopName() {
			return shopName;
		}

		public void setShopName(String shopName) {
			this.shopName = shopName;
		}

		public Double getTradeAgainRatio7d() {
			return tradeAgainRatio7d;
		}

		public void setTradeAgainRatio7d(Double tradeAgainRatio7d) {
			this.tradeAgainRatio7d = tradeAgainRatio7d;
		}

		public Double getTradeAgainRatioActive7d() {
			return tradeAgainRatioActive7d;
		}

		public void setTradeAgainRatioActive7d(Double tradeAgainRatioActive7d) {
			this.tradeAgainRatioActive7d = tradeAgainRatioActive7d;
		}

		public Integer getTradeUserCnt7d() {
			return tradeUserCnt7d;
		}

		public void setTradeUserCnt7d(Integer tradeUserCnt7d) {
			this.tradeUserCnt7d = tradeUserCnt7d;
		}

		public Integer getTradeUserCntActive7d() {
			return tradeUserCntActive7d;
		}

		public void setTradeUserCntActive7d(Integer tradeUserCntActive7d) {
			this.tradeUserCntActive7d = tradeUserCntActive7d;
		}

		public BigDecimal getZdjOrderAmt7d() {
			return zdjOrderAmt7d;
		}

		public void setZdjOrderAmt7d(BigDecimal zdjOrderAmt7d) {
			this.zdjOrderAmt7d = zdjOrderAmt7d;
		}

		public BigDecimal getZdjServiceAmt7d() {
			return zdjServiceAmt7d;
		}

		public void setZdjServiceAmt7d(BigDecimal zdjServiceAmt7d) {
			this.zdjServiceAmt7d = zdjServiceAmt7d;
		}

		public String getZdjServiceAmtDistribution_7d() {
			return zdjServiceAmtDistribution_7d;
		}

		public void setZdjServiceAmtDistribution_7d(String zdjServiceAmtDistribution_7d) {
			this.zdjServiceAmtDistribution_7d = zdjServiceAmtDistribution_7d;
		}

		public Double getTradeAgainRatio30d() {
			return tradeAgainRatio30d;
		}

		public void setTradeAgainRatio30d(Double tradeAgainRatio30d) {
			this.tradeAgainRatio30d = tradeAgainRatio30d;
		}

		public Double getTradeAgainRatioActive30d() {
			return tradeAgainRatioActive30d;
		}

		public void setTradeAgainRatioActive30d(Double tradeAgainRatioActive30d) {
			this.tradeAgainRatioActive30d = tradeAgainRatioActive30d;
		}

		public Integer getTradeUserCnt30d() {
			return tradeUserCnt30d;
		}

		public void setTradeUserCnt30d(Integer tradeUserCnt30d) {
			this.tradeUserCnt30d = tradeUserCnt30d;
		}

		public Integer getTradeUserCntActive30d() {
			return tradeUserCntActive30d;
		}

		public void setTradeUserCntActive30d(Integer tradeUserCntActive30d) {
			this.tradeUserCntActive30d = tradeUserCntActive30d;
		}

		public BigDecimal getZdjOrderAmt30d() {
			return zdjOrderAmt30d;
		}

		public void setZdjOrderAmt30d(BigDecimal zdjOrderAmt30d) {
			this.zdjOrderAmt30d = zdjOrderAmt30d;
		}

		public BigDecimal getZdjServiceAmt30d() {
			return zdjServiceAmt30d;
		}

		public void setZdjServiceAmt30d(BigDecimal zdjServiceAmt30d) {
			this.zdjServiceAmt30d = zdjServiceAmt30d;
		}

		public String getZdjOrderAmtDistribution30d() {
			return zdjOrderAmtDistribution30d;
		}

		public void setZdjOrderAmtDistribution30d(String zdjOrderAmtDistribution30d) {
			this.zdjOrderAmtDistribution30d = zdjOrderAmtDistribution30d;
		}

		public String getZdjServiceAmtDistribution30d() {
			return zdjServiceAmtDistribution30d;
		}

		public void setZdjServiceAmtDistribution30d(String zdjServiceAmtDistribution30d) {
			this.zdjServiceAmtDistribution30d = zdjServiceAmtDistribution30d;
		}

		public Double getTradeAgainRatio60d() {
			return tradeAgainRatio60d;
		}

		public void setTradeAgainRatio60d(Double tradeAgainRatio60d) {
			this.tradeAgainRatio60d = tradeAgainRatio60d;
		}

		public Double getTradeAgainRatioActive60d() {
			return tradeAgainRatioActive60d;
		}

		public void setTradeAgainRatioActive60d(Double tradeAgainRatioActive60d) {
			this.tradeAgainRatioActive60d = tradeAgainRatioActive60d;
		}

		public Integer getTradeUserCnt60d() {
			return tradeUserCnt60d;
		}

		public void setTradeUserCnt60d(Integer tradeUserCnt60d) {
			this.tradeUserCnt60d = tradeUserCnt60d;
		}

		public Integer getTradeUserCntActive60d() {
			return tradeUserCntActive60d;
		}

		public void setTradeUserCntActive60d(Integer tradeUserCntActive60d) {
			this.tradeUserCntActive60d = tradeUserCntActive60d;
		}

		public BigDecimal getZdjOrderAmt60d() {
			return zdjOrderAmt60d;
		}

		public void setZdjOrderAmt60d(BigDecimal zdjOrderAmt60d) {
			this.zdjOrderAmt60d = zdjOrderAmt60d;
		}

		public BigDecimal getZdjServiceAmt60d() {
			return zdjServiceAmt60d;
		}

		public void setZdjServiceAmt60d(BigDecimal zdjServiceAmt60d) {
			this.zdjServiceAmt60d = zdjServiceAmt60d;
		}

		public String getZdjOrderAmtDistribution60d() {
			return zdjOrderAmtDistribution60d;
		}

		public void setZdjOrderAmtDistribution60d(String zdjOrderAmtDistribution60d) {
			this.zdjOrderAmtDistribution60d = zdjOrderAmtDistribution60d;
		}

		public String getZdjServiceAmtDistribution60d() {
			return zdjServiceAmtDistribution60d;
		}

		public void setZdjServiceAmtDistribution60d(String zdjServiceAmtDistribution60d) {
			this.zdjServiceAmtDistribution60d = zdjServiceAmtDistribution60d;
		}

		public Double getTradeAgainRatio90d() {
			return tradeAgainRatio90d;
		}

		public void setTradeAgainRatio90d(Double tradeAgainRatio90d) {
			this.tradeAgainRatio90d = tradeAgainRatio90d;
		}

		public Double getTradeAgainRatioActive90d() {
			return tradeAgainRatioActive90d;
		}

		public void setTradeAgainRatioActive90d(Double tradeAgainRatioActive90d) {
			this.tradeAgainRatioActive90d = tradeAgainRatioActive90d;
		}

		public Integer getTradeUserCnt90d() {
			return tradeUserCnt90d;
		}

		public void setTradeUserCnt90d(Integer tradeUserCnt90d) {
			this.tradeUserCnt90d = tradeUserCnt90d;
		}

		public Integer getTradeUserCntActive90d() {
			return tradeUserCntActive90d;
		}

		public void setTradeUserCntActive90d(Integer tradeUserCntActive90d) {
			this.tradeUserCntActive90d = tradeUserCntActive90d;
		}

		public BigDecimal getZdjOrderAmt90d() {
			return zdjOrderAmt90d;
		}

		public void setZdjOrderAmt90d(BigDecimal zdjOrderAmt90d) {
			this.zdjOrderAmt90d = zdjOrderAmt90d;
		}

		public BigDecimal getZdjServiceAmt90d() {
			return zdjServiceAmt90d;
		}

		public void setZdjServiceAmt90d(BigDecimal zdjServiceAmt90d) {
			this.zdjServiceAmt90d = zdjServiceAmt90d;
		}

		public String getZdjOrderAmtDistribution90d() {
			return zdjOrderAmtDistribution90d;
		}

		public void setZdjOrderAmtDistribution90d(String zdjOrderAmtDistribution90d) {
			this.zdjOrderAmtDistribution90d = zdjOrderAmtDistribution90d;
		}

		public String getZdjServiceAmtDistribution90d() {
			return zdjServiceAmtDistribution90d;
		}

		public void setZdjServiceAmtDistribution90d(String zdjServiceAmtDistribution90d) {
			this.zdjServiceAmtDistribution90d = zdjServiceAmtDistribution90d;
		}
	}
}
