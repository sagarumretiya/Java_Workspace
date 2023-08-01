package com.a277;

public class Asign27
{
	double real;
	double imag;
	
	public Asign27(double a, double b) 
	{
		this.real = a;
		this.imag = b;
	}
	
	public static void main(String[] args) 
	{
		Asign27 b42 = new Asign27(4.6, 8.10),b43 = new Asign27(6.8, 10.00),
		temp;
		
		temp = add(b42,b43);
		System.out.printf("Sum = %.1f + %.1fi", temp.real, temp.imag);
	}
	public static Asign27 add(Asign27 b42, Asign27 b43)
	{
		Asign27 temp = new Asign27(0, 0);
		temp.real = b42.real + b43.real;
		temp.imag = b42.imag + b43.imag;
		return (temp);
	}
}