package com.example.exception;

public class CustomException extends RuntimeException {
    public CustomException() {
    }

    public CustomException(Exception e) {
        super("CustomException 실행");
    }
}
