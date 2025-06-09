//Area and Perimeter of a Triangle
import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
		int a,B,c;
		double A,b,h,P;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		a=sc.nextInt();
		System.out.println("Enter b value: ");
		B=sc.nextInt();
		System.out.println("Enter c value: ");
		c=sc.nextInt();
		P=a+B+c;
		System.out.println("Perimeter value is: "+P);
		System.out.println("Enter b value: ");
		b=sc.nextInt();
		System.out.println("Enter h value: ");
		h=sc.nextInt();
		A=0.5*b*h;
		System.out.println("Area value is: "+A);
		sc.close();
	}
}
		
		

		