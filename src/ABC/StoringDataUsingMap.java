package ABC;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StoringDataUsingMap {

	public static void main(String[] args) 
	{
		String a="ARADHYA";
		char ch[]=a.toCharArray();
		int size=ch.length;
		int i=0;
		Map<Character,Integer> map=new HashMap<>();
		while(i!=size)
		{
			if(map.containsKey(ch[i])==false)
			{
				map.put(ch[i],1);
			}
			else
			{
				int oldvalue=map.get(ch[i]);
				int newvalue=oldvalue+1;
				map.put(ch[i],newvalue);
				
			}
			i++;
		}
		
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		
		for(Map.Entry<Character,Integer> data:hmap)
		{
			

			System.out.print(data.getKey()+" <----> "+data.getValue());
			System.out.println();
			//System.out.print(data.getValue());

		}

	}

}
