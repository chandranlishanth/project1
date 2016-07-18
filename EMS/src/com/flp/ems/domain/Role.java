package com.flp.ems.domain;

import java.util.Scanner;

public class Role {
	String name,description;
	int roleid;
	public void setDescription(String description)
	{
		this.description=description;
	}
	public String getDescription()
	{
		return description;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void SetId(int roleid)
	{
		this.roleid=roleid;
	}
Scanner sc=new Scanner(System.in);
	public void getRoleid()
	{
		System.out.println("1.Consultant");
		System.out.println("2.Assosiate Consultant");
		System.out.println("3.Senior Software Engineer");
     		System.out.println("4.Software Engineer");
     		int i=sc.nextInt();
 
	if(i==1)
		{
			System.out.println("Consultant");
		}else if(i==2)
		{
			System.out.println("Associate Consultant");
		}
		else if(i==3)
		{
			System.out.println("Senior software engineer");
		}
		else if(i==4)
		{
			System.out.println("software engineer");
		}
}
}
