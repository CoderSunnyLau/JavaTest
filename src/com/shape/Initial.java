package com.shape;

public class Initial {
	public static void main(String[] args){
		Shape circle1 = new Circle(3);
		circle1.perimeter();
		Circle circle2 = new Circle(1);
		circle2.perimeter();
		circle2.area();
		Shape rect = new Rectangle(4, 5);
		rect.perimeter();
		rect.area();
	}
}
