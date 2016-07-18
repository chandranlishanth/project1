package com.flp.ems.domain;

import com.flp.ems.view.Userinteraction;

public class Employee {
	private String name,id,emailid,dob,doj,project,role,department,address;
	private long phonenumber;

	public static void main(String[] args) 
	{
    
    }
	



public void setName(String name){  
this.name=name;
}  
public String getName(){  
return name;  

}  


public String getKinid(){  
return id;  

}  
public void setKinid(String id){  
this.id=id;
}  
 
public String getemailid(){  
return emailid;  

}  
public void setemailid(String emailid){  
this.emailid=emailid;
} 

public long getphonenumber(){  
return phonenumber;  

}  
public void setphonenumber(long phonenumber){  
this.phonenumber=phonenumber;
} 


public String getdob(){  
return dob;  

}  
public void setdob(String dob){  
this.dob=dob;
} 

public String getdoj(){  
return doj;  

}  
public void setdoj(String doj){  
this.doj=doj;
} 

public String getaddress(){  
return address;  

}  
public void setaddress(String address){  
this.address=address;
}




public void setDepartment(String department) {
	this.department=department;
}

public String getDepartment(){  
return department;  

}  


public void setrole(String role) {
this.role=role;
	
}
public String getrole(){  
return role;  

}  




public void setproject(String project) {
	this.project=project;
} 


public String getproject(){  
return project;  

}  
}