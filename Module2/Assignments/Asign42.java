package com.a028;

class S implements Runnable
{
	@Override
	public void run() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("S : "+i);
		}
	}
	
}

public class Asign42
{
	public static void main(String args[])
	{
		Thread t1 = new Thread(new S());
		
		t1.start();
	}	
}