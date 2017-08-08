import java.util.*;
import java.lang.*;
import java.io.*;
class Tenth
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,i,j,k;
		int count=0;
		int temp;
		boolean check;
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();

		}

		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
		for(i=0;i<n;i++)
	{
			System.out.println("After Sorting" + " "+  arr[i]);
	}

		for (i=0;i<n-2;i++)
	{ 
			if(i==0||arr[i]>arr[i-1])
			{
			j=i+1;
			k=n-1;
			while(j<k)
			{
				if(arr[i]+arr[j]+arr[k]==0)
				{
					System.out.println("The distinct elements are " + arr[i] +" " + arr[j] + " " + arr[k]);//print
					j++;
					k--;
					while(j<k && arr[j]==arr[j-1])
					j++;
					while(j<k && arr[k]==arr[k+1])
					k--;
				}
				else if(arr[i]+arr[j]+arr[k]<0)
					j++;
				else if(arr[i]+arr[j]+arr[k]>0)
					k--; //give count message
			}
		}
	}

	//Prints if required elements are 
		// for(int i=0;i<n;i++)
		// {
		// 	for(int j=i+1;j<n;j++)
		// 	{
		// 		for(int k=j+1;k<n;k++)
		// 		{
		// 			if(arr[k]+arr[j]+arr[i]==0)
		// 			{
		// 				System.out.println("Sum zero are for these " + arr[i]+ " " + arr[j]+ " " + arr[k]);
		// 				count++;

		// 			}
		// 			if(arr[i])
		// 		}
		// 	}

		// }
		// System.out.println(count);

	// 	check=findd(arr,n);
	// 	if(check)
	// 	{
	// 		System.out.println("Enter again");
	// 		for(int i=0;i<n;i++)
	// 			arr[i]=sc.nextInt();
	// 	}



	// }


	// static boolean findd(int arr[],int n)
	// {
	// 	int flag=0;
	// 	for(int i=0;i<n;i++)
	// 	{
	// 		for(int j=i+1;j<n;j++)
	// 		{
	// 			if(arr[j]==arr[i])
	// 			{
	// 				System.out.println("Duplicate found as " + arr[j]);
	// 				flag=1;

	// 			}
	// 		}
	
	// 	}
	// 	if(flag==1)
	// 	return true;
	// 	else
	// 		return false;
	// }

	}
}