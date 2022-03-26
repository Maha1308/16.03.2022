package com.edu2;
//static block it is used to initialze static data
//it is called before any object creation


class demostatic{
	static int i; //variable as static->shared all objects
	int j; 
	
	static {
		System.out.println("static block it is called ");
		i=1;
	}
	demostatic(){
		System.out.println("constructor");
	}
	
}
public class MainClass1 {
 static {
	   System.out.println("Static1 before main");
 }
 static {
	   System.out.println("Static2 before main");
 }
	public static void main(String[] args) {
		System.out.println("Main");
		demostatic ob=new demostatic();
	}

}
