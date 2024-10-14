package ABC;

public class ProveStringImmutable {

	public static void main(String[] args) 
	{
		
		//immutable string 
		String a="ABC";
		String b="TECH";
		a.concat(b);
		System.out.println(a);// out put ---> ABC
		
		// mutable string 
		
		StringBuffer c=new StringBuffer("ABC");
		//StringBuffer d=new StringBuffer("TECH");
		c.append(b);
		System.out.println(c);//ABCTECH
		

	}

}
