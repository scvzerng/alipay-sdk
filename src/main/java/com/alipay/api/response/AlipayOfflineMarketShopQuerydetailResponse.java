package com.alipay.api.response;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.*;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import io.swagger.annotations.*;

/**
 * ALIPAY API: alipay.offline.market.shop.querydetail response.
 * 
 * @author auto create
 * @since 1.0, 2017-04-07 18:26:36
 */@ApiModel(description = " ALIPAY API: alipay.offline.market.shop.querydetail response.")
public class AlipayOfflineMarketShopQuerydetailResponse extends AlipayResponse {

	private static final long serialVersionUID = 1811232319953588488L;

	/** 
	 * 门店详细地址，注：不含省市区
	 */@ApiModelProperty(notes = " 门店详细地址，注：不含省市区")
	private String address;

	/** 
	 * 门店审核状态描述，如果审核驳回则有相关的驳回理由
	 */@JSONField(name = "audit_desc", alternateNames = "auditDesc")@ApiModelProperty(notes = " 门店审核状态描述，如果审核驳回则有相关的驳回理由")
	private String auditDesc;

	/** 
	 * 门店审核时需要的图片; 至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过， 多个以英文逗号分隔
	 */@JSONField(name = "audit_images", alternateNames = "auditImages")@ApiModelProperty(notes = " 门店审核时需要的图片; 至少包含一张门头照片，两张内景照片，必须反映真实的门店情况，审核才能够通过， 多个以英文逗号分隔")
	private String auditImages;

	/** 
	 * 门店审核状态，对于系统商而言，只有三个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过。第一次审核通过会触发门店上架。
	 */@JSONField(name = "audit_status", alternateNames = "auditStatus")@ApiModelProperty(notes = " 门店审核状态，对于系统商而言，只有三个状态，AUDITING：审核中，AUDIT_FAILED：审核驳回，AUDIT_SUCCESS：审核通过。第一次审核通过会触发门店上架。")
	private String auditStatus;

	/** 
	 * 授权函图片
	 */@JSONField(name = "auth_letter", alternateNames = "authLetter")@ApiModelProperty(notes = " 授权函图片")
	private String authLetter;

	/** 
	 * 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元；
	 */@JSONField(name = "avg_price", alternateNames = "avgPrice")@ApiModelProperty(notes = " 人均消费价格，最少1元，最大不超过99999元，请按实际情况填写；单位元；")
	private String avgPrice;

	/** 
	 * 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示
	 */@ApiModelProperty(notes = " 门店是否有包厢，T表示有，F表示没有，不传在客户端不作展示")
	private String box;

	/** 
	 * 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)
	 */@JSONField(name = "branch_shop_name", alternateNames = "branchShopName")@ApiModelProperty(notes = " 分店名称，比如：万塘路店，与主门店名合并在客户端显示为：肯德基(万塘路店)")
	private String branchShopName;

	/** 
	 * 品牌LOGO; 图片ID，不填写则默认为门店首图main_image
	 */@JSONField(name = "brand_logo", alternateNames = "brandLogo")@ApiModelProperty(notes = " 品牌LOGO; 图片ID，不填写则默认为门店首图main_image")
	private String brandLogo;

	/** 
	 * 品牌名称；不填写则默认为“其它品牌”
	 */@JSONField(name = "brand_name", alternateNames = "brandName")@ApiModelProperty(notes = " 品牌名称；不填写则默认为“其它品牌”")
	private String brandName;

	/** 
	 * 经营许可证，只有餐饮类目需要
	 */@JSONField(name = "business_certificate", alternateNames = "businessCertificate")@ApiModelProperty(notes = " 经营许可证，只有餐饮类目需要")
	private String businessCertificate;

	/** 
	 * 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要
	 */@JSONField(name = "business_certificate_expires", alternateNames = "businessCertificateExpires")@ApiModelProperty(notes = " 经营许可证有效期，格式：2020-03-20，只有餐饮类目需要")
	private String businessCertificateExpires;

	/** 
	 * 营业时间;支持分段营业时间，以英文逗号分隔
	 */@JSONField(name = "business_time", alternateNames = "businessTime")@ApiModelProperty(notes = " 营业时间;支持分段营业时间，以英文逗号分隔")
	private String businessTime;

