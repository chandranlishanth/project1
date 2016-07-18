package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;

interface IEmployeeService
{
	void AddEmployee();
	void ModifyEmployee();
	void RemoveEmployee();
	void SearchEmployee();
	void getAllEmployee();
	
}
public class EmployeeServiceImpl implements IEmployeeService
{
	
	Department d=new Department();
	HashMap hm=new HashMap();  
		
   public void AddEmployee(HashMap  hm)
	{
	   this.hm=hm;
	   String name=(String)hm.get(1);
	   String id=(String)hm.get(2);
	   String emailid=(String)hm.get(3);
	   long phonenumber=(long)hm.get(4);
	   String dob=(String)hm.get(6); 
	   String doj=(String)hm.get(7);
	   String department=(String)hm.get(8);
	   String project=(String)hm.get(9);
	   String role=(String)hm.get(10);
	   
	   Employee e=new Employee();
	   
	   e.setName(name);
	   e.setKinid(id);
	   e.setemailid(emailid);
	   e.setphonenumber(phonenumber);
	   e.setdob(dob);
	   e.setdoj(doj);
	   e.setDepartment(department);
	   e.setproject(project);
	   e.setrole(role);  
	   
	   EmployeeDaoImplForList empdao=new EmployeeDaoImplForList();
	   empdao.AddEmployee(e);
		
	}
	
	public void ModifyEmployee()
	{
		
	}
	public void RemoveEmployee()
	{
		
	}
	public void SearchEmployee()
	{
		
	}
	public void getAllEmployee()
	{
		
	}

	@Override
	public void AddEmployee() {
		// TODO Auto-generated method stub
		
	}

	
}

