package com.shape;

public class Circle extends Shape {
	final double PI;
	double _radius;
	public Circle(double _radius){
		PI = 3.14;
		this._radius = _radius;
	}
	@Override
	public void perimeter(){
		double perimeter = 2 * PI * _radius;
		System.out.println("Բ�ε��ܳ��ǣ�" + perimeter);
	}
	
	@Override
	public void area(){
		double area = PI * (_radius * _radius);
		System.out.println("Բ�ε�����ǣ�" + area);
	}
}
