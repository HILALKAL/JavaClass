package com.Class14;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new String without any spaces.

			Create a String that should be combination of letters, numbers and special characters. Find out how many alpha characters are there in the String.
			
			You have a String a=“Is it saturday! Is it raining! Do we have a Java Class today?” How would you find out how many sentences are in that String?
					 */

		String str="Welcome Syntax Students Batch 4";
		String newString= str.replace(" ","");
		System.out.println(newString);
		
		System.out.println();
		
		String str1="Welcome Syntax Students Batch 4#$$%^*%%";
		String newString1= str1.replaceAll("[^A-Za-z]","");
		System.out.println(newString1.length());
		System.out.println();
		
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String []array=a.split("[?]");
		System.out.println(array.length);
	}

}