	/** 
	 * 类目ID，类目初始数据由口碑提供
	 */@JSONField(name = "category_id", alternateNames = "categoryId")@ApiModelProperty(notes = " 类目ID，类目初始数据由口碑提供")
	private String categoryId;

	/** 
	 * 城市编码，国标码，详见国家统计局数据
	 */@JSONField(name = "city_code", alternateNames = "cityCode")@ApiModelProperty(notes = " 城市编码，国标码，详见国家统计局数据")
	private String cityCode;

	/** 
	 * 门店电话号码；支持座机和手机，在客户端对用户展现，支持多个电话，以英文逗号分隔
	 */@JSONField(name = "contact_number", alternateNames = "contactNumber")@ApiModelProperty(notes = " 门店电话号码；支持座机和手机，在客户端对用户展现，支持多个电话，以英文逗号分隔")
	private String contactNumber;

	/** 
	 * 门店创建来源；如：开放平台、支付宝客户端、口碑商家app、商家自主开店、服务商开店、全民开店-支付宝客户端、全民开店-商户app、其它
	 */@JSONField(name = "create_channel", alternateNames = "createChannel")@ApiModelProperty(notes = " 门店创建来源；如：开放平台、支付宝客户端、口碑商家app、商家自主开店、服务商开店、全民开店-支付宝客户端、全民开店-商户app、其它")
	private String createChannel;

	/** 
	 * 区县编码，国标码，详见国家统计局数据
	 */@JSONField(name = "district_code", alternateNames = "districtCode")@ApiModelProperty(notes = " 区县编码，国标码，详见国家统计局数据")
	private String districtCode;

	/** 
	 * 门店创建时间
	 */@JSONField(name = "gmt_shop_create", alternateNames = "gmtShopCreate")@ApiModelProperty(notes = " 门店创建时间")
	private String gmtShopCreate;

	/** 
	 * 门店修改时间
	 */@JSONField(name = "gmt_shop_modified", alternateNames = "gmtShopModified")@ApiModelProperty(notes = " 门店修改时间")
	private String gmtShopModified;

	/** 
	 * 店铺使用的机具编号，多个以英文逗号分隔
	 */@JSONField(name = "implement_id", alternateNames = "implementId")@ApiModelProperty(notes = " 店铺使用的机具编号，多个以英文逗号分隔")
	private String implementId;

	/** 
	 * 门店是否上架，T表示上架,F表示未上架，第一次门店审核通过后会触发上架
	 */@JSONField(name = "is_online", alternateNames = "isOnline")@ApiModelProperty(notes = " 门店是否上架，T表示上架,F表示未上架，第一次门店审核通过后会触发上架")
	private String isOnline;

	/** 
	 * 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质
	 */@JSONField(name = "is_operating_online", alternateNames = "isOperatingOnline")@ApiModelProperty(notes = " 是否在其他平台开店，T表示有开店，F表示未开店，用于证明其开店资质")
	private String isOperatingOnline;

	/** 
	 * 门店是否在客户端显示，T表示显示，F表示隐藏
	 */@JSONField(name = "is_show", alternateNames = "isShow")@ApiModelProperty(notes = " 门店是否在客户端显示，T表示显示，F表示隐藏")
	private String isShow;

	/** 
	 * 开发者返佣ID，重要：如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据，需要与签约协议的PID保持一致， 该字段只能在创建接口中传入，不能在修改接口中被修改
	 */@JSONField(name = "isv_uid", alternateNames = "isvUid")@ApiModelProperty(notes = " 开发者返佣ID，重要：如果有口碑签订了返佣协议，则该字段作为返佣数据提取的依据，需要与签约协议的PID保持一致， 该字段只能在创建接口中传入，不能在修改接口中被修改")
	private String isvUid;

	/** 
	 * 纬度，最长15位字符（包括小数点）， 注：高德坐标系
	 */@ApiModelProperty(notes = " 纬度，最长15位字符（包括小数点）， 注：高德坐标系")
	private String latitude;

	/** 
	 * 门店营业执照图片
	 */@ApiModelProperty(notes = " 门店营业执照图片")
	private String licence;

	/** 
	 * 门店营业执照编号
	 */@JSONField(name = "licence_code", alternateNames = "licenceCode")@ApiModelProperty(notes = " 门店营业执照编号")
	private String licenceCode;

