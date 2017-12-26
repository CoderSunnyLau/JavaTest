package com.imooc;

public class Animal {
	public int age;
	public String name;
	public void eat(){
		System.out.println("they can eat." + age + "," + name);
	}
	public Animal(){
		this.age = 34;
	}
	public Animal(int age){
		this.age = age;
	}
}
