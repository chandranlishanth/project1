package com.flp.ems.dao;

import java.util.ArrayList;

import com.flp.ems.domain.Employee;

interface IemployeeDao
{
	void AddEmployee(Employee e);
	void ModifyEmployee();
	void RemoveEmployee();
	void SearchEmployee();
	void getAllEmployee();
	
	
}

public class EmployeeDaoImplForList implements IemployeeDao
{
	ArrayList<> array=new ArrayList<>();
	public void AddEmployee(Employee e)
	{
		array.add(e);
		
	}
	public void ModifyEmployee()
	{
		
	}
	public void RemoveEmployee()
	{
		
	}
	public void SearchEmployee(){
		
	}
	public void getAllEmployee()
	{
		
	}

}
