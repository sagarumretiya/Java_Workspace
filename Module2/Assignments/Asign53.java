package com.a028;

import java.util.ArrayList;
import java.util.Scanner;

public class Asign53
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<String> l= new ArrayList<String>();
		
		l.add("Java");
	    l.add("JavaScript");
	    l.add("Python");
		
		System.out.println(l);
		
		System.out.println("Enter element to search : ");
		
		String x= s.next();
		
		System.out.println(l.indexOf(x));
		
		s.close();
	}
}