package com.spring.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Person;

public class Demoapp {

	public static void main(String[] args) {

		// Reading configuration from the spring configuration file.
		ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("spring-config.xml");

		Person myperson = context.getBean("personBean", Person.class);

		System.out.println("Name= " + myperson.getName());

		// Closing the context object.
		context.close();
	}
}