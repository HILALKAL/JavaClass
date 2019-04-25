package com.Class26;

public class BankTest {

	public static void main(String[] args) {
		Bank obj=new BankA();
		System.out.println("BankA deposit is "+obj.getBalance());

		Bank obj1=new BankB();
		System.out.println("BankB deposit is "+obj1.getBalance());
		
		Bank obj2=new BankC();
		System.out.println("BankC deposit is "+obj2.getBalance());
	}

}
