package com.a277;
import java.util.Scanner;

public class Asign35
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2 number: ");
		int n1=s.nextInt();
		int n2=s.nextInt();
		
        try
        {
        int data=n1/n2;
        }

        catch(Exception e)
        {
            System.out.println(e);
        }
        s.close();
    }
}