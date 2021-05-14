package com.spring.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Employee;

public class AppMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("resource-annotation.xml");

		Employee emp = ac.getBean("myemployee", Employee.class);
		System.out.println(emp.toString());
	}
}