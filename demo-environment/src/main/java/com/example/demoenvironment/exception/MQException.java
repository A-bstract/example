package com.example.demoenvironment.exception;
import com.example.demoenvironment.constan.Enum;


public class MQException extends RuntimeException {

    private static final long serialVersionUID = 2475761803319651014L;

    private String errCode;
    private String errMsg;
    private Enum.MQExceptionType mqExceptionType;

    public MQException(String errMsg) {
        super(errMsg);
    }

    public MQException (String errCode,String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public MQException (Enum.MQExceptionType mqExceptionType){
        this.mqExceptionType = mqExceptionType;
        this.errCode = mqExceptionType.getErrCode();
        this.errMsg = mqExceptionType.getErrMsg();
    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

//    public Enum.MQExceptionType getMqExceptionType() {
//        return mqExceptionType;
//    }
}
