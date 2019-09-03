package com.yt.strategy;

import java.math.BigDecimal;

public class JDPay implements Payment {
    @Override
    public PayState pay(Long uid, BigDecimal amount) {
        return new PayState(200, "京东支付", "支付成功");
    }
}
