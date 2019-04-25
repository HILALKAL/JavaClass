package com.Class21;

public class Employee {

	
		/*Create a Class called Employee:
		*Create three  variables  eID , salary and set the CEO to “Sumair”
		*Create two objects of the class Employee
		*Set the value of eID, salary for each of the objects
		*Print out the eID , salary and  CEO for each of the objects
		*/
		
		int eID;
		int salary;
		String CEO="Sumair";
		
		public static void main(String[] args) {
			Employee emp1=new Employee();
			Employee emp2=new Employee();
			
			
			emp1.eID=112233;
			emp1.salary=10000;
			emp1.info();
			
			emp2.eID=442233;
			emp2.salary=20000;
			emp2.info();
			
	
	}
public void info() {
	System.out.println("Employee eID "+eID+" salary is "+salary+" and CEO is "+CEO);
}
}
