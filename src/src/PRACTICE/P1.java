package src.PRACTICE;

public class P1 {

	public static void StockBuyandSell(int arr[]) {

		int minPrice = Integer.MAX_VALUE;
		int Profit = 0;
		int minProfit = 0;
		for (int Price : arr) {
			if (Price < minPrice) {
				minPrice = Price;
			} else {
				Profit = Price - minPrice;
				if (minProfit < Profit) {
					minProfit = Profit;
				}
			}
		}
		System.out.println(minPrice + " Minimum Price");
		System.out.println(minProfit + " Maximum Profit");

	}

	public static void main(String[] args) {

		int[] numbers = { 7, 1, 5, 3, 6, 4 };
		StockBuyandSell(numbers);
	}

}
