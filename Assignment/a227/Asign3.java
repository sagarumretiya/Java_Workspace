package com.a227;
import java.util.Scanner;

public class Asign3
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);

        System.out.print("Input the year: ");
        int year = n.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
	}
}