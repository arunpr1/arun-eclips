package com.xworkz.oct11;
 import com.xworkz.oct11.boot.*;
public class SongRunner {

	public static void main(String[] args){
	Song Song1=new Song();
	System.out.println(Song1.name);
	System.out.println(Song1.language);
	System.out.println(Song1.singer);
	System.out.println(Song1.type);
	System.out.println(Song1.lyricst);
	Song1.name="basanniba";
	Song1.language="kannada";
	Song1.singer="harikrishna";
	Song1.type="item song";
	Song1.lyricst="varsha";
	System.out.println(Song1.name);
	System.out.println(Song1.language);
	System.out.println(Song1.singer);
	System.out.println(Song1.type);
	System.out.println(Song1.lyricst);	
	}
	
	 
	
	
	
}
