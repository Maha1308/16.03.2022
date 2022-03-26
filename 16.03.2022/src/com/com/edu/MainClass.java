package com.com.edu;
//static method: it can access only static data
//any changes you want to do with static data go for static method
//static method belongs to class
//static can be called with reference to class name
//static methods cannot be inherited
//static method cannot be overridden
//

class DemoStatic{
	static int i; //variable as static->shared all objects
	int j; 
	static String college_name;
	static {
		college_name="PKIET";
	}
	
	DemoStatic(){
		System.out.println("constructor");
	}
	
	static void myMethod() {//static method can access only static data
		//j=9;//j= non static error
		System.out.println("College name="+college_name);
	}
}
public class MainClass {
 
	public static void main(String[] args) {
		System.out.println("Main");
		DemoStatic.myMethod();//way to access static method
	}

}

