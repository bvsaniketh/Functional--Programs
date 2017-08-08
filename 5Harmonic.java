import java.util.*;
import java.lang.*;
import java.io.*;

class Fifth
{
	public static void main(String args[])
	{
	try
	{
		Scanner sc = new Scanner(System.in);
		int n;
		double sum=0;
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
		}
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
		}
		System.out.println(sum);
	}
	catch(ArithmeticException e)
	{
		System.out.println("There is a zero exception case here" + e);
	}
}
}