	/** 
	 * 营业执照过期时间
	 */@JSONField(name = "licence_expires", alternateNames = "licenceExpires")@ApiModelProperty(notes = " 营业执照过期时间")
	private String licenceExpires;

	/** 
	 * 门店营业执照名称
	 */@JSONField(name = "licence_name", alternateNames = "licenceName")@ApiModelProperty(notes = " 门店营业执照名称")
	private String licenceName;

	/** 
	 * 经度，最长15位字符（包括小数点）， 注：高德坐标系
	 */@ApiModelProperty(notes = " 经度，最长15位字符（包括小数点）， 注：高德坐标系")
	private String longitude;

	/** 
	 * 门店首图；非常重要，推荐尺寸2000*1500
	 */@JSONField(name = "main_image", alternateNames = "mainImage")@ApiModelProperty(notes = " 门店首图；非常重要，推荐尺寸2000*1500")
	private String mainImage;

	/** 
	 * 主店名；比如：肯德基
	 */@JSONField(name = "main_shop_name", alternateNames = "mainShopName")@ApiModelProperty(notes = " 主店名；比如：肯德基")
	private String mainShopName;

	/** 
	 * 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示
	 */@JSONField(name = "no_smoking", alternateNames = "noSmoking")@ApiModelProperty(notes = " 是否有无烟区，T表示有无烟区，F表示没有无烟区，不传在客户端不展示")
	private String noSmoking;

	/** 
	 * 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息，不在客户端展示；多个以引文逗号分隔
	 */@JSONField(name = "notify_mobile", alternateNames = "notifyMobile")@ApiModelProperty(notes = " 门店店长电话号码；用于接收门店状态变更通知，收款成功通知等通知消息，不在客户端展示；多个以引文逗号分隔")
	private String notifyMobile;

	/** 
	 * 在其他平台的开店图片，支持多张，逗号分隔
	 */@JSONField(name = "online_image", alternateNames = "onlineImage")@ApiModelProperty(notes = " 在其他平台的开店图片，支持多张，逗号分隔")
	private String onlineImage;

	/** 
	 * 通知发送url;当商户的门店审核状态发生变化时，会向该地址推送消息
	 */@JSONField(name = "operate_notify_url", alternateNames = "operateNotifyUrl")@ApiModelProperty(notes = " 通知发送url;当商户的门店审核状态发生变化时，会向该地址推送消息")
	private String operateNotifyUrl;

	/** 
	 * 其它资质证明图片集；支持多张，逗号分隔
	 */@JSONField(name = "other_auth_images", alternateNames = "otherAuthImages")@ApiModelProperty(notes = " 其它资质证明图片集；支持多张，逗号分隔")
	private String otherAuthImages;

	/** 
	 * 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示
	 */@ApiModelProperty(notes = " 门店是否支持停车，T表示支持，F表示不支持，不传在客户端不作展示")
	private String parking;

	/** 
	 * 门店的签约ID
	 */@JSONField(name = "partner_id", alternateNames = "partnerId")@ApiModelProperty(notes = " 门店的签约ID")
	private String partnerId;

	/** 
	 * 默认付款类型；如：付款码、扫码付、声波支付、在线买单、其它
	 */@JSONField(name = "pay_type", alternateNames = "payType")@ApiModelProperty(notes = " 默认付款类型；如：付款码、扫码付、声波支付、在线买单、其它")
	private String payType;

	/** 
	 * 门店收款账户，门店收款账户只能被查询，不能通过接口修改。如果为空，则表示门店收款账户为商户签约账户
	 */@JSONField(name = "payment_account", alternateNames = "paymentAccount")@ApiModelProperty(notes = " 门店收款账户，门店收款账户只能被查询，不能通过接口修改。如果为空，则表示门店收款账户为商户签约账户")
	private String paymentAccount;

	/** 
	 * 图片集，是map转化成的json串，key是图片id,value是图片url
	 */@JSONField(name = "pic_coll", alternateNames = "picColl")@ApiModelProperty(notes = " 图片集，是map转化成的json串，key是图片id,value是图片url")
	private JSONObject picColl;

