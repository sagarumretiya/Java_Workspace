package com.a028;

class S1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("S1 : "+i);
		}
	}
}

public class Asign43
{
	public static void main(String asdf[])
	{
		S1 a1=new S1();
		
		a1.start();
	}
}