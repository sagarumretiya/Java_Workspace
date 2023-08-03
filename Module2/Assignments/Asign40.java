package com.a277;

public class Asign40
{
	static void withdraw(int balance, int amt) throws Exception
	{
		if(amt<=balance)
		{
			System.out.println("Withdraw Successful. Balance : "+ (balance-amt));
		}
		else
		{
			System.out.println("Insufficient Balance . Need "+(amt-balance)+" to perform action.");
			throw new Exception("Insufficient balance error.");
		}
	}
	
	public static void main(String args[])
	{
		try
		{
			withdraw(2000,2500);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}