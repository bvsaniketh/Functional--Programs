import java.util.*;
import java.lang.*;
import java.io.*;

class Thirteenth
{

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Thirteenth s =new Thirteenth();
		String sel;
		System.out.println("Select the option either to start or stop");
		sel=sc.next();
		
		if(sel.equalsIgnoreCase("start"))
		{
		System.out.println("Starting");
		s.start();
		}
		
		else if(sel.equalsIgnoreCase("stop"))
		{
			s.stop();
		}
		else if(sel.equalsIgnoreCase("exit"))
		{
			s.exit();
		}
		else
		{
			System.out.println("Invalid option"); 
		}
	
	}


	double t1,t2,total;
	String ch;
	Scanner sc=new Scanner(System.in);
	void start()
	{
		
		t1=(System.currentTimeMillis())/1000; //in seconds
		System.out.println("The started time is " + t1);
		System.out.println("Do you want to stop y/n");
		ch=sc.next();
		if(ch.equalsIgnoreCase("y"))
		{
			stop();
		}
		

		else
		{
			exit();
		}

	}

	void stop()
	{
		
		t2=(System.currentTimeMillis())/1000; //in seconds
		total = t2-t1;
		System.out.println("Time elapsed till now " + total);
	}
	void exit()
	{
		System.out.println("Thank you");
	}

}