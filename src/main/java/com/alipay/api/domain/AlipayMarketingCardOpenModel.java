package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * 会员卡开卡接口
 *
 * @author auto create
 * @since 1.0, 2016-12-22 10:41:08
 */
@ApiModel(description = " 会员卡开卡接口")
public class AlipayMarketingCardOpenModel extends AlipayObject {

	private static final long serialVersionUID = 7819484837413156843L;

	/**
	 * 外部卡信息(biz_card_no无需填写)
	 */
	@ApiModelProperty(notes = " 外部卡信息(biz_card_no无需填写)")
	@JSONField(alternateNames = "cardExtInfo", name = "card_ext_info")
	private MerchantCard cardExtInfo;

	/**
	 * 支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）
	 */
	@ApiModelProperty(notes = " 支付宝分配的卡模板Id（卡模板创建接口返回的模板ID）")
	@JSONField(alternateNames = "cardTemplateId", name = "card_template_id")
	@NotNull
	private String cardTemplateId;

	/**
	 * 发卡用户信息
	 */
	@ApiModelProperty(notes = " 发卡用户信息")
	@JSONField(alternateNames = "cardUserInfo", name = "card_user_info")
	private CardUserInfo cardUserInfo;

	/**
	 * 商户会员信息
	 */
	@ApiModelProperty(notes = " 商户会员信息")
	@JSONField(alternateNames = "memberExtInfo", name = "member_ext_info")
	private MerchantMenber memberExtInfo;

	/**
	 * 外部商户流水号（商户需要确保唯一性控制，类似request_id唯一请求标识）
	 */
	@ApiModelProperty(notes = " 外部商户流水号（商户需要确保唯一性控制，类似request_id唯一请求标识）")
	@JSONField(alternateNames = "outSerialNo", name = "out_serial_no")
	@NotNull
	private String outSerialNo;

	public MerchantCard getCardExtInfo() {
		return this.cardExtInfo;
	}
	public void setCardExtInfo(MerchantCard cardExtInfo) {
		this.cardExtInfo = cardExtInfo;
	}

	public String getCardTemplateId() {
		return this.cardTemplateId;
	}
	public void setCardTemplateId(String cardTemplateId) {
		this.cardTemplateId = cardTemplateId;
	}

	public CardUserInfo getCardUserInfo() {
		return this.cardUserInfo;
	}
	public void setCardUserInfo(CardUserInfo cardUserInfo) {
		this.cardUserInfo = cardUserInfo;
	}

	public MerchantMenber getMemberExtInfo() {
		return this.memberExtInfo;
	}
	public void setMemberExtInfo(MerchantMenber memberExtInfo) {
		this.memberExtInfo = memberExtInfo;
	}

	public String getOutSerialNo() {
		return this.outSerialNo;
	}
	public void setOutSerialNo(String outSerialNo) {
		this.outSerialNo = outSerialNo;
	}

}
