package com.test;

public class Test {
	public static void main(String[] args){
		String s1 = "������";
		String s2 = new String("������");
		String s3 = "������";
		System.out.print((s1 == s2) + "," + (s1 == s3));
		int count = 0;
		count = count++;
		System.out.println(count);
	}
}
