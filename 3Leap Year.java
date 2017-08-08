import java.util.*;
import java.lang.*;
import java.io.*;

class Third
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int yr;
		yr=sc.nextInt();
		//t2 h =new t2();
		if(yr%4==0)
		 {
		 	System.out.println(yr + "is a leap year");
		 }
		else 
		 {
			System.out.println(yr + "is not a leap year");
		 }
		// h.check(yr)? System.out.println("Leap year"):System.put.println("Not a leap year"); //Using ternary operator
	}
}
// class t2
// {
// 	bool check(yr)
// 	{
// 		if (yr%4==0)
// 			return true;

// 	}
// }