package com.a028;

import java.util.ArrayList;

public class Asign55
{
	public static void main(String args[])
	{
		ArrayList<String> l = new ArrayList<>();
		
		l.add("JavaScript");
	    l.add("Java");
	    l.add("Python");
	    System.out.println(l);
	    
	    ArrayList<String> b= new ArrayList<>(l);
	    
	    System.out.println(b);
	}
}