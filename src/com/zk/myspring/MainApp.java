package com.zk.myspring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[]args)
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Helloworld obj=(Helloworld) context.getBean("helloworld");
		obj.getmessage();
		context.registerShutdownHook();
	}
}
