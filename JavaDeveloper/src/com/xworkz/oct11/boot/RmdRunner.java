package com.xworkz.oct11.boot;

import com.xworkz.oct11.*;
public class RmdRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Rmd rmd = new Rmd();
	     System.out.println(rmd.name);
	     System.out.println(rmd.type);
	     System.out.println(rmd.price);
	     System.out.println(rmd.color);
	     System.out.println(rmd.gst);
	     System.out.println(rmd.taste);
	     System.out.println(rmd.brand);
	     System.out.println(rmd.source);
	     System.out.println(rmd.place);
	     
	     
	     
	     rmd.expiredate="12/12/22";
	     rmd.manufacturedate="12/12/14";
	     rmd.manufactureplace="bangalore";
	     rmd.benifits="mind fresh";
	     rmd.advantages="healthy";
	     rmd.disadvantages="couse disease";
	     rmd.uses="venkat";
	     
	   System.out.println(rmd.expiredate);
	   System.out.println(rmd.manufacturedate);
	   System.out.println(rmd.manufactureplace);
	   System.out.println(rmd.benifits);
	   System.out.println(rmd.advantages);
	   System.out.println(rmd.disadvantages);
	   System.out.println(rmd.uses);
	   
	   
	   Rmd rmd1=new Rmd();
	   rmd1.brand="panmasala";
	   System.out.println(rmd1.brand);
	   
	     
		
		}

		
		
	}


