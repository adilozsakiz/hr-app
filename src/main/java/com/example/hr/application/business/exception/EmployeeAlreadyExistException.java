package com.example.hr.application.business.exception;

@SuppressWarnings("serial")
public class EmployeeAlreadyExistException extends RuntimeException {

	public EmployeeAlreadyExistException() {
		super("Employee already exists.");
	}

}
