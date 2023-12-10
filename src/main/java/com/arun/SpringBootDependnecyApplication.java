package com.arun;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.arun.beans.CourseSelection;


@SpringBootApplication
public class SpringBootDependnecyApplication {

	public static void main(String[] args) 
	{
		ApplicationContext context=SpringApplication.run(SpringBootDependnecyApplication.class, args);
		CourseSelection select=context.getBean(CourseSelection.class);
		boolean status=select.selectCourse();
		
	}

}
