package com.a277;

public class Asign24
{
	public void print(int num, char ch)
	{
        System.out.println("Integer: " + num + ", Character: " + ch);
    }

    public void print(char ch, int num)
    {
        System.out.println("Character: " + ch + ", Integer: " + num);
    }
	
	public static void main(String[] args)
	{
		
		Asign24 obj = new Asign24();
        obj.print(10, 'A');
        obj.print('B', 20);
		
	}
}