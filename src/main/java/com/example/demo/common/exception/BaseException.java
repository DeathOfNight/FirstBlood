//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.demo.common.exception;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BaseException extends RuntimeException {
    protected String id;
    protected String message;
    protected String defineCode;
    protected String defineMessage;
    protected String realClassName;

    protected BaseException() {
        this.initId();
    }

    protected BaseException(String defineCode) {
        this.initId();
        this.defineCode = defineCode;
    }

    public BaseException(String defineCode, String defineMessage) {
        this.initId();
        this.defineCode = defineCode;
        this.defineMessage = defineMessage;
    }

    private void initId() {
        this.id = UUID.randomUUID().toString().toUpperCase().replaceAll("-", "");
    }

    public String getId() {
        return this.id;
    }

    public String getMessage() {
        String mes = "";
        Field[] fields = this.getClass().getDeclaredFields();
        Field[] var3 = fields;
        int var4 = fields.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Field field = var3[var5];

            try {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (obj instanceof BaseException) {
                    BaseException jps = (BaseException)obj;
                    if (jps.getDefineCode().equals(this.getDefineCode())) {
                        mes = field.getName();
                        break;
                    }
                }
            } catch (IllegalAccessException var9) {
                var9.printStackTrace();
            }
        }

        return mes + " " + this.defineCode + " " + this.defineMessage + " " + this.message;
    }

    public void setMessage(String message, Object... args) {
        this.message = MessageFormat.format(message, args);
    }

    public String getDefineCode() {
        return this.defineCode;
    }

    public void setDefineCode(String defineCode) {
        this.defineCode = defineCode;
    }

    public String getDefineMessage() {
        return this.defineMessage;
    }

    public void setDefineMessage(String defineMessage) {
        this.defineMessage = defineMessage;
    }

//    public static <T extends BaseException> T newException(T exception, String message, Object... args) {
//        if (exception == null) {
//            throw new RuntimeException("no exception instance specified");
//        } else {
//            try {
//                Constructor constructor = exception.getClass().getDeclaredConstructor(String.class);
//                constructor.setAccessible(true);
//                T newException = (BaseException)constructor.newInstance(exception.getDefineCode());
//                newException.setMessage(message, args);
//                return newException;
//            } catch (Throwable var5) {
//                throw new RuntimeException("create exception instance fail : " + var5.getMessage(), var5);
//            }
//        }
//    }

    public boolean codeEquals(BaseException e) {
        if (e == null) {
            return false;
        } else {
            return !e.getClass().equals(this.getClass()) ? false : e.getDefineCode().equals(this.getDefineCode());
        }
    }

    public BaseException upcasting() {
        if (this.getClass().equals(BaseException.class)) {
            return this;
        } else {
            BaseException superexception = new BaseException(this.defineCode);
            superexception.message = this.message;
            superexception.realClassName = this.getClass().getName();
            superexception.id = this.id;
            superexception.setStackTrace(this.getStackTrace());
            return superexception;
        }
    }

    public BaseException downcasting() {
        if (this.realClassName != null && !BaseException.class.getName().equals(this.realClassName)) {
            Class clz = null;

            try {
                clz = Class.forName(this.realClassName);
            } catch (Exception var5) {
                ;
            }

            if (clz == null) {
                return this;
            } else {
                try {
                    Constructor constructor = clz.getDeclaredConstructor(String.class);
                    constructor.setAccessible(true);
                    BaseException newException = (BaseException)constructor.newInstance(this.defineCode);
                    newException.message = this.message;
                    newException.id = this.id;
                    newException.setStackTrace(this.getStackTrace());
                    return newException;
                } catch (Throwable var4) {
                    throw new RuntimeException("create exception instance fail : " + var4.getMessage(), var4);
                }
            }
        } else {
            return this;
        }
    }

    public String getRealClassName() {
        return this.realClassName == null ? this.getClass().getName() : this.realClassName;
    }

//    public void mergeStackTrace(StackTraceElement[] stackTrace) {
//        this.setStackTrace((StackTraceElement[])ArrayUtils.addAll(this.getStackTrace(), stackTrace));
//    }

    public StackTraceElement[] getCoreStackTrace() {
        List<StackTraceElement> list = new ArrayList();
        StackTraceElement[] stackTrace = this.getStackTrace();
        int var3 = stackTrace.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            StackTraceElement traceEle = stackTrace[var4];
            if (traceEle.getClassName().startsWith("com.yeepay")) {
                list.add(traceEle);
            }
        }

        stackTrace = new StackTraceElement[list.size()];
        return (StackTraceElement[])list.toArray(stackTrace);
    }

    public String getCoreStackTraceStr() {
        StringBuffer sb = new StringBuffer();
        StackTraceElement[] var2 = this.getCoreStackTrace();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            StackTraceElement traceEle = var2[var4];
            sb.append("\n" + traceEle.toString());
        }

        return sb.toString();
    }
}
