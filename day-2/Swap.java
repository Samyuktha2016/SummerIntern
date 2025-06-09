//Swapping of 2 numbers with temporary variable
import java.util.*;
class Swap
{
	public static void main(String args[])
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		a=sc.nextInt();
		System.out.println("Enter b value: ");
		b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		sc.close();
	}
}

