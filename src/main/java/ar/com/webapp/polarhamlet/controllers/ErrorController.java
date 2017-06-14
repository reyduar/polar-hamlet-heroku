package ar.com.webapp.polarhamlet.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import ar.com.webapp.polarhamlet.constants.ViewConstant;

@ControllerAdvice
public class ErrorController {

	@ExceptionHandler(Exception.class)
	public String showInternalServerError(){
		return ViewConstant.ERROR_500;
	}
}
