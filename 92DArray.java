import java.util.*;
import java.lang.*;
import java.io.*;

class Ninth 
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the column and row sizes");
		int r,c;
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][] =new int[r][c];
		//int l=a.length;
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter the element");
				a[i][j]=sc.nextInt();
			}

		}
		PrintWriter pw =new PrintWriter(System.out);
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			
				{
					
					pw.print(a[i][j] + " ");

			//System.out.print(a[i][j] + " \t");
			}//System.out.println("");
			pw.println("");
		}
		pw.flush();
		pw.close();
	}
}
