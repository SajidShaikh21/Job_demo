package com.my_app.exception;

public class UserDisabledException extends Throwable {
    public UserDisabledException(String userIsDisabled) {
        super(userIsDisabled);
    }
}
