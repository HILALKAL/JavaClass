package com.Class24;

public class Task3 {

	
		//Create 1 class with a private method that 
		//has 3 overloaded forms. Then call each overloaded method
		//with specific arguments and observe result. (
	    private void Example() {
		System.out.println("No parameters");
			}
		 private void Example(String str) {
			 System.out.println("With string parameters "+str);
			 	}
		 private void Example(int a) {
			 System.out.println("With int parameters "+a);
			 	}
		 public static void main(String[]args) {
			 Task3 obj=new Task3();
			 obj.Example();
			obj.Example("String");
			obj.Example(6);
			 
}	
}