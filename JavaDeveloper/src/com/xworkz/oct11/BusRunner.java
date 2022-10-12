package com.xworkz.oct11;

import com.xworkz.oct11.boot.*;

public class BusRunner {
	public static void main(String[] args) {
		Bus ksrtc = new Bus();
		System.out.println(ksrtc.busNo);
		System.out.println(ksrtc.starting);
		System.out.println(ksrtc.destination);
		
		ksrtc.busNo=123445;
		ksrtc.starting="davanagere";
		ksrtc.destination="bengaluru";
		System.out.println(ksrtc.busNo);
		System.out.println(ksrtc.starting);
		System.out.println(ksrtc.destination);
		
		
		
		
	}

}
