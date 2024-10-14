package ABC;

public class RemoveWhiteSpaces 
{
	public static void main(String[] args) 
	{
		String a="JOIN ABC GET SKIILED	GET		PLACED		OR	TAKE REFUND";
		
		/*a=a.replace(" ", "");
		System.out.println(a);
		
		output for this---->.
		JOINABCGETSKIILED	GET		PLACED		OR	TAKEREFUND
           */
		
		
		/*a=a.replaceAll("\\t", "");
		System.out.println(a);
		
				output for this---->.
		JOIN ABC GET SKIILEDGETPLACEDORTAKE REFUND
		*/
		
		a=a.replaceAll("\\s", "");
		System.out.println(a);
		
		//output JOINABCGETSKIILEDGETPLACEDORTAKEREFUND
		
		//escape sequences t\s\n\f

		a=a.replaceAll("\\f", "");
		System.out.println(a);
	}

}
