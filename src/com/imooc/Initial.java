package com.imooc;

public class Initial {
	public static void main(String[] args){
		Dog dog = new Dog();
		dog.age = 35;
		Dog dog2 = new Dog();
		Animal dog3 = dog;
		dog3.eat();
		Dog dog4 = (Dog)dog3;
		System.out.println(dog.equals(dog2));
		System.out.println(dog);
	}
}
