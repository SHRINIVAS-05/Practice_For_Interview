package DailyPractice_Integer;

public class Swaptwonumbers {

	public static void main(String[] args) {

		int a=5;
		int b=9;
		System.out.println("Before swap numbers are "+ a+","+ b);
		
		a=a+b; // 14
		b=a-b; // 5=14-9
		a=a-b; // 9=14-5;
		
		System.out.println("After swap numbers are "+ a+","+ b);

	}

}
