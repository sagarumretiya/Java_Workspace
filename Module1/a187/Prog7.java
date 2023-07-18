package com.a187;

import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args)
	{
		
		Scanner n= new Scanner(System.in);
	    System.out.println("Enter Marks of 5 subject");
	    
	    int s1=n.nextInt();
	    int s2=n.nextInt();
	    int s3=n.nextInt();
	    int s4=n.nextInt();
	    int s5=n.nextInt();
	    
	    int t=s1+s2+s3+s4+s5;
	    int tn=500;
	    int r=(t*100)/tn;
	    
	    System.out.println("Percentage is "+(r));
	    
	}

}