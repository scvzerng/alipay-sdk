package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口信息列表，停车业务需要配置的接口列表请参这里：https://openhome.alipay.com/xxx。每次请将所有的接口配置信息都传入，未传的接口信息将会被置空。
 *
 * @author auto create
 * @since 1.0, 2017-03-02 18:23:12
 */
public class InterfaceInfoList extends AlipayObject {

	private static final long serialVersionUID = 8746181919131483699L;

	/**
	 * SPI接口名称，需要配置的接口名称请参考这里：https://openhome.alipay.com/xxx。
	 */
	@ApiField("interface_name")
	private String interfaceName;

	/**
	 * 接口类型，包括两类：interface_page页面接口 interface_service服务接口。
	 */
	@ApiField("interface_type")
	private String interfaceType;

	/**
	 * SPI接口的调用地址url，协议必须为https，对整个url字符串必须进行encode编码。每个SPI接口的类型请参考这里：https://openhome.alipay.com/xxx。
	 */
	@ApiField("interface_url")
	private String interfaceUrl;

	public String getInterfaceName() {
		return this.interfaceName;
	}
	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
	}

	public String getInterfaceType() {
		return this.interfaceType;
	}
	public void setInterfaceType(String interfaceType) {
		this.interfaceType = interfaceType;
	}

	public String getInterfaceUrl() {
		return this.interfaceUrl;
	}
	public void setInterfaceUrl(String interfaceUrl) {
		this.interfaceUrl = interfaceUrl;
	}

}
