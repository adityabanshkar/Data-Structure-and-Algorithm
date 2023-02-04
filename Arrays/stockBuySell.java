package Arrays;

public class stockBuySell {
    public static int maxProfit(int[] prices) {
        int mini=prices[0];
        int profit=0;
        int diff=0;
        for(int i=1;i<prices.length;i++){
            diff=prices[i]-mini;
            profit=Math.max(profit,diff);
            mini=Math.min(mini,prices[i]);
        }
        return profit;
        
    }
    public static void main(String[] args) {
        
    int[] a={7,1,5,3,6,4};
    System.out.println("profit :"+maxProfit(a));

    }

    
}
