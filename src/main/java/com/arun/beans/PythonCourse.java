package com.arun.beans;

import org.springframework.stereotype.Component;

@Component
public class PythonCourse implements Course
{
	public PythonCourse()
	{
		System.out.println("PythonCourse Object is Created by Spring");
	}

	@Override
	public boolean purchase() 
	{
		
		System.out.println("Python Course is Purchased");
		return true;
		
	}

}
