package com.book;
import java.util.Scanner;

public class Rent extends Exception {
	Rent rent = new Rent();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		String[] books = {"JavaScript", "Java", "JavaWeb", "Python", "PHP", "C"};
		
		// step
		System.out.println("Welcome to library and please input 1 or 2 to choose the way to search book:\n1.book No., 2.book name:");
		
	}
	
	public int inputNum(int num) throws Exception {
		num = input.nextInt();
		return num;
	}
}
