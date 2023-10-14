package ru.khabib.libraryRestApplication.util;

public class PersonNotCreatedException extends RuntimeException {
    public PersonNotCreatedException(String msg){
        super(msg);
    }
}
