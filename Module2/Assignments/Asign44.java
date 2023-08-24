package com.a028;

class S3 implements Runnable
{
	@Override
	public void run()
	{	
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("S3 : "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
}

class U1 implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("U1 : "+i);
				Thread.sleep(2000);
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

public class Asign44
{
	public static void main(String args[])
	{
		Thread t1 = new Thread(new S3());
		Thread t2 = new Thread(new U1());
		
		t1.start();
		t2.start();
	}
}