package com.a277;

public class Asign29
{
	public static void main(String[] args)
	{
        BankA bA = new BankA();
        bA.getBalance();

        BankB bB = new BankB();
        bB.getBalance();

        BankC bC = new BankC();
        bC.getBalance();
    }
}

abstract class Bank
{
	public abstract void getBalance();
}

class BankA extends Bank
{
	public void getBalance()
	{
		System.out.println("Deposited: $100 ");
	}
}

class BankB extends Bank
{
	public void getBalance()
	{
		System.out.println("Deposited: $150 ");
	}
}

class BankC extends Bank
{
	public void getBalance()
	{
		System.out.println("Deposited: $200 ");
	}
}