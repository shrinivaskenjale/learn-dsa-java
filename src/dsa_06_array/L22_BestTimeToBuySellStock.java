package dsa_06_array;

public class L22_BestTimeToBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                // We will not sell if today's price is lowest so far.
                minPrice = price; // update the lowest price
            } else {
                int profit = price - minPrice; // calculate profit if sold today
                if (profit > maxProfit) {
                    maxProfit = profit; // update max profit if better
                }
            }
        }

        return maxProfit;
    }
}


/*
You are given an array prices where prices[i] represents the price of a stock on the
i-th day.

Your task is to find the maximum profit you can achieve by choosing exactly one day to
buy the stock and one different day in the future to sell it.

- You must buy before you sell.
- If no profit is possible, return 0.

Input:  prices = [7, 1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 1 (price = 1), sell on day 4 (price = 6), profit = 6 - 1 = 5.

Input:  prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: No profitable transaction possible.


====================
Brute Force
====================

Intuition:
Try out all possible combinations of buy day and sell day.

1. Initialize maxProfit = 0.
2. Loop through each day i (buy day):
   a. Loop through each day j > i (sell day):
       - Calculate profit = prices[j] - prices[i]
       - If profit > maxProfit, update maxProfit.
3. Return maxProfit.

Time Complexity: O(n^2)
- Two nested loops over the array.

Space Complexity: O(1)
- No extra space used.

====================
Better
====================

There is no better solution for this problem

====================
Optimal
====================

Kadane-like logic

Intuition:
- Track the lowest price so far and calculate how much profit you’d make if you sold today.
- Keep track of highest profit.
- If we want to sell the stock on current day with maximum profit, we should have bought
the stock when the stock price was lowest in past days.

1. Initialize:
   - minPrice = maximum possible value (to track lowest buying price so far)
   - maxProfit = 0 (to track the highest profit possible)
2. Traverse the array:
   a. If current price is less than minPrice, update minPrice (new best day to buy)
   b. Else, calculate profit = current price - minPrice
      - If profit > maxProfit, update maxProfit
3. Return maxProfit

Time Complexity: O(n)
- Single loop through the array

Space Complexity: O(1)
- Uses constant space (just two variables)

 */