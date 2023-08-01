package com.a277;

public class Asign25
{
	public static void main(String[] args)
    {
 
        Shape obj = new Shape();
        obj.Area(3);
        obj.Area(5, 4);
    }
}

class Shape
{
    void Area(float a)
    {
        float A = a * a;
        System.out.println("Area of the Square: " + A);
    }

    void Area(int a, int b)
    {
        int A = a * b;
        System.out.println("Area of the Rectangle: " + A);
    }
}