package com.a028;
import java.util.ArrayList;

public class Asign48
{
	public static void main(String[] args)
	{
	    ArrayList<String> l = new ArrayList<>();
	    l.add("Java");
	    l.add("JavaScript");
	    l.add("Python");
	    System.out.println("ArrayList: " + l);

	    System.out.println("Iterating over ArrayList using for loop: ");

	    for(int i=0; i<l.size(); i++)
	    {
	      System.out.print(l.get(i));
	      System.out.print(" ");
	    }
	}
}