package com.a028;

import java.util.*;

public class Asign62 
{
	public static void main(String[] args) 
	{
		  ArrayList<String> s = new ArrayList<String>();
		  s.add("Red");
		  s.add("Green");
		  s.add("Orange");
		  s.add("White");
		  s.add("Black");
		  System.out.println("List before reversing :" + s);  
		  Collections.reverse(s);
		  System.out.println("List after reversing :" + s); 
	}
}