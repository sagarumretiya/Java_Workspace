package com.a277;
import java.util.*;

public class Asign31
{	
    public static void main(String[] args)
    {
    	System.out.println("Enter 1 number");
    	try (Scanner s = new Scanner(System.in))
    	{
			int r=s.nextInt();
			int fact = 1,i;
			
			if(r == 0)
			 {
				 fact=0;
			 }
			 else
			 {
				 for(i=1;i<=r;i++)
				 {    
					 fact=fact*i;    
				 }        
			 }      	
			System.out.println("Factorial of " + r + " is " + fact);
		}
    }
}