package src.LEETCODE_75_ARRAY;

public class STOCK_BUYandSELL {

	public static void BestTimetoBuyandSellStock(int arr[]) {

		int minPrice = Integer.MAX_VALUE;
        int buyPrice = 0;
        int sellPrice = 0;
        int maxProfit = 0;

        for (int price : arr) {
            if (price < minPrice) {
                minPrice = price; // potential buying price
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyPrice = minPrice;
                    sellPrice = price;
                }
            }
        }

        System.out.println("Stock bought at: " + buyPrice);
        System.out.println("Stock sold at: " + sellPrice);
        System.out.println("Profit: " + maxProfit);

	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		BestTimetoBuyandSellStock(prices);

	}

}
