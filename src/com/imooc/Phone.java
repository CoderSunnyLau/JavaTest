package com.imooc;

public class Phone {
	// 
	static float screen;
	float cpu;
	float mem;
	// methods
	static void call(){
		System.out.println("");
	}
	void send(){
		System.out.println("send");
	}
	void thisPhone(){
		System.out.println("screen:" + screen + ", cpu:" + cpu + ", mem:" + mem);
	}
}
