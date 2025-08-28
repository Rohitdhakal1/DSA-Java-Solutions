class Buy_and_Sell_Stock{

     public static int maxProfit(int[] prices) {
        int maxprofit=0;
        int minbuy = prices[0];

       
       for(int i=1 ; i<prices.length ;i++){

        minbuy = Math.min(minbuy,prices[i]);

        maxprofit=Math.max(maxprofit , prices[i]-minbuy);
        
       }
        return maxprofit;
    }

    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        Buy_and_Sell_Stock by = new Buy_and_Sell_Stock();
        System.out.println(by.maxProfit(prices));;
    }
}