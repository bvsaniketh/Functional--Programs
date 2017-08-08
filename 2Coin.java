import java.util.*;
import java.lang.*;
import java.io.*;
class Second
{
	public static void main(String args[])
	{
		int flips,tails=0,heads=0;
		double val,hp,tp;
		System.out.println("Enter the number of flips");
		Scanner sc= new Scanner(System.in);
		flips=sc.nextInt();
		for(int i=0;i<flips;i++)
		{
			val=Math.random();
			if(val<0.5)
			{	System.out.println("It's a tail");
				tails++;
			}
			else 
			{	
				System.out.println("It's a head");
				heads++;
			}
		}

		tp=((((float)tails/(float)flips))*100);
		hp=((((float)heads/(float)flips))*100);
		System.out.println(tp);
		System.out.println(hp);

	}
}