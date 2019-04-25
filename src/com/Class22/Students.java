package com.Class22;

public class Students {
//	 Create a Class called Students
//	 Create three  variables  studentName , studentID  and  numberOfStudents
//	 Create three objects of the Students Class
//	 Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	 Print out  total number of students
	String studentName;
	int studentID;
	static int numberOfStudents;
	
	public static void main(String[]args) {
		Students std1=new Students();
		std1.studentName="Kemal";
		std1.studentID=12345;
		numberOfStudents++;
		
		Students std2=new Students();
		std2.studentName="Zulal";
		std2.studentID=12346;
		numberOfStudents++;
		
		Students std3=new Students();
		std3.studentName="Meral";
		std3.studentID=12347;
		numberOfStudents++;
		
		System.out.println("Total number of students "+numberOfStudents);
		
	}
}
