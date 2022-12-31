package com.semicolon.notemanagementsystem.exceptions;

public class NotDoesNotExitException extends RuntimeException {
    public NotDoesNotExitException(String massage){
        super(massage);
    }
}
