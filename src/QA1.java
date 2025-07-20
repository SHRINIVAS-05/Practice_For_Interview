import java.util.TreeSet;

public class QA1 {
	
	public static void main(String[] args) {
		
		int array[]= {1,4,17,7,25,3,100};
		
		
		
		TreeSet<Integer> acc= new TreeSet();

		for(int i=0;i<array.length;i++)
		{
			acc.add(array[i]);
		}
		int k=1;
		
			for(Integer data:acc)
			{
				if(k<=3) {
				System.out.println(data);
				k++;
				}
			
			}
		
		
	}

}
