package com.date;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Dt {
	public static void main(String[] args){
		Date d = new Date();
		SimpleDateFormat dsf = new SimpleDateFormat("yy-MM-dd DD HH:mm:ss");
		System.out.println(dsf.format(d));
	}
}
