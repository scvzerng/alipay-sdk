package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayFundTransToaccResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.fund.trans.toacc request
 * 
 * @author auto create
 * @since 1.0, 2016-07-08 17:24:11
 */
public class AlipayFundTransToaccRequest implements AlipayRequest<AlipayFundTransToaccResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 转账金额
	 */
	private String amount;

	/** 
	* 扩展参数，json字符串格式
	 */
	private String extParam;

	/** 
	* 转账备注
	 */
	private String memo;

	/** 
	* 商户转账唯一订单号
	 */
	private String outBizNo;

	/** 
	* 收款方账户
	 */
	private String payeeAccount;

	/** 
	* 收款方真实姓名
	 */
	private String payeeRealName;

	/** 
	* 收款方显示姓名
	 */
	private String payeeShowName;

	/** 
	* 收款方账户类型
	 */
	private String payeeType;

	/** 
	* 付款方账户
	 */
	private String payerAccount;

	/** 
	* 付款方真实姓名
	 */
	private String payerRealName;

	/** 
	* 付款方显示姓名
	 */
	private String payerShowName;

	/** 
	* 付款方账户类型
	 */
	private String payerType;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount() {
		return this.amount;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam() {
		return this.extParam;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	public String getMemo() {
		return this.memo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo() {
		return this.outBizNo;
	}

	public void setPayeeAccount(String payeeAccount) {
		this.payeeAccount = payeeAccount;
	}
	public String getPayeeAccount() {
		return this.payeeAccount;
	}

	public void setPayeeRealName(String payeeRealName) {
		this.payeeRealName = payeeRealName;
	}
	public String getPayeeRealName() {
		return this.payeeRealName;
	}

	public void setPayeeShowName(String payeeShowName) {
		this.payeeShowName = payeeShowName;
	}
	public String getPayeeShowName() {
		return this.payeeShowName;
	}

	public void setPayeeType(String payeeType) {
		this.payeeType = payeeType;
	}
	public String getPayeeType() {
		return this.payeeType;
	}

	public void setPayerAccount(String payerAccount) {
		this.payerAccount = payerAccount;
	}
	public String getPayerAccount() {
		return this.payerAccount;
	}

	public void setPayerRealName(String payerRealName) {
		this.payerRealName = payerRealName;
	}
	public String getPayerRealName() {
		return this.payerRealName;
	}

	public void setPayerShowName(String payerShowName) {
		this.payerShowName = payerShowName;
	}
	public String getPayerShowName() {
		return this.payerShowName;
	}

	public void setPayerType(String payerType) {
		this.payerType = payerType;
	}
	public String getPayerType() {
		return this.payerType;
	}
	private String terminalType;
	private String terminalInfo;	
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
	private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}

    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }	

	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}

	public String getProdCode() {
		return this.prodCode; 
	}

	public String getApiMethodName() {
		return "alipay.fund.trans.toacc";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("amount", this.amount);
		txtParams.put("ext_param", this.extParam);
		txtParams.put("memo", this.memo);
		txtParams.put("out_biz_no", this.outBizNo);
		txtParams.put("payee_account", this.payeeAccount);
		txtParams.put("payee_real_name", this.payeeRealName);
		txtParams.put("payee_show_name", this.payeeShowName);
		txtParams.put("payee_type", this.payeeType);
		txtParams.put("payer_account", this.payerAccount);
		txtParams.put("payer_real_name", this.payerRealName);
		txtParams.put("payer_show_name", this.payerShowName);
		txtParams.put("payer_type", this.payerType);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<AlipayFundTransToaccResponse> getResponseClass() {
		return AlipayFundTransToaccResponse.class;
	}
	

    public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
