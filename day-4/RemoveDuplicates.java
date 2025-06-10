import java.util.*;
class RemoveDuplicates
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		System.out.println("Enter elements: ");
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		LinkedHashSet<Integer>Set=new LinkedHashSet<>(list);
		System.out.println("After removing duplicate elements: ");
		for(Integer num:Set)
		{
			System.out.println(num +" ");
		}
	}
}
		
	
		