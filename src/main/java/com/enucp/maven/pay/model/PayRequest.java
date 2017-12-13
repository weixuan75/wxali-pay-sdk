package com.enucp.maven.pay.model;

import com.enucp.maven.pay.enums.BestPayTypeEnum;
import lombok.Data;

/**
 * 支付时请求参数
 */
@Data
public class PayRequest {

    /**
     * 支付方式.
     */
    private BestPayTypeEnum payTypeEnum;

    /**
     * 订单号.
     */
    private String orderId;

    /**
     * 订单金额.
     */
    private Double orderAmount;

    /**
     * 订单名字.
     */
    private String orderName;

    /**
     * 微信openid, 仅微信支付时需要
     */
    private String openid;
}
