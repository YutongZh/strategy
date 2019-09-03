package com.yt.strategy;

import java.math.BigDecimal;

public class WeChatPay implements Payment{

    @Override
    public PayState pay(Long uid, BigDecimal amount) {
        return new PayState(200, "微信支付", "支付成功");
    }
}
