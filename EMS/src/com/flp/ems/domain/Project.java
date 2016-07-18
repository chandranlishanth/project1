package com.flp.ems.domain;

import java.util.Scanner;

public class Project 
{
	String name,description;
	int department_id,project_id;
	Scanner sc=new Scanner(System.in);
	
	
	public void SetDepartment_id(int department_id)
	{
		this.department_id=department_id;
	}
	
	public int getDepartment_id()
	{
	return department_id;
	}
	public void Setproject_id(int project_id)
	{
		this.project_id=project_id;
		
	}
	public int getproject_id()
	{
		return project_id;
	}
	
	
	

}
