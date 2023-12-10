package com.arun.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JavaCourse implements Course
{
	
	public JavaCourse()
	{
		System.out.println("JavaCourse Object is Created by Spring");
	}

	@Override
	public boolean purchase() 
	{
		
		System.out.println("Java Course is Purchased");
		return true;
		
	}

}
