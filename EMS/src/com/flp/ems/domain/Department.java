package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.Iterator;

public class Department {
public static void main(String args[]){  
		   
		  ArrayList<String> al=new ArrayList<String>();
		  al.add("ADM JAVA DEVOPS");  
		  al.add("ADM JAVA CLOUD");  
		  al.add("ADM MAIN FRAME");  
		  
		  Iterator itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
		}  


