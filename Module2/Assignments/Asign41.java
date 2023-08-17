package com.a028;

class Student
{
	int rollNo, age;
	String name,course;
	
	Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeEx,NameNotValidEx
	{
		this.rollNo=rollNo;
		
		if(!isAlpha(name))
		{
			throw new NameNotValidEx("Name is not valid.");
		}
		else
		{
			this.name=name;			
		}
		
		
		if(age < 15 || age>21)
		{
			throw new AgeNotWithinRangeEx("Age is not of student");
		}
		else
		{
			this.age=age;			
		}
		this.course=course;
	}
	
	 	boolean isAlpha(String name)
	 	{
	 		char[] chars = name.toCharArray();
	 		for (char c : chars)
	 		{
	 			if(!Character.isLetter(c))
	 			{
	 				return false;
	 			}
	 		}
	 		return true;
	 	}
}


public class Asign41
{
	public static void main(String args[])
	{
		try 
		{
			Student s1=new Student(1,"Sagar@",21,"BCA");
		} 
		catch (AgeNotWithinRangeEx e) 
		{
			e.printStackTrace();
		} 
		catch (NameNotValidEx e) 
		{
			e.printStackTrace();
		}
		
	}
}