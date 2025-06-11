import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class NameCollector
{
	public static void main(String[] args) 
	{
        	Scanner sc=new Scanner(System.in);
        	ArrayList<String>names=new ArrayList<>();
        	System.out.println("Enter names:");
		while(true) 
		{
            		System.out.print("Enter name: ");
            		String input=sc.nextLine();
			if(input.equalsIgnoreCase("exit"))
		 	{
                		break;
            		}
			names.add(input);
		}
        	System.out.println("\nStored Names:");
        	for(String name:names)
 		{
            		System.out.println(name);
        	}
    	}
}
