import java.util.*;
import java.lang.*;
import java.io.*;

class Sixth
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num;
		int flag=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				flag=0;

				for(int j=2;j<i;j++)
					{	if(i%j==0)
						flag=1;
					}
						if(flag==0)
			{
				System.out.println(i + "is a prime factor");
			}
			
			}
		
		}
		
	}
}
		
// class Prime
// {
// 	void pn()
// 	{
// 		for(int i=1;i<num;i++)
// 		{
// 			if(num%i==0)
// 			{
// 				System.out.println(i + "is a prime factor");
// 			}
// 		}
// 	}
// }	
// 	}

// }