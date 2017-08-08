import java.util.*;
import java.lang.*;
import java.io.*;

class Fifteenth
{
	public static void main(String args[])
	{
		//Scanner sc =new Scanner(System.in);
		double a,b,c;
		double delta,r1,r2;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		delta=((b*b)-((4*a*c)));
		double denom,num1,num2;
		denom=(2*a);
		num1=((-b) +Math.sqrt(Math.abs(delta)));
		num2=((-b) - Math.sqrt(Math.abs(delta)));
		r1=(num1/denom);
		r2=(num2/denom);
		System.out.println("The roots are" + " "+r1 + " " +r2 );





	}
}