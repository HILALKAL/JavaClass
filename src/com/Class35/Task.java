package com.Class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * How would handle InputMismatchException?
		 * Input Mismatch Exception when user enters mismatch value then programmer expected.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number.");
		
		try {
			int num=scan.nextInt();
			System.out.println(num);
		}catch(InputMismatchException e) {
			System.out.println("Wrong!Please enter a number. ");
		}
	}

}
