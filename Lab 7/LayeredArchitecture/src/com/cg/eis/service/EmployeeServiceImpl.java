package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService 
{
	Map<Integer,Employee> map = new HashMap<>();
	
	@Override
	public String getDesignation(double salary) 
	{
		String designation;
		
		if(salary>=40000)
		{
			designation = "Manager";
		}
		else if(salary>=20000&&salary<40000)
		{
			designation = "Programmer";
		}
		else if(salary>=5000&&salary<20000)
		{
			designation = "SystemAssociate";
		}
		else
		{
			designation = "Clerk";
		}
		return designation;
	}
	
	@Override
	public String getInsuranceScheme(String designation, double salary) 
	{
		String scheme;
		if(designation == "Clerk")
			scheme = "NoScheme";
		else if(designation == "SystemAssociate")
			scheme = "SchemeC";
		else if(designation == "Programmer")
			scheme = "SchemeB";
		else
			scheme = "SchemeA";
		return scheme;
	}
	
	@Override
	public void addEmployee(Employee emp) 
	{
		map.put(emp.id, emp);
	}

	@Override
	public void getEmpDetailsByScheme(String scheme) 
	{
		for (Map.Entry<Integer,Employee> entry : map.entrySet())
		{
            Employee emp = entry.getValue();
            if(scheme.equals(emp.insuranceScheme))
            {
            	System.out.println(emp.id+","+emp.name+","+emp.designation+","+emp.salary);
            }
		}
	}

	@Override
	public void deleteEmployeeDetails(int eid) 
	{
		map.remove(eid);
		System.out.println("employee with id "+eid+" is deleted");
	}

}