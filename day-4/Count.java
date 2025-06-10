import java.util.*;
class Count
{
	public static void main(String args[])	
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value: ");
		int n=sc.nextInt();
		String res=" ";
		while(n>0)
		{
			n--;
			char ch=(char)('A'+(n%26));
			res=ch+res;
			n=n/26;
		}
		System.out.println("Output: "+res);
	}
}