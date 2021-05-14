package com.spring.util;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.IciciAtm;

public class AppMain {

	public static void main(String[] args) {

		System.out.println("************** Begin Program **************");

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring-lifecycle.xml");

		IciciAtm atm = ac.getBean(IciciAtm.class);	
		System.out.println(atm.getWelcomemsg());

		// closing the context object!
		ac.close();

		System.out.println("************** End Program **************");
	}
}