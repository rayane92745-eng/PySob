package com.pysob.hx.parser;

public class SyntaxError extends RuntimeException {
    public SyntaxError(String message) {
        super(message);
    }
}