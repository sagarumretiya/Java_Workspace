package com.a028;
import java.util.*;

public class Asign65 
{
	public static void main(String[] args) 
	{
		   ArrayList<String> c1= new ArrayList<String>();
		          c1.add("Red");
		          c1.add("Green");
		          c1.add("Black");
		          c1.add("White");
		          c1.add("Pink");

		  System.out.print("Array list before Swap: ");

		  for(String a: c1)
		  {
			  System.out.print(a+" ");
		  }
		  System.out.println();

		  Collections.swap(c1, 0, 2);
		  System.out.print("Array list after swap: ");
		  
		  for(String b: c1)
		  {
		      System.out.print(b+" ");
		  }
	}
}