package com.a277;

public class Asign36
{
	public static void main(String asdf[])
	{
		try
		{
			int a[] = new int[5];
			
			a[5]= 30/2;
			
			//a[3]=30/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}