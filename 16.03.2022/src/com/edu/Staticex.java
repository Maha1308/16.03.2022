package com.edu;
class studentdetails
{
	int student_Id;
	String student_name;
	static String college="PKIET";
	static void change()
	{
		college="Pondicherry University";
	}
	public studentdetails(int id, String name)
	{
		student_Id=id;
		student_name=name;
	}
	void display()
	{
		System.out.println("Student_id"+student_Id);
		System.out.println("student_Name"+student_name);
		System.out.println("college Name"+college);
		System.out.println("**********************************");
	}
}

public class Staticex {

	public static void main(String[] args) {
	studentdetails.change();
	studentdetails s1= new studentdetails(233,"maha");
	studentdetails s2=new studentdetails(232,"devi");

	}

}
