package com.Class14;

public class Tasks {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable? 
		 * Swap 2 string without a temporary variable?
		 */
		
String text1="This is our 1. code meeting 234 ";
        
        
        char[] array= text1.toCharArray();
        for (int i=0;i<array.length;i++) {
            if(array[i]=='1') {
                array[i]='3';
            }else if(array[i]=='3') {
                array[i]='1';
            }
            System.out.print(array[i]);
        }
		
		System.out.println();
		
		
		/*
		 * 2.Write a java program to find the second largest number 
		 * in the array? Maximum and minimum number in the array?
		 */
		
		int[] num= {10,56,89,45,100,345,129,7,9};
        int max=num[0];
        int secMax=num[0];
        
        for(int i=0; i<num.length; i++) {
        
            if(num[i]>max) {
              max=num[i];
             }
            }System.out.println(max);
            
        for(int i=0; i<num.length; i++) {
            if(num[i]>secMax && num[i]<max) {
                secMax=num[i];
            }
        }System.out.println(secMax);
		
		
		
		
		 /*
		  * 3. Find out how many alpha characters present in a string?
		  */
		
		String str="Find out how many alpha characters present in a string?";
		String arr=str.replaceAll("[^A-Za-z]","");
		System.out.println(arr.length()-1);
		
		 
		
		
		
		
		 /* 
		 * How to find out the part of the string from a string? What is substring? 
		 * Find number of words in string?
		 */
		
		 String str1="How to find out the part of the string from a string? ";
	        
	        String[] newString=str1.split(" ");
	        System.out.println(newString.length);
	        
	        System.out.println(str1.substring(str1.length()/2));
		
		
		
		
		/*
		 * 5. Write a java program to reverse String? Reverse a string word by word?
		 */
	        
	        

	}

}
