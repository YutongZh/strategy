package com.yt.strategy;

public enum PayTypeEnum {
    ALI_PAY(new AliPay()),
    WECHAT_PAY(new WeChatPay()),
    JD_PAY(new JDPay());

    private Payment payment;

    PayTypeEnum (Payment payment){
        this.payment = payment;
    }

    public Payment get(){
        return payment;
    }
}
