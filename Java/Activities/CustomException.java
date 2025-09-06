package javaactivities;

import javaactivities.CustomException;

public class CustomException extends Exception{
	
	private String message;
	
	public  CustomException(String msg) {
		super();
        this.message = msg;
		}
	
	public CustomException() {
        super();
        this.message = "This is a custom exception!";
    }
	
	@Override
	public String getMessage() {
		return message;
	}

}