	/** 
	 * 经过加工后的门店收款二维码
	 */@JSONField(name = "processed_qr_code", alternateNames = "processedQrCode")@ApiModelProperty(notes = " 经过加工后的门店收款二维码")
	private String processedQrCode;

	/** 
	 * 门店运营归属人uid
	 */@JSONField(name = "provider_xiaoer_uid", alternateNames = "providerXiaoerUid")@ApiModelProperty(notes = " 门店运营归属人uid")
	private String providerXiaoerUid;

	/** 
	 * 省份编码，国标码，详见国家统计局数据
	 */@JSONField(name = "province_code", alternateNames = "provinceCode")@ApiModelProperty(notes = " 省份编码，国标码，详见国家统计局数据")
	private String provinceCode;

	/** 
	 * 门店收款二维码裸码
	 */@JSONField(name = "qr_code", alternateNames = "qrCode")@ApiModelProperty(notes = " 门店收款二维码裸码")
	private String qrCode;

	/** 
	 * 门店标签；JSON格式。包括：keyMerchant-是否重点商户（T/F）；isHallMeal-堂食（T/F）；注：若标签 key 不存在，则门店无对应的标签
	 */@JSONField(name = "shop_tags", alternateNames = "shopTags")@ApiModelProperty(notes = " 门店标签；JSON格式。包括：keyMerchant-是否重点商户（T/F）；isHallMeal-堂食（T/F）；注：若标签 key 不存在，则门店无对应的标签")
	private JSONObject shopTags;

	/** 
	 * 外部门店编号；最长54位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性
	 */@JSONField(name = "store_id", alternateNames = "storeId")@ApiModelProperty(notes = " 外部门店编号；最长54位字符，该编号将作为收单接口的入参， 请开发者自行确保其唯一性")
	private String storeId;

	/** 
	 * 门店其他的服务，门店与用户线下兑现
	 */@JSONField(name = "value_added", alternateNames = "valueAdded")@ApiModelProperty(notes = " 门店其他的服务，门店与用户线下兑现")
	private String valueAdded;

	/** 
	 * 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示
	 */@ApiModelProperty(notes = " 门店是否支持WIFI，T表示支持，F表示不支持，不传在客户端不作展示")
	private String wifi;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setAuditDesc(String auditDesc) {
		this.auditDesc = auditDesc;
	}
	public String getAuditDesc( ) {
		return this.auditDesc;
	}

