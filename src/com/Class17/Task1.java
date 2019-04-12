package com.Class17;

public class Task1 {
	
	

	public static void main(String[] args) {
		/*
		 * Create a method that will take 
		 * 2 parameters as a numbers and prints 
		 * which number is larger.
		*/
		
		Task1 obj=new Task1();
		obj.findLargest(12,32);
		obj.evenOddNum(11);
		
	}
        void findLargest(int a,int b) {
			
			if(a>b) {
				System.out.println("a is larger than b");
			}else {
				System.out.println("b is larger than a");
			}
        }
       	
		/*Create a method that will take a number
		 *and prints whether the number is even or odd.
		 */
		
		void evenOddNum(int i) {
			if(i%2==0) {
				 System.out.println("a is  even number");
	        }else {
	            System.out.println("a is odd number");
	        }
	    }
			
		
		/*Create a method that will print 
		 * whether given String is palindrome or not.
		 */

	}


