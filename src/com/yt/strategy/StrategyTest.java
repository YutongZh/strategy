package com.yt.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;

public class StrategyTest {

    public static void main(String[] args) {
        Order order = new Order(201909031128342L, 332232L, BigDecimal.valueOf(460));
        //方式一 每增加一个支付渠道，都需要维护payment接口，不太方便
        order.pay(Payment.ALI_PAY);
        //方式二 枚举相当于常量类 更优雅
        order.pay(PayTypeEnum.ALI_PAY);

        new ArrayList<Object>().sort(new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
