package com.nihaorz.exception;

/**
 * Created by wangrui1066 on 2017-3-29.
 * 重复预约异常
 */
public class RepeatAppointException extends RuntimeException {

    public RepeatAppointException(String message) {
        super(message);
    }

    public RepeatAppointException(String message, Throwable cause) {
        super(message, cause);
    }

}
