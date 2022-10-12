package com;

public class Unary {

	public static void main(String[] args) {
		int a= 15;
		int b= a-- + a++ - --a + ++a - a++ + a-- ;
		// 14 + 15	 - 14  + 15  - 16  + 15 ;			
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
}
