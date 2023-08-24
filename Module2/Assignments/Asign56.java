package com.a028;

import java.util.ArrayList;
import java.util.Collections;

public class Asign56
{
	public static void main(String args[])
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("JavaScript");
	    l.add("Java");
	    l.add("Python");
	    System.out.println(l);
	    
	    Collections.shuffle(l);
	    
	    System.out.println(l);
	}
}