package com.xworkz.oct11;
import com.xworkz.oct11.boot.*;
public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Tea tea=new Tea();
     System.out.println(tea.name);
     System.out.println(tea.type);
     System.out.println(tea.price);
     System.out.println(tea.color);
     System.out.println(tea.weight);
     System.out.println(tea.taste);
     System.out.println(tea.brand);
     System.out.println(tea.source);
     System.out.println(tea.place);
     
     
     
     tea.expiredate="12/12/22";
     tea.manufacturedate="12/12/14";
     tea.manufactureplace="bangalore";
     tea.benifits="mind fresh";
     tea.advantages="healthy";
     tea.disadvantages="couse disease";
     tea.uses="boost your immune system";
     
   System.out.println(tea.expiredate);
   System.out.println(tea.manufacturedate);
   System.out.println(tea.manufactureplace);
   System.out.println(tea.benifits);
   System.out.println(tea.advantages);
   System.out.println(tea.disadvantages);
   System.out.println(tea.uses);
   
   
   Tea tea1=new Tea();
   tea1.brand="nestley";
   System.out.println(tea1.brand);
   
     
	
	}

}
