package com.a187;

public class Ex8
{

	public static void main(String[] args)
	{
		
		int a = 285901;
		
		int max = a%10;
		
		while(a!=0)
		{
			if(a%10 > max)
			{
				max=a%10;
			}
			
			a=a/10;
		}
		
		System.out.println("Maximum digit is : "+(max));

	}

}