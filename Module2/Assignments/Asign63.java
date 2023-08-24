package com.a028;

import java.util.ArrayList;
import java.util.List;

public class Asign63
{
	public static void main(String[] args) 
	{
		  ArrayList<String> s = new ArrayList<String>();
		  
		  s.add("Red");
		  s.add("Green");
		  s.add("Orange");
		  s.add("White");
		  s.add("Black");
		  
		  System.out.println("Original list: " + s);
		  List<String> l = s.subList(0, 3);
		  System.out.println("List of first three elements: " + l);
	}
}