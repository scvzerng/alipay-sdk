package com.alipay.api.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import io.swagger.annotations.*;

import javax.validation.constraints.NotNull;

/**
 * 商户动态码回传信息模型。包含动态码的码值、过期时间等信息。
 *
 * @author auto create
 * @since 1.0, 2017-06-14 16:33:53
 */
@ApiModel(description = " 商户动态码回传信息模型。包含动态码的码值、过期时间等信息。")
public class MdCodeInfoDTO extends AlipayObject {

    private static final long serialVersionUID = 1868798874163531869L;

    /**
     * 本次回传动态码的状态：
     * SUCCESS: 本次发码成功
     * FAIL_RETRY: 本次发码失败，且需要支付宝重试（重新通知商户发码）
     * FAIL_NOT_RETRY: 本次发码失败，且无需支付宝重试（无需重新通知商户发码）
     */
    @ApiModelProperty(notes = " 本次回传动态码的状态：SUCCESS: 本次发码成功FAIL_RETRY: 本次发码失败，且需要支付宝重试（重新通知商户发码）FAIL_NOT_RETRY: 本次发码失败，且无需支付宝重试（无需重新通知商户发码）")
    @JSONField(alternateNames = "codeStatus", name = "code_status")
    @NotNull
    private String codeStatus;

    /**
     * 动态码的码值：
     * code_status为SUCCESS时必填；
     * 基于此码值生成条形码或二维码用于扫码核销。
     */
    @ApiModelProperty(notes = " 动态码的码值：code_status为SUCCESS时必填；基于此码值生成条形码或二维码用于扫码核销。")
    @JSONField(alternateNames = "codeValue", name = "code_value")
    private String codeValue;

    /**
     * 当前动态码的过期（失效）时间：
     * code_status为SUCCESS时必填。
     */
    @ApiModelProperty(notes = " 当前动态码的过期（失效）时间：code_status为SUCCESS时必填。")
    @JSONField(alternateNames = "expireTime", name = "expire_time", format = "yyyy-MM-dd HH:mm:ss")
    private Date expireTime;

    /**
     * 商户回传动态码的时间戳。
     * <p>
     * 即商户调接口回传动态码时刻对应的long类型时间戳，用于区分不同的发码请求。
     */
    @ApiModelProperty(notes = " 商户回传动态码的时间戳。即商户调接口回传动态码时刻对应的long类型时间戳，用于区分不同的发码请求。")
    @JSONField(alternateNames = "timeStamp", name = "time_stamp")
    @NotNull
    private Long timeStamp;

    public String getCodeStatus() {
        return this.codeStatus;
    }

    public void setCodeStatus(String codeStatus) {
        this.codeStatus = codeStatus;
    }

    public String getCodeValue() {
        return this.codeValue;
    }

    public void setCodeValue(String codeValue) {
        this.codeValue = codeValue;
    }

    public Date getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
    }

}
