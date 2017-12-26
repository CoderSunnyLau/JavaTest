package com.imooc;

public class Dog extends Animal{
	public void eat(){
		int age = 20;
		System.out.println("age:" + super.age);
	}
	public void watch(){
		System.out.println("watch");
	}
	public Dog(){
		super();
		this.age = 3;
	}
	//Override
	public String toString(){
		return "Dog{age:" + age + ", name:" + name + "}";
	}
	//Override 
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Dog other = (Dog)obj;
		if(age != other.age)
			return false;
		return true;
	}
}
