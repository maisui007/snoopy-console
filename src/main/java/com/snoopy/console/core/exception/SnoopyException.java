package com.snoopy.console.core.exception;

/**
 * Created by V on 2017/7/7.
 */
public class SnoopyException extends RuntimeException{
    /**
     * @Fields code : 异常码
     */
    private String code;

    /**
     * @Fields msg : 异常信息
     */
    private String msg;

    /**
     * @Fields data : 异常实体
     */
    private Object data;


    public SnoopyException(String code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public SnoopyException(String message, String code, String msg, Object data) {
        super(message);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public SnoopyException(String message, Throwable cause, String code, String msg, Object data) {
        super(message, cause);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public SnoopyException(Throwable cause, String code, String msg, Object data) {
        super(cause);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public SnoopyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String code, String msg, Object data) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
