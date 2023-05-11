package com.example.demo.response;

public class DefaultResponse {

    private boolean error;
    private String msg;
    private int code;

    public DefaultResponse(boolean error, String msg, int code) {
        this.error = error;
        this.msg = msg;
        this.code = code;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean getError() {
        return this.error;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}
