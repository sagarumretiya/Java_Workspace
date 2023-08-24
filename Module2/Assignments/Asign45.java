package com.a028;

class S2 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("A1 : "+i);
		}
	}
}

public class Asign45
{
	public static void main(String args[])
	{  
		S2 t1=new S2();  
		  t1.start();  
		  t1.start();  
	} 
}