package com.shape;

public class Rectangle extends Shape {
	double _long;
	double _wide;
	public Rectangle(double _long, double _wide){
		this._long = _long;
		this._wide = _wide;
	}
	@Override
	public void perimeter() {
		double perimeter = (_long + _wide) * 2;
		System.out.println("长方形的周长为：" + perimeter);
	}

	@Override
	public void area() {
		double area = _long * _wide;
		System.out.println("长方形的面积为：" + area);
	}

}
