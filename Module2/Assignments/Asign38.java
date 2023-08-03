package com.a277;
import java.util.Scanner;

public class Asign38
{
	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int a = s.nextInt();
		
		System.out.println("Enter second number : ");
		int b = s.nextInt();
		
		try
		{
			System.out.println("Answer : "+ (a/b));
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Program Ends ");
		}
		s.close();
	}
}