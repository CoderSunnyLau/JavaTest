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
		System.out.println("�����ε��ܳ�Ϊ��" + perimeter);
	}

	@Override
	public void area() {
		double area = _long * _wide;
		System.out.println("�����ε����Ϊ��" + area);
	}

}
