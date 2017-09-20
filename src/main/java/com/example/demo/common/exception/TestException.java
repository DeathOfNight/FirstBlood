package com.example.demo.common.exception;

import com.example.demo.common.returncode.ReturnCode;
import org.apache.commons.lang3.StringUtils;

public class TestException extends BaseException{
    public TestException() {
        super();
    }

    public TestException(String defineCode) {
        super(defineCode);
    }

    public TestException(String defineCode, String defineMessage) {
        super(defineCode, defineMessage);
    }

    public TestException(ReturnCode returnCode) {
        super(returnCode.toCode(), returnCode.getMessage());
    }

    public TestException(ReturnCode returnCode, String defineMessage) {
        super(returnCode.toCode(), StringUtils.isBlank(defineMessage) ? returnCode.getMessage() : defineMessage);
    }
}
