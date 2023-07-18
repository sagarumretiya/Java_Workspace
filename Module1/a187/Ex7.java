package com.a187;

public class Ex7
{

	public static void main(String[] args)
	{
		
		int n= 987654, rev= 0;  
		while(n!= 0)   
		{  
		int remainder = n % 10;  
		rev= rev * 10 + remainder;  
		n=n/10;  
		}  
		System.out.println("The reverse of the given number is: " + rev);

	}

}