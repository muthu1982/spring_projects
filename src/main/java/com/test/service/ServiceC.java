package com.test.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceC {

	int i;
	
	String message;

	public int getI() {
		i++;
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
	      System.out.println("Bean SERVICEC is going through init. i  => "+i+" msg "+message);
	   }
	   public void destroy() {
	      System.out.println("Bean SERVICEC will destroy now. i => "+i+" msg "+message);
	   }
}
