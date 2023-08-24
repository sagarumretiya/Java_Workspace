package com.a028;

import java.util.ArrayList;
import java.util.Scanner;

public class Asign50
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> l= new ArrayList<String>();
		
		l.add("Java");
	    l.add("JavaScript");
	    l.add("Python");
		
		System.out.println(l);
		
		System.out.println("Enter index of the element : ");
		int a = s.nextInt();
		
		if(a<l.size())
		{
			System.out.println(l.get(a));
		}
		else
		{
			System.out.println("Invalid Index");
		}
		
		s.close();
	}
}