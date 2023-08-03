package com.a277;

public class Asign39
{
	static void validate(int age) throws ArithmeticException
	{
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			throw new ArithmeticException("You are not valid to Vote");
		}	
	}
	
	public static void main(String args[])
	{
		try
		{
			validate(19);
			validate(16);			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Program Ends");
		}
	}
}