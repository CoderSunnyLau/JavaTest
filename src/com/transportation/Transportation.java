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
		System.out.println("��ͨ��ʽΪ��" + transType);
	}
	
	public void getSeatNum(){
		System.out.println("�ؿ���Ϊ��" + seatNum);
	}
	
	public void getTrans(){
		System.out.println("��ͨ���ߣ�" + name + "\n��ͨ��ʽΪ��" + transType + "\n�ؿ���Ϊ��" + seatNum + "\n****************");
	}
}
