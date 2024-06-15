package com.example.Lab12.MyExceptionR;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFound extends RuntimeException{
	public ResourceNotFound(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	

}
