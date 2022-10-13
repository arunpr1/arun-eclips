package com.xworkz.oct11.boot;

import com.xworkz.oct11.*;


public class CigaretteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cigarette cigarette =new Cigarette();
	     System.out.println(cigarette.name);
	     System.out.println(cigarette.type);
	     System.out.println(cigarette.price);
	     System.out.println(cigarette.color);
	     System.out.println(cigarette.gst);
	     System.out.println(cigarette.taste);
	     System.out.println(cigarette.brand);
	     System.out.println(cigarette.source);
	     System.out.println(cigarette.place);
	     
	     
	     
	     cigarette.expiredate="12/12/22";
	     cigarette.manufacturedate="12/12/14";
	     cigarette.manufactureplace="bangalore";
	     cigarette.benifits="mind fresh";
	     cigarette.advantages="healthy";
	     cigarette.disadvantages="couse disease";
	     cigarette.uses="venkat";
	     
	   System.out.println(cigarette.expiredate);
	   System.out.println(cigarette.manufacturedate);
	   System.out.println(cigarette.manufactureplace);
	   System.out.println(cigarette.benifits);
	   System.out.println(cigarette.advantages);
	   System.out.println(cigarette.disadvantages);
	   System.out.println(cigarette.uses);
	   
	   
	   Cigarette  cigarette1=new  Cigarette();
	   cigarette1.brand="taboco";
	   System.out.println(cigarette1.brand);
	   
	     
		
		}

		
		
	
	
	
}
