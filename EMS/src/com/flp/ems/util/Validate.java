package com.flp.ems.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Validate {
	
   
	private static Pattern dateFrmtPtrn =
            Pattern.compile("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)");
     
    public static boolean validateDateFormat(String date){
         
        Matcher mtch = dateFrmtPtrn.matcher(date);
        if(mtch.matches()){
            return true;
        }
        System.out.println("Enter a correct date formate");
        return false;
      
    }
    
    
    
    
    private static Pattern emailNamePtrn = Pattern.compile(
    "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
     
    public static boolean validateEmailAddress(String emailid){
         
        Matcher mtch = emailNamePtrn.matcher(emailid);
        if(mtch.matches()){
            return true;
        }
        System.out.println("Enter a correct emailid");
        return false;
   
    }

    
    
    
    
    public static boolean validateLetters(String name) {

    	String regx = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(name);
       
        return matcher.find();

    
    }

 
    private static Pattern phonenumberpt=Pattern.compile("^\\+?[0-9. ()-]{10,25}$");
    public static boolean validatePhoneNumber(String phonenumber)
    
    {
    	
    	Matcher mtch=phonenumberpt.matcher(phonenumber);
    	if(mtch.matches())
    	{
    		//System.out.println("Phone Number Valid");
    		return true;
    	}
    	  System.out.println("Phone Number must be in the form XXX-XXXXXXX");
		return false;
    	
    }
 
    
    	
}
