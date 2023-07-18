package com.a187;
import java.util.Scanner;

public class Prog8 {

	public static void main(String[] args)
	{
		
		Scanner n= new Scanner(System.in);
	    System.out.println("Enter the Number");
	    
	    int a=n.nextInt();
	    
	    if(a>=0)
	    {
	    	System.out.println("Number is positive");
	    }
	    else
	    {
	    	System.out.println("Number is Negative");
	    }

	}

}
