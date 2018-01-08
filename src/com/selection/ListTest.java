package com.selection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public List coursesSelect;
	public ListTest(){
		this.coursesSelect = new ArrayList();
	}
	
	public void courseAdd(){
		Course c1 = new Course(1, "Math");
		coursesSelect.add(c1);
		Course temp = (Course) coursesSelect.get(0);
		System.out.println(temp.id + "," + temp.name);
		Course c2 = new Course(2, "C");
		coursesSelect.add(0, c2);
		Course temp2 = (Course) coursesSelect.get(0);
		System.out.println(temp2.id + "," + temp2.name);
	}
	
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.courseAdd();
	}
}
