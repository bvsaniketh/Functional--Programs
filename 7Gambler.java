import java.util.*;
import java.lang.*;
import java.io.*;

class Seventh
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int stake,goal,n;
		int win=0,loss=0;
		double status;
		System.out.println("Enter the amount of times");
		n=sc.nextInt();
		System.out.println("Enter the stake amount");
		stake=sc.nextInt();
		System.out.println("Enter the goal amount");
		goal=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			status=Math.random();
			if(status>0.5)
			{
				win++;
				if(stake==goal)
					System.out.println("The stake's reached the maximum limit of " + goal);
				else 
					{ System.out.println("WON IT MATE");
					stake++;
					}//WIN

			}

			else
			{
				loss++;
				if(stake==0)
					System.out.println("You have lost all your money and now you have 0 balance");
				else
			{		System.out.println("LOST IT MATE");
				stake--;//LOST
			}
			}

			System.out.println("The amount you have is " +" "+ stake);
			System.out.println(win +" "+ "are the number of won games " + loss + " " + "are the number of lost games");

		}
		System.out.println("The number of wins are " + " " + win);
		System.out.println("The number of losses are " + " " + loss);
		System.out.println("The win percentage is " + " " + ((float)win/n)*100);
		System.out.println("The loss percentage is" + " " + ((float)loss/n)*100);

	}
}