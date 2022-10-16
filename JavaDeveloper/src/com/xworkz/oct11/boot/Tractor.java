package com.xworkz.oct11.boot;

public class Tractor {
	public String name;
	public String brand;
	public int price;
	public String color;
	public double hp;
	public int model;
	
	public Tractor(String name) {
		this.name=name;
		System.out.println("this constructor is printing only name");
	}	

	public Tractor(String name,int price) {
		this(name);
		this.price=price;
		System.out.println("this constructor is printing both name and price");
	}	

	public Tractor(String name,int price,String brand) {
		this(name,price);
		this.brand=brand;
		System.out.println("this constructor is printing name,price and brand");
	}		

	public Tractor(String name,int price,String brand,int hp) {
		this(name,price,brand);
		this.hp=hp;
		System.out.println("this constructor is printing name,price,brand and hp");
	}		

	public Tractor(String name,int price,String brand,int hp,String color) {
		this(name,price,brand,hp);
		this.color=color;
		System.out.println("this constructor is printing name,price,brand,hp,and color");
	}		

	public Tractor(String name,int price,String brand,int hp,String color,String model1) {
		this(name,price,brand,hp,color);
		this.model=model;
		System.out.println("this constructor is printing name,price,brand,hp,and color and model1");
	}		
		
		
		
	

}
