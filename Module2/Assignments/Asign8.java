package com.a257;

class A
{
	void a1()
	{
		System.out.println("This is a Parent class.");
	}
}

class B extends A
{
	void b1()
	{
		System.out.println("This is a Child class.");
	}
}

public class Asign8
{
	public static void main(String[] args)
	{
		A x=new A();
		B y=new B();
		
		x.a1();
		y.b1();
		y.a1();
	}
}