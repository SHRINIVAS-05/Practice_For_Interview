package DailyPractice_Integer;

import java.util.Scanner;

public class FindOddorEvennumber {

	public static void FindOddorEvennumberinTheGivenNumber(int n) {

		if (n % 2 == 0) {
			System.out.println("The given number is even number : " + n);
		} else {
			System.out.println("The given number is odd number : " + n);
		}
	}

	public static void FindOddorEvennumberinTheGivenRange(int start, int end) {
		int EvenNumberCount = 0;
		int OddNumberCount = 0;

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println("The given number is even number : " + i);
				EvenNumberCount++;
			} else {
				System.out.println("The given number is odd number : " + i);
				OddNumberCount++;
			}
		}

		System.out.println("Count of the Odd Numbers is : " + OddNumberCount);
		System.out.println("Count of the Even Numbers is : " + EvenNumberCount);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter a number to check the given number is Odd or Even");
//		int n = scan.nextInt();
//		FindOddorEvennumberinTheGivenNumber(n);

		System.out.println("Please enter the range of the numbers to check the Even or Odd number");
		System.out.println("Enter the Starting number");
		int start = scan.nextInt();
		System.out.println("Enter the Ending number");
		int end = scan.nextInt();

		FindOddorEvennumberinTheGivenRange(start, end);

	}

}
