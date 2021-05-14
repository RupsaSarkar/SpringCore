package com.kb.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAwareTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		ApplicationContextAwareImpl applicationContextAwareImpl = (ApplicationContextAwareImpl) applicationContext.getBean("applicationContextAware");
		
		System.out.println("Application context aware output");
		applicationContextAwareImpl.displayPersonDetails();
		
		BeanFactoryAwareImpl beanFactoryAwareImpl = (BeanFactoryAwareImpl) applicationContext.getBean("beanFactoryAware");

		System.out.println("Bean factory aware output");
		beanFactoryAwareImpl.displayPersonDetails();
		
		
		
		applicationContext.registerShutdownHook();

	}

}
