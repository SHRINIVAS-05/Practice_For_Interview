package DailyPractice_Integer;

import java.util.Scanner;

public class FindPrimeNumber {

	public static boolean checkisPrimeNumber(int n) {
		if (n <= 1) {
			return false; // 0 and 1 are not prime
		}
		if (n == 2) {
			return true; // 2 is prime
		}
		// Check from 2 to n-1
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false; // divisible by a number other than 1 and itself
			}
		}
		return true;
	}

	public static boolean checkisPrimeNumberIngivenRange(int n) {
		if (n <= 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check the given number is prime or not");
		int n = scan.nextInt();
//		boolean checkPrime = checkisPrimeNumber(n);
//		if (checkPrime) {
//			System.out.println("The given number is prime number :" + n);
//		} else {
//			System.out.println("The given number is not prime number :" + n);
//		}

		System.out.println("This are the Prime numbers in the given range of : " +n +"\n");

		for (int i = 0; i <= n; i++) {
			boolean checkPrime = checkisPrimeNumberIngivenRange(i);
			if (checkPrime == true) {
				System.out.println(i);
			}
		}
	}

}
