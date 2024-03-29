package com.yt.strategy;

public class PayState {

    private int code;
    private Object data;
    private String msg;

    public PayState(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "返回结果【" +
                "code=" + code +
                "】； data=【" + data +
                "】； msg=【" + msg + "】";
    }
}
