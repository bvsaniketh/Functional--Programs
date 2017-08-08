import java.util.Scanner;
import java.io.*;
import java.lang.*;
class input
	{
		public static void main(String args[])
		{
			String templ="Hello <<UserName>>, How are you? ";
			Scanner sc =new Scanner(System.in);
			String name=sc.next();
			int nl=name.length();
			if(nl <3)
		{
			System.out.println("Minimum length of more than 3 required");
		}
		else 
		{
			System.out.println("The name is " + " " + name );
		String f1 =templ.replace("<<UserName>>",name);
		System.out.println(f1);
		}
		

		}

	}
