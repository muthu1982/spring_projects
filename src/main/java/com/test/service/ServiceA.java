package com.test.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceA {

	ServiceB servB;
	
	
	
	public ServiceB getServB() {
		return servB;
	}



	public void setServB(ServiceB servB) {
		this.servB = servB;
	}



	public void call() {
		servB.setMessage("ServiceB : Hi");
		System.out.println("############### "+servB.getMessage());
		System.out.println("ServiceB : "+servB.getI());
		System.out.println("ServiceB : "+servB.getI());
	}
	
	public void init(){
	      System.out.println("Bean SERVICEA is going through init.");
	   }
	   public void destroy() {
	      System.out.println("Bean SERVICEA will destroy now.");
	   }
}
