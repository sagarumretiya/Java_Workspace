package com.a028;
import java.util.ArrayList;

public class Asign66 
{
	public static void main(String args[])
    {
  
        ArrayList<String>list1 = new ArrayList<String>();

        list1.add("Geeks");
        list1.add("For");
        list1.add("ForGeeks");

        System.out.println("ArrayList 1: " + list1);

        ArrayList<String>list2 = new ArrayList<String>();
  
        list2.add("GeeksForGeeks");
        list2.add("A computer portal");

        System.out.println("ArrayList 2: "+ list2);

        list1.addAll(list2);

        System.out.println("Joined ArrayLists: "+ list1);
    }
}