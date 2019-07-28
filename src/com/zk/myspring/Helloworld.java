package com.zk.myspring;

public class Helloworld {
	private String message;
	
	public void setmessage(String message)
	{
		System.out.println("Your message:"+message);
	}
	
	public String getmessage()
	{
		return message;
	}
	
	public void init()
	{
		System.out.println("Bean is going through init");
	}
	
	public void destroy()
	{
		System.out.println("Bean will destory now");
	}
}
