package org.student;

import org.department.Department;

public class Student extends Department{
	public static void main(String[] args) {
		Student myCollege =new Student();
		myCollege.collegeName();
		myCollege.collegeCode();
		myCollege.collegeRank();
		myCollege.deptName();
		myCollege.studentName();
		myCollege.studentDept();
		myCollege.studentId();

		
	}
	public  void studentName()
	{
		System.out.println("Student name is dispalyed from package org.student");
	}
public void studentDept()
{
	System.out.println("Student department is diplayed from org.student");
}
public  void studentId()
{
	System.out.println("Student Id is displayed from org.student");
}
}
