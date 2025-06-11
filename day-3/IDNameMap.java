import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class IDNameMap 
{
	public static void main(String[] args)
 	{
        	Scanner sc=new Scanner(System.in);
        	HashMap<Integer,String>map=new HashMap<>();
		System.out.println("Enter ID and Name:");
		while(true)
		{
            		System.out.print("Enter ID: ");
            		String idInput=sc.nextLine();
			if(idInput.equalsIgnoreCase("exit")) 
			{
                		break;
            		}
			int id;
            		try 
			{
                		id=Integer.parseInt(idInput);
            		}catch (NumberFormatException e){
                		System.out.println("Invalid ID. Please enter a number.");
                		continue;
            		}
			System.out.print("Enter Name: ");
            		String name=sc.nextLine();
            		map.put(id,name);
        	}
        	System.out.println("\nStored ID-Name Pairs:");
        	for(Integer key:map.keySet()) 
		{
            		System.out.println("ID: " + key + ", Name: " + map.get(key));
        	}
    	}
}
