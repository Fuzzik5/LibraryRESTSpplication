package ru.khabib.libraryRestApplication.util;

public class BookNotCreatedException extends RuntimeException{
    public BookNotCreatedException(String msg){
        super(msg);
    }
}
