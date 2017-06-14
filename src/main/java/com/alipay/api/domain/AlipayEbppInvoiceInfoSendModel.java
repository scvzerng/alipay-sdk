package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票信息发送至用户支付宝
 *
 * @author auto create
 * @since 1.0, 2017-01-23 17:05:47
 */
public class AlipayEbppInvoiceInfoSendModel extends AlipayObject {

	private static final long serialVersionUID = 7238392821956942945L;

	/**
	 * 同步发票信息模型
	 */
	@ApiField("invoice_info")
	private InvoiceModelContent invoiceInfo;

	/**
	 * 商户的品牌名称简称,该字段需要接入前向发票管家申请，
m_short_name+sub_m_short_name具有唯一约束
如：肯德基：KFC
	 */
	@ApiField("m_short_name")
	private String mShortName;

	/**
	 * 支付宝为商户分配的商户门店简称，该字段需要接入前在发票管家申请
如：肯德基-杭州西湖区文一西路店：KFC_HZ_XH001
	 */
	@ApiField("sub_m_short_name")
	private String subMShortName;

	public InvoiceModelContent getInvoiceInfo() {
		return this.invoiceInfo;
	}
	public void setInvoiceInfo(InvoiceModelContent invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}

	public String getmShortName() {
		return this.mShortName;
	}
	public void setmShortName(String mShortName) {
		this.mShortName = mShortName;
	}

	public String getSubMShortName() {
		return this.subMShortName;
	}
	public void setSubMShortName(String subMShortName) {
		this.subMShortName = subMShortName;
	}

}
