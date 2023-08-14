package com.example.courseworke2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionExistException extends RuntimeException{
    public QuestionExistException() {
    }

    public QuestionExistException(String message) {
        super(message);
    }

    public QuestionExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionExistException(Throwable cause) {
        super(cause);
    }

    public QuestionExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
