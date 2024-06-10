package com.result.project.Exceptions;

public class ResourceNotFoundException extends Exception {
	
	
	public ResourceNotFoundException()
	{
		super("resource your trying not found");
	}
	
	public ResourceNotFoundException(String message)
	{
		super(message);
	}

}
