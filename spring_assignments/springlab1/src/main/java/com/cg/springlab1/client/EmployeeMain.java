package com.cg.springlab1.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springlab1.service.EmployeeService;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("empcontext.xml");
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
		service.displayEmployeeData();
	}
}
