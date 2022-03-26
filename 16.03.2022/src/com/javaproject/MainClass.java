package com.javaproject;


class DemoStatic{
	static int i; //variable as static->shared all objects
	int j; 
	static String college_name;
	
	static {
		System.out.println("static block it is called ");
		i=1;
		college_name="PKIET";
	}
	DemoStatic(){
		System.out.println("constructor");
	}
	
}
public class MainClass {
 static {
	   System.out.println("Static1 before main");
 }
 static {
	   System.out.println("Static2 before main");
 }
	public static void main(String[] args) {
		System.out.println("Main");
		DemoStatic ob=new DemoStatic();
		DemoStatic ob1=new DemoStatic();
		System.out.println("college name="+ob.college_name);
		System.out.println("college name="+DemoStatic.college_name);
	}
}

