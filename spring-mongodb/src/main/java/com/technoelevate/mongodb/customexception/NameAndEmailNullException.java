package com.technoelevate.mongodb.customexception;

@SuppressWarnings("serial")
public class NameAndEmailNullException extends RuntimeException{
	
	public NameAndEmailNullException(String messege) {
		super(messege);
	}

}
