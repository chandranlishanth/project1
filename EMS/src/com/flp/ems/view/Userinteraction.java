package com.flp.ems.view;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Userinteraction
{
 
public	String name,emailid,id,address,department,role,project;
	public int dob,doj;
	public long phonenumber;
	HashMap hm=new HashMap();  
	
public void addemployee()
{
	
	Scanner sc=new Scanner(System.in);

    System.out.println("Enter a Name");
    name=sc.next();
   
   
    System.out.println("Enter an kin id");
    id = sc.next();
  
 
    System.out.println("Enter a Emailid");
    emailid=sc.next();

    
    System.out.println("Enter a phonenumber");
    phonenumber=sc.nextLong();

   
    System.out.println("Enter a Address");
    address=sc.next();
 
 
    System.out.println("Enter a Dateofbirth");
    dob=sc.nextInt();
   
    System.out.println("Enter a Date of joining");
    doj=sc.nextInt();
    

    System.out.println("Enter a department");
    department=sc.next();


    System.out.println("Enter a project");
    project=sc.next();

 
    System.out.println("Enter a role");
    role=sc.next();
;

    
    
    hm.put(1,name);
    hm.put(2,id);
    hm.put(3,emailid);
    hm.put(4,phonenumber);
    hm.put(5,address);
    hm.put(6,dob);
    hm.put(7,doj);
    hm.put(8,department);
    hm.put(9,project);
    hm.put(10,role);
}
public void modifyemployee()
{
	
}
 
public void deleteemployee()
{
	
}
 
 




}
