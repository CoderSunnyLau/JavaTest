package com.transportation;

public class Initial {
	public static void main(String[] args){
		Transportation plane = new Plane();
//		plane.getTrans();
		Transportation bike = new Bike();
//		bike.getTrans();
		Transportation bus = new Bus();
//		bus.getTrans();
		Transportation car = new Car();
//		car.getTrans();
		Transportation ship = new Ship();
//		ship.getTrans();
		Transportation trans = bike;
		Bike bike2 = (Bike)trans;
		if(trans instanceof Car){
			System.out.println("可转换");
		}else{
			System.out.println("不可转换");
		}
	}
}
