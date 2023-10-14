package ru.khabib.libraryRestApplication.util;

public class PersonNotUpdatedException extends RuntimeException {
    public PersonNotUpdatedException(String msg){
        super(msg);
    }
}
