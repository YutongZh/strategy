package com.yt.strategy;

import java.math.BigDecimal;

/**
 * 支付渠道
 */
public interface Payment {

    public static final Payment ALI_PAY = new AliPay();
    public static final Payment JD_PAY = new JDPay();
    public static final Payment WECHAT_PAY = new WeChatPay();

    PayState pay(Long uid, BigDecimal amount);

}
