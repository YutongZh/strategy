package com.yt.strategy;

import java.math.BigDecimal;

public class Order {

    private Long orderId;
    private Long uid;
    private BigDecimal amount;

    public Order(Long orderId, Long uid, BigDecimal amount) {
        this.orderId = orderId;
        this.uid = uid;
        this.amount = amount;
    }

    public PayState pay(Payment payment){
        PayState pay = payment.pay(uid, amount);
        System.out.println(pay.toString());
        return pay;
    }

    public PayState pay(PayTypeEnum payTypeEnum){
        PayState pay = payTypeEnum.get().pay(uid, amount);
        System.out.println(pay.toString());
        return pay;
    }

}
