package ABC;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccuranceCharacter {

	public static void main(String[] args) 
	{
		String a="GOD_BLESS_SPIDERMAN_NO HOMECOMMING";
		char[]ch=a.toCharArray();
		int size=ch.length;
		
		Map<Character,Integer>map=new LinkedHashMap<>();
		int i=0;
		while(i!=size)
		{
			if(map.containsKey(ch[i])==false) {
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
		
		
		Set<Map.Entry<Character, Integer>>hmap=map.entrySet();
		int Maxvalue=1;
		char Maxkey=' ';
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()>Maxvalue)
			{
				Maxvalue=data.getValue();
				Maxkey=data.getKey();
				//System.out.print(data.getValue()+" "+data.getKey());
				//System.out.println();
			}
		}
		
		System.out.println(Maxvalue+"  Max   ");
		System.out.println(Maxkey+"    Key");
	}

}
