import java.util.*;
import java.io.*;
import java.lang.*;

class Fourth
{
	public static void main(String args[])

	{
		int i,n;
		//Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value to calculate of powers");
		n=Integer.parseInt(args[0]);
		for(i=0;i<n;i++)
		{
			int val;
			val=(int)Math.pow(2,i);
			System.out.println(val + " " + " is the power of 2 power " + i );


		}
	}
}
