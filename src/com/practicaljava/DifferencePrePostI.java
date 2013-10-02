package com.practicaljava;

public class DifferencePrePostI {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 1;
		
		System.out.println("A = " + a + " B = "+ b);
		System.out.println("B=++A");
		b = ++a; //at first increases a on 1, then b = a
		System.out.println("A = " + a + " B = "+ b);
		
		System.out.println("B=A++");
		b = a++; //at first b = a, then increases a on 1
		System.out.println("A = " + a + " B = "+ b);

	}

}
