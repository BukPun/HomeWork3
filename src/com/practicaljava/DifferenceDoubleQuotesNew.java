package com.practicaljava;

public class DifferenceDoubleQuotesNew {

	public static void main(String[] args) {
		/*
		 * any thing between " " is reccognized by compiler as String literal
		 * are put by compiler in String pool. then if compiler found the same literal
		 * compiler will have one copy of String literal 
		 * and will assign both to the same String literal,
		 *  (at run time one object constructed and assigned)
		 */
		String st1 = "PracticalJava";//OBJECT CREATED IN STRING POOL
		String st2 = "PracticalJava";//REFERENS TO THE SAME OBJECT IN STRING POOL ABOVE NO OBJECT CREATED
		
		System.out.print(st1 + " == " + st2 + " ");
		System.out.println(st1==st2); //true
		
		System.out.print(st1 + " =  " + st2 + " ");
		System.out.println(st1.equals(st2)); //true
		
		System.out.print("     " + System.identityHashCode(st1) + "    "); //they are
		System.out.println(System.identityHashCode(st2)); //the same object
		System.out.print("  " + st1.hashCode() + "    "); //they are
		System.out.println(st2.hashCode()); //the same object
		
		/*
		 * 
		 */
		
		
		String st3 = "PracticalJava"; //OBJECT CREATED IN STRING POOL
		String st4 = new String("PracticalJava");// OBJECT CREATED IN HEAP NOT IN POOL
		
		System.out.print(st3 + " == " + st4 + " ");
		System.out.println(st3==st4); //false
		
		System.out.print(st3 + " =  " + st4 + " ");
		System.out.println(st3.equals(st4)); //true
		
		System.out.print("     " + System.identityHashCode(st3) + "    "); //they are
		System.out.println(System.identityHashCode(st4)); //different objects
		System.out.print("  " + st3.hashCode() + "    "); 
		System.out.println(st4.hashCode()); 
	}

}
