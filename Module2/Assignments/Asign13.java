package com.a277;
import java.util.Scanner;

public class Asign13
{
	public static void main(String[] args)
	{
		
		int n;
		Scanner i = new Scanner(System.in);
		System.out.print("Input number: ");
		n = i.nextInt();
		System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		i.close();
	}
}