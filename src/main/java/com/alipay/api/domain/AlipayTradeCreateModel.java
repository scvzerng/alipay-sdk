package com.alipay.api.domain;

import java.util.List;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 商户通过该接口进行交易的创建下单
 *
 * @author auto create
 * @since 1.0, 2017-02-15 14:03:28
 */@ApiModel(description = " 商户通过该接口进行交易的创建下单")
public class AlipayTradeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1655755412479691326L;

	/**
	 * 支付宝的店铺编号
	 */@JSONField(name = "alipay_store_id", alternateNames = "alipayStoreId")@ApiModelProperty(notes = " 支付宝的店铺编号")
	private String alipayStoreId;

	/**
	 * 对交易或商品的描述
	 */@ApiModelProperty(notes = " 对交易或商品的描述")
	private String body;

	/**
	 * 买家的支付宝唯一用户号（2088开头的16位纯数字）,和buyer_logon_id不能同时为空
	 */@JSONField(name = "buyer_id", alternateNames = "buyerId")@ApiModelProperty(notes = " 买家的支付宝唯一用户号（2088开头的16位纯数字）,和buyer_logon_id不能同时为空")
	private String buyerId;

	/**
	 * 买家支付宝账号，和buyer_id不能同时为空
	 */@JSONField(name = "buyer_logon_id", alternateNames = "buyerLogonId")@ApiModelProperty(notes = " 买家支付宝账号，和buyer_id不能同时为空")
	private String buyerLogonId;

	/**
	 * 禁用渠道,用户不可用指定渠道支付
注，与enable_pay_channels互斥
	 */@JSONField(name = "disable_pay_channels", alternateNames = "disablePayChannels")@ApiModelProperty(notes = " 禁用渠道,用户不可用指定渠道支付注，与enable_pay_channels互斥")
	private String disablePayChannels;

	/**
	 * 可打折金额.
参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果该值未传入，但传入了【订单总金额】，【不可打折金额】则该值默认为【订单总金额】-【不可打折金额】
	 */@JSONField(name = "discountable_amount", alternateNames = "discountableAmount")@ApiModelProperty(notes = " 可打折金额.参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]如果该值未传入，但传入了【订单总金额】，【不可打折金额】则该值默认为【订单总金额】-【不可打折金额】")
	private String discountableAmount;

	/**
	 * 可用渠道,用户只能在指定渠道范围内支付
注，与disable_pay_channels互斥
	 */@JSONField(name = "enable_pay_channels", alternateNames = "enablePayChannels")@ApiModelProperty(notes = " 可用渠道,用户只能在指定渠道范围内支付注，与disable_pay_channels互斥")
	private String enablePayChannels;

	/**
	 * 业务扩展参数
	 */@JSONField(name = "extend_params", alternateNames = "extendParams")@ApiModelProperty(notes = " 业务扩展参数")
	private ExtendParams extendParams;

	/**
	 * 订单包含的商品列表信息.Json格式.
其它说明详见：“商品明细说明”
	 */@JSONField(name = "goods_detail", alternateNames = "goodsDetail")@ApiModelProperty(notes = " 订单包含的商品列表信息.Json格式.其它说明详见：“商品明细说明”")
	private List<GoodsDetail> goodsDetail;

	/**
	 * 商户原始订单号，最大长度限制32位
	 */@JSONField(name = "merchant_order_no", alternateNames = "merchantOrderNo")@ApiModelProperty(notes = " 商户原始订单号，最大长度限制32位")
	private String merchantOrderNo;

	/**
	 * 商户操作员编号
	 */@JSONField(name = "operator_id", alternateNames = "operatorId")@ApiModelProperty(notes = " 商户操作员编号")
	private String operatorId;

	/**
	 * 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复
	 */@JSONField(name = "out_trade_no", alternateNames = "outTradeNo")@ApiModelProperty(notes = " 商户订单号,64个字符以内、只能包含字母、数字、下划线；需保证在商户端不重复")
	@NotNull(message = "商户订单号不能为空")
	private String outTradeNo;

	/**
	 * 描述分账信息，json格式。
	 */@JSONField(name = "royalty_info", alternateNames = "royaltyInfo")@ApiModelProperty(notes = " 描述分账信息，json格式。")
	private RoyaltyInfo royaltyInfo;

	/**
	 * 卖家支付宝用户ID。
如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */@JSONField(name = "seller_id", alternateNames = "sellerId")@ApiModelProperty(notes = " 卖家支付宝用户ID。如果该值为空，则默认为商户签约账号对应的支付宝用户ID")
	private String sellerId;

	/**
	 * 商户门店编号
	 */@JSONField(name = "store_id", alternateNames = "storeId")@ApiModelProperty(notes = " 商户门店编号")
	private String storeId;

	/**
	 * 二级商户信息,当前只对特殊银行机构特定场景下使用此字段
	 */@JSONField(name = "sub_merchant", alternateNames = "subMerchant")@ApiModelProperty(notes = " 二级商户信息,当前只对特殊银行机构特定场景下使用此字段")
	private SubMerchant subMerchant;

	/**
	 * 订单标题
	 */@ApiModelProperty(notes = " 订单标题")
	@NotNull(message = "订单标题不能为空")
	private String subject;

	/**
	 * 商户机具终端编号
	 */@JSONField(name = "terminal_id", alternateNames = "terminalId")@ApiModelProperty(notes = " 商户机具终端编号")
	private String terminalId;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
	 */@JSONField(name = "timeout_express", alternateNames = "timeoutExpress")@ApiModelProperty(notes = " 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m。")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】
	 */@JSONField(name = "total_amount", alternateNames = "totalAmount")@ApiModelProperty(notes = " 订单总金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]如果同时传入了【打折金额】，【不可打折金额】，【订单总金额】三者，则必须满足如下条件：【订单总金额】=【打折金额】+【不可打折金额】")
	@NotNull(message = "订单总金额不能为空")
	private String totalAmount;

	/**
	 * 不可打折金额.
不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
如果该值未传入，但传入了【订单总金额】,【打折金额】，则该值默认为【订单总金额】-【打折金额】
	 */@JSONField(name = "undiscountable_amount", alternateNames = "undiscountableAmount")@ApiModelProperty(notes = " 不可打折金额.不参与优惠计算的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]如果该值未传入，但传入了【订单总金额】,【打折金额】，则该值默认为【订单总金额】-【打折金额】")
	private String undiscountableAmount;

	public String getAlipayStoreId() {
		return this.alipayStoreId;
	}
	public void setAlipayStoreId(String alipayStoreId) {
		this.alipayStoreId = alipayStoreId;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerLogonId() {
		return this.buyerLogonId;
	}
	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}

	public String getDisablePayChannels() {
		return this.disablePayChannels;
	}
	public void setDisablePayChannels(String disablePayChannels) {
		this.disablePayChannels = disablePayChannels;
	}

	public String getDiscountableAmount() {
		return this.discountableAmount;
	}
	public void setDiscountableAmount(String discountableAmount) {
		this.discountableAmount = discountableAmount;
	}

	public String getEnablePayChannels() {
		return this.enablePayChannels;
	}
	public void setEnablePayChannels(String enablePayChannels) {
		this.enablePayChannels = enablePayChannels;
	}

	public ExtendParams getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(ExtendParams extendParams) {
		this.extendParams = extendParams;
	}

	public List<GoodsDetail> getGoodsDetail() {
		return this.goodsDetail;
	}
	public void setGoodsDetail(List<GoodsDetail> goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public RoyaltyInfo getRoyaltyInfo() {
		return this.royaltyInfo;
	}
	public void setRoyaltyInfo(RoyaltyInfo royaltyInfo) {
		this.royaltyInfo = royaltyInfo;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public SubMerchant getSubMerchant() {
		return this.subMerchant;
	}
	public void setSubMerchant(SubMerchant subMerchant) {
		this.subMerchant = subMerchant;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTerminalId() {
		return this.terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getUndiscountableAmount() {
		return this.undiscountableAmount;
	}
	public void setUndiscountableAmount(String undiscountableAmount) {
		this.undiscountableAmount = undiscountableAmount;
	}

}
