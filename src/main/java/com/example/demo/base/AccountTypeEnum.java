package com.example.demo.base;

/**
 * Created by Administrator on 2017/10/4.
 */
public enum AccountTypeEnum {

    vip1("vip1", "VIP1会员"),
    vip2("vip2", "VIP2会员");
    // 成员变量
    private String code;
    private String desc;
    // 构造方法
    private AccountTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    // get set 方法
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }


}


