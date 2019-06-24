package com.Class27;

/*
 * Create a class File that will have the following behaviors: 
 * open, edit, close. 
 * Edit and close are implemented method while open is an abstract. 
 * Create 3 subclasses: JavaFile, WordFile, PDFFile 
 * that will provide specific implementation of open behaviour:
 * Exmaple: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed
 */
public abstract class File {

	public abstract void open();

	public void edit() {
		System.out.println("you can edit");
	}

	public void close() {
		System.out.println("you can close ");
	}

	public static void main(String[] args) {
		File obj=new JavaFile();
		obj.edit();
		obj.close();
		obj.open();
		
		File obj1=new WordFile();
		obj1.edit();
		obj1.close();
		obj1.open();
		
		File obj2=new PDFFile();
		obj2.edit();
		obj2.close();
		obj2.open();
	}

}

class JavaFile extends File {
	public void open() {
		System.out.println("to open .java file we need notepad++ or sublime tex");
	}
}

class WordFile extends File {
	public void open() {
		System.out.println("to open .doc file we need Microsoft word to be installed");
	}
}

class PDFFile extends File {
	public void open() {
		System.out.println("to open .PDF file we need PDF to be installed");

	}
}
