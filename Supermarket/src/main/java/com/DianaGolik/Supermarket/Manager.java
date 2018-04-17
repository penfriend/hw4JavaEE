package com.DianaGolik.Supermarket;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Manager {
@Pointcut("execution(* com.DianaGolik.Supermarket.Cashier.giveCash())" )
public void giveCash() {}

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	@Before("giveCash()")
	public void checkCash() {
		// TODO Auto-generated method stub
		System.out.println("Manager checkCash.");

	}

}
