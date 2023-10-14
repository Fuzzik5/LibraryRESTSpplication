package ru.khabib.libraryRestApplication.util;

public class BookNotUpdatedException extends RuntimeException {
    public BookNotUpdatedException (String msg){
        super(msg);
    }
}
