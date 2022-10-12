package com.xworkz.oct11;
import com.xworkz.oct11.boot.*;

public class DistrictCollectorRunner {
	
	public static void main(String[]args) {
		 DistrictCollector davanagere = new  DistrictCollector();
		 
		 System.out.println(davanagere.name);
		 System.out.println(davanagere.age);
		 System.out.println(davanagere.district);
		 System.out.println(davanagere.batchNo);
		 
		 
		 davanagere.name="arun";
		 davanagere.age=35;
		 davanagere.district="davanagere";
		 davanagere.batchNo=111;
	}

}
