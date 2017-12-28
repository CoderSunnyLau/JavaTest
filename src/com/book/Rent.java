package com.book;
import java.util.Scanner;

public class Rent{
	static Scanner input = new Scanner(System.in);
	static String[] books = {"JavaScript", "Java", "JavaWeb", "Python", "PHP", "C"};
	public static void main(String[] args){
		int type;
		
		// step
		System.out.println("Welcome to library!\nPlease input 1 or 2 to choose the way to search book:\n1.book No., 2.book name:");
		type = toInt(2, "Please input 1 or 2 to choose the way to search book:\n1.book No., 2.book name:");
		
		System.out.println("type: " + type);
		search(type);
		input.close();
	}
	
	static int toInt(int max, String msg){
		String target;
		int num;
		try{
			target = input.next();
			num = Integer.parseInt(target);
			if(num <= 0 || num > max){
				System.out.println("Please input 1~" + max + ".");
				num = toInt(max, msg);
			}
		}catch(Exception e){
			System.out.println("No. must be a number.");
//			System.out.println(e);
			num = toInt(max, msg);
		}
		return num;
	}
	
	static void searchByNum(){
		System.out.println("Input the book's No.: ");
		int num = toInt(books.length, "Please input ");
		System.out.println("Book: " + books[num - 1]);
	}
	
	static void searchByName(){
		System.out.println("What book do you want to rent? Please input it's name: ");
		String target = input.next();
		String name = "";
		for(int i = 0; i < books.length; i++){
			if(target.equals(books[i])){
				name = target;
				break;
			}
		}
		if(name == ""){
			System.out.println("Sorry, there is not a book named '" + target + "', please try again.");
			searchByName();
		}else{
			System.out.println("Book: " + target);
		}
	}
	static void search(int type){
		switch(type){
			case 1: searchByNum();break;
			case 2: searchByName();break;
		}
	}
}
