package com.a028;

import java.util.ArrayList;
import java.util.Scanner;

public class Asign51
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> l= new ArrayList<String>();
		
		l.add("Java");
	    l.add("JavaScript");
	    l.add("Python");
		
		System.out.println(l);
		
		System.out.println("Enter index to update element : ");
		int a = s.nextInt();
		
		if(a<l.size())
		{
			System.out.println("Enter new value of element : ");
			String x= s.next();
			
			l.set(a, x);
		
			System.out.println(l);
		}
		else
		{
			System.out.println("Invalid Index");
		}
		
		s.close();
	}
}