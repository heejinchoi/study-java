package ch11.api;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj = new Object();
		Date date = new Date();
		
		System.out.println(obj.toString());
		System.out.println(date.toString());
	}
}
