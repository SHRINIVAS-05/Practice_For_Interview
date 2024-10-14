package ABC;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {

	public static void main(String[] args) 
	{
		String a="SILLYSPIDERS";
		char[]ch=a.toCharArray();
		int size=ch.length;
		
		Map<Character, Integer>map=new LinkedHashMap<>();
		
		int i=0;
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
			if(data.getValue()>1)
			{
				System.out.println(data);
			}
		}

	}

}
