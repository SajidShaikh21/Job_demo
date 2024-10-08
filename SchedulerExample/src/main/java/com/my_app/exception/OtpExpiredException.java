package com.my_app.exception;

public class OtpExpiredException extends Throwable {
    public OtpExpiredException(String otpHasExpired)   {
        super(otpHasExpired);
    }
}
