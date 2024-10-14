package ABC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class NonRepeat 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String s="SILLSYSPIDER";
		char arr[]=s.toCharArray();
		int size=s.length();
		
		Map<Character,Integer> map=new HashMap<>();
		
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(arr[i])==false)
			{
				map.put(arr[i],1);
			}
			else
			{
				int oldval=map.get(arr[i]);
				int newval=oldval+1;
				map.put(arr[i],newval);
			}
			i++;
		}
		
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		
		for(Map.Entry<Character,Integer>data:hmap)
		{
			if(data.getValue()==1)
			{
				System.out.println(data);
			}
			//System.out.print(data.getKey());
			//System.out.print(data.getValue());
		}
		
	}

}
/*
 * package ABC;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapData 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char arr[]=s.toCharArray();
		int size=s.length();
		
		Map<Character,Integer> map=new HashMap<>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(arr[i])==false)
			{
				map.put(arr[i],1);
			
			}
			else
			{
				int oldval=map.get(arr[i]);
				int newval=oldval+1;
				map.put(arr[i],newval);
			}
			
			i++;
		}
		
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		
		for(Map.Entry<Character,Integer>data:hmap)
		{
			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}
		
	}

}
*/
