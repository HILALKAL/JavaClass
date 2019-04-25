package com.Class24;

public class Task2 {
	// Create 1 class with a static method 
	//that has 3 overloaded forms. 
	//Then call each overloaded method with specific arguments 
	//and observe result.
 static void Example() {
System.out.println("No parameters");
	}
 static void Example(String str) {
	 System.out.println("With string parameters "+str);
	 	}
 static void Example(int a) {
	 System.out.println("With int parameters "+a);
	 	}
 public static void main(String[]args) {
	 Example();
	 Example("String");
	 Example(6);
	 
 }
	
}
