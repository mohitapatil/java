package com.sapient.exceptions;
//user defined exception
//throable > exception > RuntimeException
public class PasswordException extends Exception{

    public PasswordException(String message){
        super(message);
    }

}
