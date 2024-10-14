package ABC;

public class RotationalString {

	public static void main(String[] args) 
	{
		String OriginalString="ARADHYA";
		//String KeyString="RADHYAA";
		String KeyString="RADHYA";
		String NewString=OriginalString.concat(OriginalString);
		
		if(NewString.contains(KeyString))
		{
			System.out.println("String is Rotational");
		}
		else 
		{
			System.out.println("String is not Rotational");
		}

	}

}
