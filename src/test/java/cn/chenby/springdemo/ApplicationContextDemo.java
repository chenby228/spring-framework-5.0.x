package cn.chenby.springdemo;

import cn.chenby.springdemo.service.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextDemo {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-test.xml");
		String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
		boolean messageService1 = applicationContext.isSingleton("messageService");
		System.out.println(messageService1 + " \t !!!");
		for (String beanName : beanDefinitionNames) {
			System.out.println("beanName---->" + beanName);
		}
		MessageService messageService = ( MessageService ) applicationContext.getBean("messageService");
		MessageService bean = applicationContext.getBean(MessageService.class);
		System.out.println(messageService);
		System.out.println(bean);
		messageService.getMessage();
	}
}





