package com.Class26;
//Write program in class A has final display method 
//and try overload and override this method and 
//observe result .
public class A {
public final void display() {
	System.out.println(" no parameters");
}
public final void display(int i) {
	System.out.println(" with parameters");
}

	public static void main(String[] args) {
		A obj=new A();
		obj.display();
		obj.display(3);
	}

}

class B extends A{
	//public final void display() {
	//	System.out.println(" Test no parameters");
	//}	
}
