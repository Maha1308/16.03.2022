package com.edu;

abstract class area
{
	area()
	{
		System.out.println("abstract class can have constructor");
	}
	void display()
	{
		System.out.println("method with the body");
	}
}
class reactangle extends area
{
	void calarea()
	{
		int l=8;
		int b=2;
		int area=l*b;
		System.out.println("area of reactangle"+area);
	
	}
}
public class Abstraction {

	public static void main(String[] args) {
	reactangle ob= new reactangle();
	ob.calarea();

	}

}
