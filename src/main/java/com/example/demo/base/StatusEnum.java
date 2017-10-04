package com.example.demo.base;

/**
 * Created by Administrator on 2017/10/4.
 */
public enum StatusEnum {

    ON("ON", "开启"),
    OFF("OFF", "关闭");
    // 成员变量
    private String code;
    private String desc;
    // 构造方法
    private StatusEnum(String code, String desc) {
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


