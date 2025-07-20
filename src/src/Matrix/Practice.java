package src.Matrix;

public class Practice {

	public static void main(String[] args) {

		int[][] First2DArray = { {1, 5, 9}, {2, 4, 6} };
		int[][] Second2DArray = { {2, 6, 10}, {3, 5, } };

		int row=First2DArray.length;
		
		int SumOfTwo2DArray[][]=new int[row][];
		
		for(int i=0;i<row;i++)
		{
			int col=Math.min(First2DArray[i].length,Second2DArray[i].length);

			SumOfTwo2DArray[i]= new int[col];
			for(int j=0;j<col;j++)
			{
				SumOfTwo2DArray[i][j]=First2DArray[i][j]+Second2DArray[i][j];
			}
		}
		
		for(int i=0;i<SumOfTwo2DArray.length;i++)
		{
			for(int j=0;j<SumOfTwo2DArray[i].length;j++)
			{
				System.out.print(SumOfTwo2DArray[i][j]+" ");
			}
			System.out.println();
		}
	}
}
