package com.my_app.exception;

public class InvalidOtpException extends Throwable {
    public InvalidOtpException(String message) {
        super(message);
    }
}
