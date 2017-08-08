import java.util.*;
import java.lang.*;
class Eleventh
{
	public static void main(String args[])
	{
		//Scanner sc =new Scanner(System.in);
		//System.out.println("Hello" + args[0]);
		// for(int i=0;i<args.length;i++)
		// {
		// 	System.out.println(args[i]);
		// }
		double x,y;
		double total;
		x=Double.parseDouble(args[0]);
		y=Double.parseDouble(args[1]);
		double x1,y1;
		x1=x*x;
		y1=y*y;
		total=Math.sqrt(x1+y1);
		System.out.println(total);	
	}
}