package com.alipay.api.response;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.domain.ButtonObject;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;
import com.alipay.api.internal.mapping.ApiListField;
import io.swagger.annotations.*;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * ALIPAY API: alipay.open.public.menu.query response.
 *
 * @author auto create
 * @since 1.0, 2016-12-08 11:57:40
 */
@ApiModel(description = " ALIPAY API: alipay.open.public.menu.query response.")
public class AlipayOpenPublicMenuQueryResponse extends AlipayResponse {

    private static final long serialVersionUID = 1424166512179147572L;

    /**
     * 一级菜单数组，个数应为1~4个
     */
    @JSONField(name = "menu_content", alternateNames = "menuContent")
    @ApiModelProperty(notes = " 一级菜单数组，个数应为1~4个")
    private Object menuContent;

    /**
     * 一级菜单数组，个数应为1~4个
     */
    @ApiModelProperty(notes = " 一级菜单数组，个数应为1~4个")
    private List<ButtonObject> button;

    public void setMenuContent(Object menuContent) {
        this.menuContent = menuContent;
    }

    public Object getMenuContent() {
        return this.menuContent;
    }

    public void setButton(List<ButtonObject> button) {
        this.button = button;
    }

    public List<ButtonObject> getButton() {

        return button;
    }
}
