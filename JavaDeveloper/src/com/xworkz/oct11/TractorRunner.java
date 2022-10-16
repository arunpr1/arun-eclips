package com.xworkz.oct11;

import com.xworkz.oct11.boot.*;
public class TractorRunner {
	
	public static void main(String[]args) {
		
	    Tractor tractor = new Tractor("john deer",0);
		System.out.println("tractor.name");
		
		
		Tractor tractor1 = new Tractor("john Deer",700000);
		System.out.println("tractor1.name");
		System.out.println("tractor1.price");
		

		
		Tractor tractor2 = new Tractor("john Deer",700000,"johnDeer");
		System.out.println("tractor2.name");
		System.out.println("tracto2.price");
		System.out.println("tractor2.brand");
		

		Tractor tractor3 = new Tractor("john Deer",700000,"johnDeer",15);
		System.out.println("tractor3.name");
		System.out.println("tractor3.price");
		System.out.println("tractor3.brand");
		System.out.println("tractor3.hp");
		

		Tractor tractor4=new Tractor("john Deer",700000,"johnDeer",15,"green");
		System.out.println("tractor4.name");
		System.out.println("tractor4.price");
		System.out.println("tractor4.brand");
		System.out.println("tractor4.hp");
		System.out.println("tractor4.color");
		

		Tractor tractor5 =new Tractor("john Deer",700000,"johnDeer",15,"green","new 1174");
		System.out.println("tractor4.name");
		System.out.println("tractor4.price");
		System.out.println("tractor4.brand");
		System.out.println("tractor4.hp");
		System.out.println("tractor4.color");
		System.out.println("tractor4.model");
	}

}
