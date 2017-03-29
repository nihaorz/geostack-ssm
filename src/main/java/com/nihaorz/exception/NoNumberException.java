package com.nihaorz.exception;

/**
 * Created by wangrui1066 on 2017-3-29.
 * 库存不足
 */
public class NoNumberException extends RuntimeException {
    public NoNumberException(String message) {
        super(message);
    }

    public NoNumberException(String message, Throwable cause) {
        super(message, cause);
    }
}
