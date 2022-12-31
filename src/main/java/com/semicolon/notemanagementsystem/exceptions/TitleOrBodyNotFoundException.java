package com.semicolon.notemanagementsystem.exceptions;

public class TitleOrBodyNotFoundException extends RuntimeException{
    public TitleOrBodyNotFoundException(String message){
        super(message);
    }
}
