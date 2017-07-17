package com.test.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    		new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});

    	ServiceA servA = (ServiceA)context.getBean("servA");
    	servA.call();
    	ServiceA servA_1 = (ServiceA)context.getBean("servA");
    	servA_1.call();
    	
    	//retrieve it again
    	ServiceB servB = (ServiceB)context.getBean("servB");
    	servB.call();
    	System.out.println("*** Message : "+ servB.getMessage());
    	System.out.println("*** Serv B :: Int Val : " + servB.getI());
    	
    	ServiceB servB_1 = (ServiceB)context.getBean("servB");
    	servB_1.call();
    	System.out.println("*** Message : " + servB_1.getMessage());
    	System.out.println("*** Serv B :: I : " + servB_1.getI());
    	
    	ServiceC servC = (ServiceC)context.getBean("servC");
    	System.out.println("*** Message : " + servC.getMessage());
    	System.out.println("*** Serv C :: I : " + servC.getI());

    	ServiceC servC_1 = (ServiceC)context.getBean("servC");
    	System.out.println("*** Message : " + servC_1.getMessage());
    	System.out.println("*** Serv C :: I : " + servC_1.getI());
    }
}