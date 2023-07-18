package com.a187;

public class Ex10{

	public static void main(String[] args)
	{
		
		int n = 502356997;
        int FD = 0;
        int LD = 0;
 
        LD = n%10;
        System.out.println("Last digit: "+LD);
 
        while(n!=0) {
            FD = n%10;
            n /= 10;
        }
        System.out.println("First digit: "+FD);
        
        int sum=LD-FD;
        System.out.println("Summation of first and last digit is: "+(sum));

	}

}