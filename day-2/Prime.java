//Prime numbers
import java.util.*;
class Prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		boolean Prime=true;
		if(n<=1)
		{
			Prime=false;
		}
		else
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					Prime=false;
					break;
				}
			}
		}
		if(Prime)
		{
			System.out.println("It is a prime number: ");
		}
		else
		{
			System.out.println("It is a not prime number: ");
		}
	}
}