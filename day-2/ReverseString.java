//Reverse String
import java.util.*;
class ReverseString
{
	public static void main(String args[])
	{
		String str,rev;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String: ");
		str=sc.next();
		rev=new StringBuilder(str).reverse().toString();
		System.out.println("Reversed String is: "+rev);
		sc.close();
	}
}
		
		
		
		
