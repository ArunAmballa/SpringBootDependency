package com.arun.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class CourseSelection 
{
	@Autowired
	@Qualifier("pythonCourse")
	private Course course;
	
	public CourseSelection()
	{
		System.out.println("CourseSelection Object is Created by Spring");
		
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public CourseSelection(Course course)
	{
		this.course=course;
	}
	
	public boolean selectCourse()
	{
		return course.purchase();
		
	}
	

}
