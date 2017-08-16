package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;

/**
 * 创建菜单
 *
 * @author auto create
 * @since 1.0, 2016-10-26 18:05:14
 */@ApiModel(description = " 创建菜单")
public class AlipayOpenPublicMenuCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7657529862777431653L;

	/**
	 * 一级菜单数组，个数应为1~4个
	 */@ApiModelProperty(notes = " 一级菜单数组，个数应为1~4个")
	@ApiListField("button")
	@ApiField("button_object")
	private List<ButtonObject> button;

	public List<ButtonObject> getButton() {
		return this.button;
	}
	public void setButton(List<ButtonObject> button) {
		this.button = button;
	}

}
