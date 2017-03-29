package com.nihaorz.exception;

/**
 * Created by wangrui1066 on 2017-3-29.
 * 预约业务异常
 */
public class AppointException extends RuntimeException {

    public AppointException(String message) {
        super(message);
    }

    public AppointException(String message, Throwable cause) {
        super(message, cause);
    }

}
