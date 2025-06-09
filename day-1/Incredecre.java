import java.util.*;
class Incredecre
{
	public static void main(String args[])
	{
		int a=5;
		int i=++a + ++a;
		int j=++a + a++;
		int k=a + a++;
		int l=a++ + ++a;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
	
}