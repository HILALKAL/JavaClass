package com.Class22;

public class Task1 {
	/*
	 * Write a program that will have a constructor: 
	 * one with parameters and second without any parameters.
	 *  Create a separate Test class where you will execute both of the constructors.
	 */
	public String name;
	
    public Task1(String str){
    	System.out.println("My name is "+str);
    	name=str;
    	
    }
    Task1(){
    	System.out.println("without any parameters");
    }
	

}
