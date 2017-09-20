package com.example.demo.common.returncode;

public enum ReturnCode {
    user_noexist("1000001","用户不存在");

    private String code;
    private String message;

    private ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String toCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
