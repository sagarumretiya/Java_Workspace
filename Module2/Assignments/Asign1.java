package com.a227;
import java.util.Scanner;

public class Asign1
{
	public static void main(String[] args)
	{
		int a,b,c;
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the first number:");  
		a = sc.nextInt();  
		System.out.println("Enter the second number:");  
		b = sc.nextInt();  
		System.out.println("Enter the third number:");  
		c = sc.nextInt();  
		
		if(a>=b && a>=c)
		{
			System.out.println(a+" is the largest Number");  
		}
		else if(b>=a && b>=c)
		{		
			System.out.println(b+" is the largest Number");
		}
		else
		{  
			System.out.println(c+" is the largest number");
		}
	}
}