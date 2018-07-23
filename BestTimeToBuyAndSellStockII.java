class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int b=1; b<prices.length; b++){
            if(prices[b]-prices[b-1]>0){
                maxProfit+=(prices[b] - prices[b-1]);
            }
        }
        return maxProfit;
    }
}