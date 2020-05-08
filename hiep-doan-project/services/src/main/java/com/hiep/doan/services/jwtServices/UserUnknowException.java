package com.hiep.doan.services.jwtServices;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserUnknowException extends RuntimeException {
    public UserUnknowException(String s) {
        super(s);
    }
}
