package com.DianaGolik.Supermarket;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
    	//Buyer buyer = (Buyer) context.getBean("buyer");
    	Cashier admin = (Cashier) context.getBean("admin");
    	//Manager man = (Manager) context.getBean("manager");
    	admin.scanned();
    	admin.giveCash();
    	

    }
}
