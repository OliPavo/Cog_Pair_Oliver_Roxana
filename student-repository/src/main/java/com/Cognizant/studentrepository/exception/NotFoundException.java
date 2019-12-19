package com.Cognizant.studentrepository.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {super("No definition found with id " + id);}
}
