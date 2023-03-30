package com.SecureHome.main.ExceptionHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.SecureHome.main.Exception.EnquiryNotFoundException;

@RestControllerAdvice
public class GlobalHandler {

	@ExceptionHandler(value = EnquiryNotFoundException.class)
	public String EnquiryNotFounExceptionHandler()
	{
		return "Enquiry details Not Found";
	}
}
