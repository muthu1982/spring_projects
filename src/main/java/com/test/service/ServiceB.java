package com.test.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceB {

	ServiceC servC;
	
	public ServiceC getServC() {
		return servC;
	}

	public void setServC(ServiceC servC) {
		this.servC = servC;
	}

	int i;
	
	String message;
	
	public void call() {
		servC.setMessage("ServiceC : Hi");
		System.out.println(servC.getMessage());
		System.out.println("ServiceC : "+servC.getI());
		System.out.println("ServiceC : "+servC.getI());
	}

	public int getI() {
		i++;
		//System.out.println("i = "+i);
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
	      System.out.println("Bean SERVICEB is going through init. i => "+i+" msg "+message);
	   }
	   public void destroy() {
	      System.out.println("Bean SERVICEB will destroy now. i => "+i+" msg "+message);
	   }
}
