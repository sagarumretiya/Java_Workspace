package com.a187;

public class Ex9
{

	public static void main(String[] args)
	{
		int a = 5678;
		
		int sum=0;
		
		while(a!=0)
		{
			sum = sum + a%10;
			
			a=a/10;
		}
		
		System.out.println("Summation is : "+ sum);

	}

}
