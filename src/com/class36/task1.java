package com.class36;

public class task1 {

	public static void main(String[] args) {
		// create an exception: when user it trying to withdraw larger amount that the balance
	    //throw an exception saying “You do not have enough money”
getMoney(1500);
	}
public static void getMoney(int money ) {
	if(money<1500) {
		System.out.println("Take your money");
	}else {
		throw new ArithmeticException("You do not have enough money");
	}
}
}
