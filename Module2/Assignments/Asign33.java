package com.a277;

class Shape
{
	public void print()
	{
		System.out.println("This is a shape.");
	}
}

class Rectangle extends Shape
{
	public void print()
	{
		System.out.println("This is a rectangle.");
		super.print();
	}
}

class Circle extends Shape
{
	public void print()
	{
		System.out.println("This is a circle.");			
	}
}

class Square extends Rectangle
{
	public void print()
	{
		System.out.println("Square is a rectangle.");
	}
}

public class Asign33
{
	public static void main(String asdf[])
	{
		Square s1 = new Square();
		
		
		s1.print();
		s1.print();

	}
}