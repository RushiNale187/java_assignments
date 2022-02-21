package com.cg.springlab1.service;

import com.cg.springlab1.bean.Employee;

public class EmployeeService 
{
	private Employee employee;
	
	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}
	
	public void displayEmployeeData()
	{
		System.out.println("Employee ID : "+employee.getEmployeeId());
		System.out.println("Employee Name : "+employee.getEmployeeName());
		System.out.println("Employee Salary : "+employee.getSalary());
		System.out.println("Employee BU : "+employee.getBusinessUnit());
		System.out.println("Employee Age : "+employee.getAge());
	}
}
