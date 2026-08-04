class Solution {
    public int maxProfit(int[] prices) {


    int lowest = prices[0];
    int current_profit =0;
    for (int i=1; i<prices.length; i++){
        if (prices[i] < lowest ){
            lowest = prices[i];
        }
        else if (current_profit < prices[i] - lowest) {
            current_profit = prices[i] - lowest;
        }            
        }
    return current_profit;
    }    
    }
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=oizxjoit