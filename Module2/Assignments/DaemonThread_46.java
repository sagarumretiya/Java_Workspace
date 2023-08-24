package com.a028;

public class DaemonThread_46 extends Thread
{
    public DaemonThread_46(String name)
    {
        super(name);
    }
 
    public void run()
    {
    	
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
        else
        {
            System.out.println(getName() + " is User thread");
        }
    }

	public static void main(String[] args)
    {
     
        DaemonThread_46 t1 = new DaemonThread_46("t1");
        DaemonThread_46 t2 = new DaemonThread_46("t2");
     
        t1.setDaemon(true);
             
        t1.start();
        t2.start();       
    }  
}