	public void setAuditImages(String auditImages) {
		this.auditImages = auditImages;
	}
	public String getAuditImages( ) {
		return this.auditImages;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getAuditStatus( ) {
		return this.auditStatus;
	}

	public void setAuthLetter(String authLetter) {
		this.authLetter = authLetter;
	}
	public String getAuthLetter( ) {
		return this.authLetter;
	}

	public void setAvgPrice(String avgPrice) {
		this.avgPrice = avgPrice;
	}
	public String getAvgPrice( ) {
		return this.avgPrice;
	}

	public void setBox(String box) {
		this.box = box;
	}
	public String getBox( ) {
		return this.box;
	}

	public void setBranchShopName(String branchShopName) {
		this.branchShopName = branchShopName;
	}
	public String getBranchShopName( ) {
		return this.branchShopName;
	}

	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}
	public String getBrandLogo( ) {
		return this.brandLogo;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandName( ) {
		return this.brandName;
	}

	public void setBusinessCertificate(String businessCertificate) {
		this.businessCertificate = businessCertificate;
	}
	public String getBusinessCertificate( ) {
		return this.businessCertificate;
	}

	public void setBusinessCertificateExpires(String businessCertificateExpires) {
		this.businessCertificateExpires = businessCertificateExpires;
	}
	public String getBusinessCertificateExpires( ) {
		return this.businessCertificateExpires;
	}

	public void setBusinessTime(String businessTime) {
		this.businessTime = businessTime;
	}
	public String getBusinessTime( ) {
		return this.businessTime;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryId( ) {
		return this.categoryId;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getCityCode( ) {
		return this.cityCode;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getContactNumber( ) {
		return this.contactNumber;
	}

	public void setCreateChannel(String createChannel) {
		this.createChannel = createChannel;
	}
	public String getCreateChannel( ) {
		return this.createChannel;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictCode( ) {
		return this.districtCode;
	}

	public void setGmtShopCreate(String gmtShopCreate) {
		this.gmtShopCreate = gmtShopCreate;
	}
	public String getGmtShopCreate( ) {
		return this.gmtShopCreate;
	}

	public void setGmtShopModified(String gmtShopModified) {
		this.gmtShopModified = gmtShopModified;
	}
	public String getGmtShopModified( ) {
		return this.gmtShopModified;
	}

	public void setImplementId(String implementId) {
		this.implementId = implementId;
	}
	public String getImplementId( ) {
		return this.implementId;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	public String getIsOnline( ) {
		return this.isOnline;
	}

	public void setIsOperatingOnline(String isOperatingOnline) {
		this.isOperatingOnline = isOperatingOnline;
	}
	public String getIsOperatingOnline( ) {
		return this.isOperatingOnline;
	}

	public void setIsShow(String isShow) {
		this.isShow = isShow;
	}
	public String getIsShow( ) {
		return this.isShow;
	}

	public void setIsvUid(String isvUid) {
		this.isvUid = isvUid;
	}
	public String getIsvUid( ) {
		return this.isvUid;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLatitude( ) {
		return this.latitude;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}
	public String getLicence( ) {
		return this.licence;
	}

	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}
	public String getLicenceCode( ) {
		return this.licenceCode;
	}

	public void setLicenceExpires(String licenceExpires) {
		this.licenceExpires = licenceExpires;
	}
	public String getLicenceExpires( ) {
		return this.licenceExpires;
	}

	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}
	public String getLicenceName( ) {
		return this.licenceName;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getLongitude( ) {
		return this.longitude;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}
	public String getMainImage( ) {
		return this.mainImage;
	}

	public void setMainShopName(String mainShopName) {
		this.mainShopName = mainShopName;
	}
	public String getMainShopName( ) {
		return this.mainShopName;
	}

	public void setNoSmoking(String noSmoking) {
		this.noSmoking = noSmoking;
	}
	public String getNoSmoking( ) {
		return this.noSmoking;
	}

	public void setNotifyMobile(String notifyMobile) {
		this.notifyMobile = notifyMobile;
	}
	public String getNotifyMobile( ) {
		return this.notifyMobile;
	}

	public void setOnlineImage(String onlineImage) {
		this.onlineImage = onlineImage;
	}
	public String getOnlineImage( ) {
		return this.onlineImage;
	}

	public void setOperateNotifyUrl(String operateNotifyUrl) {
		this.operateNotifyUrl = operateNotifyUrl;
	}
	public String getOperateNotifyUrl( ) {
		return this.operateNotifyUrl;
	}

	public void setOtherAuthImages(String otherAuthImages) {
		this.otherAuthImages = otherAuthImages;
	}
	public String getOtherAuthImages( ) {
		return this.otherAuthImages;
	}

	public void setParking(String parking) {
		this.parking = parking;
	}
	public String getParking( ) {
		return this.parking;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getPayType( ) {
		return this.payType;
	}

	public void setPaymentAccount(String paymentAccount) {
		this.paymentAccount = paymentAccount;
	}
	public String getPaymentAccount( ) {
		return this.paymentAccount;
	}

	public void setPicColl(JSONObject picColl) {
		this.picColl = picColl;
	}
	public JSONObject getPicColl( ) {
		return this.picColl;
	}

	public void setProcessedQrCode(String processedQrCode) {
		this.processedQrCode = processedQrCode;
	}
	public String getProcessedQrCode( ) {
		return this.processedQrCode;
	}

	public void setProviderXiaoerUid(String providerXiaoerUid) {
		this.providerXiaoerUid = providerXiaoerUid;
	}
	public String getProviderXiaoerUid( ) {
		return this.providerXiaoerUid;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getProvinceCode( ) {
		return this.provinceCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getQrCode( ) {
		return this.qrCode;
	}

	public void setShopTags(JSONObject shopTags) {
		this.shopTags = shopTags;
	}
	public JSONObject getShopTags( ) {
		return this.shopTags;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreId( ) {
		return this.storeId;
	}

	public void setValueAdded(String valueAdded) {
		this.valueAdded = valueAdded;
	}
	public String getValueAdded( ) {
		return this.valueAdded;
	}

	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getWifi( ) {
		return this.wifi;
	}

}
