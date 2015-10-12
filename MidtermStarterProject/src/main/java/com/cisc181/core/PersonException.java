package com.cisc181.core;

public class PersonException extends Exception{

	private Person person;
	private String message;
	
	public PersonException(Person person, String message){
		
		this.person = person;
		this.message = message;
		
	}
	
}
