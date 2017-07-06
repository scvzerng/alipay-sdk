package com.alipay.api.domain;

import com.alibaba.fastjson.annotation.*;
import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 营销工具
 *
 * @author auto create
 * @since 1.0, 2017-04-01 21:21:04
 */
public class PromoTool extends AlipayObject {

    private static final long serialVersionUID = 3795183624822489227L;

    /**
     * 集点卡工具，仅在活动类型为POINT_SEND时才有效且必填，其他活动类型此字段必须为null
     */
    @JSONField(name = "point_card", alternateNames = "pointCard")
    private PointCard pointCard;

    /**
     * 奖品发放的规则
     */
    @JSONField(name = "send_rule", alternateNames = "sendRule")
    private SendRule sendRule;

    /**
     * 单个营销工具的生效状态，当在招商部分券失效后会使用这个字段
     */
    private String status;

    /**
     * 券对象，当活动类型为POINT_SEND时为null，其他活动类型此字段必填
     */
    private Voucher voucher;

    /**
     * 营销工具uid,创建营销活动时无需设置
     */
    @JSONField(name = "voucher_no", alternateNames = "voucherNo")
    private String voucherNo;

    public PointCard getPointCard() {
        return this.pointCard;
    }

    public void setPointCard(PointCard pointCard) {
        this.pointCard = pointCard;
    }

    public SendRule getSendRule() {
        return this.sendRule;
    }

    public void setSendRule(SendRule sendRule) {
        this.sendRule = sendRule;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Voucher getVoucher() {
        return this.voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public String getVoucherNo() {
        return this.voucherNo;
    }

    public void setVoucherNo(String voucherNo) {
        this.voucherNo = voucherNo;
    }

}
