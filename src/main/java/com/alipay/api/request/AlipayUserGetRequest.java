package com.alipay.api.request;

import java.util.Map;

import com.alipay.api.AlipayRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.AlipayUserGetResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: alipay.user.get request
 * 
 * @author auto create
 * @since 1.0, 2016-04-14 14:48:28
 */
public class AlipayUserGetRequest implements AlipayRequest<AlipayUserGetResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 12
	 */
	private String aSY;

	/** 
	* 12
	 */
	private String ddd;

	/** 
	* 需要返回的字段列表。alipay_user_id：支付宝用户userId,user_status：支付宝用户状态,user_type：支付宝用户类型,certified：是否通过实名认证,real_name：真实姓名,logon_id：支付宝登录号,sex：用户性别
	 */
	private String fields;

	/** 
	* 12
	 */
	private String ssEee;

	/** 
	* a s da s d
	 */
	private String yyDsss;

	public void setaSY(String aSY) {
		this.aSY = aSY;
	}
	public String getaSY() {
		return this.aSY;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getDdd() {
		return this.ddd;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setSsEee(String ssEee) {
		this.ssEee = ssEee;
	}
	public String getSsEee() {
		return this.ssEee;
	}

	public void setYyDsss(String yyDsss) {
		this.yyDsss = yyDsss;
	}
	public String getYyDsss() {
		return this.yyDsss;
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
		return "alipay.user.get";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("a_s_y", this.aSY);
		txtParams.put("ddd", this.ddd);
		txtParams.put("fields", this.fields);
		txtParams.put("ss_eee", this.ssEee);
		txtParams.put("yy_dsss", this.yyDsss);
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

	public Class<AlipayUserGetResponse> getResponseClass() {
		return AlipayUserGetResponse.class;
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
