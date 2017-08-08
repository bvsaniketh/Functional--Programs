import java.util.*;
import java.lang.*;
import java.io.*;

class Twelvth
{
	public static void main(String args[])
	{
		String str="ABC";
		int n= str.length();
		Twelvth t =new Twelvth();
		t.permu(str,0,n-1);
	}

	void permu(String str,int l,int r)
	{
		if(l==r)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=l;i<=r;i++)
			{
				str=swap(str,l,i);
				permu(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}
	String swap(String str,int i,int j)
	{
		char temp;
		char[]c1=str.toCharArray();
		temp=c1[i];
		c1[i]=c1[j];
		c1[j]=temp;
		return String.valueOf(c1);  //GIVE THE COUNT MESSAGES

	}
}