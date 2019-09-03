package com.yt.strategy;

import java.math.BigDecimal;

public class AliPay implements Payment {
    @Override
    public PayState pay(Long uid, BigDecimal amount) {
        return new PayState(200, "支付宝支付", "支付成功");
    }
}
