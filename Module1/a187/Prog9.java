package com.a187;
import java.util.Scanner;

public class Prog9
{

	public static void main(String[] args)
	{
		
		int year;
		
		System.out.println("Enter a year : ");
		Scanner s=new Scanner(System.in);
		
		year=s.nextInt();
		
		if(((year%4==0) && (year%100!=0)) || (year%400==0))
		{
			System.out.println("It is a leap year");
		}
		else
		{
			System.out.println("It is not a leap yaer");
		}
		
	}

}