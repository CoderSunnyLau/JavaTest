package com.hire;
import java.util.Scanner;

public class Hire {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		int quantity;
		int day;
		int num;
		int k = 1;
		double payment;
		Car[] cars = {
			new Car(k++, "audi", 380, 5), 
			new Car(k++, "bmw", 420.88, 5), 
			new Car(k++, "jeep", 390.6, 5),
			new Car(k++, "smart", 288, 2)
		};
		Hire hire = new Hire();
		System.out.println("Please choose a car:\n-------------------------------------\nNo.  CarName  Price(day/yuan)");
		for(int i = 0; i < cars.length; i++){
			System.out.println(cars[i].num + "     " + cars[i].name + "       " + cars[i].price);
		}
		
		System.out.println("-------------------------------------\nChoose a car and input it's No.:");
		num = hire.step(cars.length);
		
		System.out.println("-------------------------------------\nPlease input the number of cars you want:");
		quantity = hire.step(5);
		
		System.out.println("-------------------------------------\nHow many days do you want to rent?:");
		day = hire.step(7);
		
		System.out.println("-------------------------------------\nThere is your bill in the following:");
		payment = cars[num - 1].price * quantity * day;
		System.out.println(
			"No.: " + num + 
			"\nCarName: " + cars[num - 1].name + 
			"\nPrice: " + cars[num - 1].price + 
			"\nQuantity: " + quantity + 
			"\nday: " + day + 
			"\nPayment: " + payment
		);
		
		input.close();
	}
	public Boolean isNum(String str){
		try{
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
//			System.out.println(e);
			return false;
		}
	}
	public int loop(int max){
		Hire hire = new Hire();
		String msg = "";
		String target;
		target = input.next();
		int intTarget = 0;
		if(!hire.isNum(target)){
			msg = "Please input a number: ";
		}else{
			intTarget = Integer.parseInt(target);
			if(intTarget <= 0 || intTarget > max){
				msg = "Please input 1~" + max + ": ";
			}else{
				msg = "";
			}
		}
		if(msg != ""){
			System.out.println(msg);
			intTarget = hire.loop(max);
		}else{
			intTarget = Integer.parseInt(target);
		}
//		input.close();
		return intTarget;
	}
	public int step(int max){
		int intTarget;
		Hire hire = new Hire();
		intTarget = hire.loop(max);
		return intTarget;
	}
}
