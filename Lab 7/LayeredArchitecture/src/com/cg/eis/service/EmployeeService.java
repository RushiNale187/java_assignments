package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService 
{
	public String getDesignation(double salary);
	
	public String getInsuranceScheme(String designation,double salary);
	
	public void addEmployee(Employee emp);

	public void getEmpDetailsByScheme(String insuranceScheme);
	
	public void deleteEmployeeDetails(int eid);
}
