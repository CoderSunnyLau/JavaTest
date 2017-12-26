package com.transportation;

public class Transportation {
	public Transportation(){
		transType = "land";
		seatNum = 1;
	}
	
	String name;
	String transType;
	int seatNum;
	
	public void getTransType(){
		System.out.println("交通方式为：" + transType);
	}
	
	public void getSeatNum(){
		System.out.println("载客数为：" + seatNum);
	}
	
	public void getTrans(){
		System.out.println("交通工具：" + name + "\n交通方式为：" + transType + "\n载客数为：" + seatNum + "\n****************");
	}
}
