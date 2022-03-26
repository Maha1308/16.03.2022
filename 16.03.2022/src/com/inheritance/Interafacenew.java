package com.inheritance;
interface myInt{
	void m1();
	default void m2()
	{
		System.out.println("m2 method implementation");
	}
	static void m3()
	{
		System.out.println("m3 static mehthod ");
	}
	
}
class myclass implements myInt
{
	public void m1()
	{
		System.out.println("m1 interface abstract method");
	}
}

public class Interafacenew {

	public static void main(String[] args) {
		myclass ob=new myclass();
		ob.m1();
		ob.m2();
		myInt.m3();

	}

}
