package com.a277;

abstract class Shap
{
	abstract double rectangleArea(double len, double wid);
	abstract double squareArea(double side);
	abstract double circleArea(double radius);
}

class Area extends Shap
{
	double rectangleArea(double len, double wid)
	{
		return len*wid;
	}

	double squareArea(double side)
	{
		return side*side;
	}

	double circleArea(double radius)
	{
		return 3.14*radius*radius;
	}
}

public class Asign32
{
	public static void main(String args[])
	{
		Area a1=new Area();
		
		System.out.println("Area of Rectangle : "+(a1.rectangleArea(3.0, 4.0)));
		System.out.println("Area of Square : "+(a1.squareArea(5.0)));
		System.out.println("Area of Circle : "+(a1.circleArea(3.0)));
	}
}