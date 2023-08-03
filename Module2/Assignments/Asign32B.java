package com.a277;
import java.util.Scanner;

public class Asign32B
{
	static void gradeMethod(int marks)
	{
		if(marks>90 && marks <101)
		{
			System.out.println("Grade : A");
		}
		else if(marks<=90 && marks > 80)
		{
			System.out.println("Grade : B");
			
		}
		else if(marks<=80 && marks >70)
		{
			System.out.println("Grade : C");
		}
		else if(marks <=70 && marks>60)
		{
			System.out.println("Grade : D");
		}
		else if(marks <=60 && marks > 50)
		{
			System.out.println("Grade : DD");
		}
		
		else if(marks <=50 && marks>40)
		{
			System.out.println("Grade : E");
		}
		else
		{
			System.out.println("Grade : Fail");
		}
	}
	
	public static void main(String asdf[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter user marks: ");
		int marks = s.nextInt();
		gradeMethod(marks);
		s.close();
	}
}