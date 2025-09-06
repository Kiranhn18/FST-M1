package javaactivities;

import javaactivities.CustomException;
public class Activity8 {
	    
public static void main(String[] args) {
	
	try {
		exceptionTest("Will print to console");
		exceptionTest(null);
	} catch (CustomException e) {
		// TODO Auto-generated catch block
		System.out.println("inside the catch block");
		e.printStackTrace();
	}
		
}
public static void exceptionTest(String str) throws CustomException {
	
	if (str == null) {
		throw new CustomException();
	} else {
		System.out.println(str);
	}
}
}
