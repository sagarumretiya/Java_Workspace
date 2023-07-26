package com.a257;

class Member
{
	int Data_member;
	String name;
    int age;
    String phoneNumber;
    String address;
    int salary;
    
    public Member(int Data_member , String name, int age, String phoneNumber, String address, int salary)
    {
    	this.Data_member=Data_member;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    public void printSalary()
    {
    	System.out.println("Data Member " + Data_member);
    	System.out.println("Name " + name);
    	System.out.println("Age " + age);
    	System.out.println("PhoneNo. " + phoneNumber);
    	System.out.println("Address " + address);
        System.out.println("Salary " + salary);
    }
}

public class Asign9
{
	public static void main(String[] args)
	{
		Member n=new Member(1,"Sagar",21,"1234567890","Rajkot",90000);
		
		n.printSalary();
	}
}