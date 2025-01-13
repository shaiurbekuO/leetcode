class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = 0;
       int minPrices = prices[0];

       for(int price : prices){
            minPrices = Math.min(minPrices, price);
            maxProfit = Math.max(maxProfit, price - minPrices);
       } 
       return maxProfit;
    }
}