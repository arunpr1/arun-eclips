package com.xworkz.oct11;
import com.xworkz.oct11.boot.*;

public class BoatRunner {

	public static void main(String[] args) {
		
		Boat boat=new Boat();
		System.out.println(boat.name);
		System.out.println(boat.type);
		System.out.println(boat.companyName);
		System.out.println(boat.color);
		System.out.println(boat.owner);
		
		boat.name="Bluetooth";
		boat.companyName="Boat";
		boat.color="Red";
		boat.owner="NTR";
		
		System.out.println(boat.name);
		System.out.println(boat.companyName);
		System.out.println(boat.color);
		

	}

}
