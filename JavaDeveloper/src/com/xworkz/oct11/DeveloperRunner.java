package com.xworkz.oct11;
import com.xworkz.oct11.boot.*;
public class DeveloperRunner {

	public static void main (String[]args) {
		
		Developer Developer1=new Developer();
	   System.out.println(Developer1.name);
	   System.out.println(Developer1.education);
	   System.out.println(Developer1.experience);
	   System.out.println(Developer1.salary);
	   System.out.println(Developer1.company);
	   
	   
	   Developer1.name="arun";
	   Developer1.education="engineering";
	   Developer1.experience=5;
	   Developer1.salary=300000;
	   Developer1.company="tcs";
	   System.out.println(Developer1.name);
	   System.out.println(Developer1.education);
	   System.out.println(Developer1.experience);
	   System.out.println(Developer1.salary);
	   System.out.println(Developer1.company);
	   
	   
	}
	
}
