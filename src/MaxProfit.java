import java.util.Scanner;

public class MaxProfit {
    public int maxProfit(int[] prices){
        if(prices.length == 0) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price :prices){
           if(price < minPrice){
               minPrice = price;
           }
           if(price - minPrice > maxProfit){
               maxProfit = price - minPrice;
           }
        }
        return maxProfit;
    }
    public static void main(String[] args){
        Scanner sc  =  new Scanner(System.in);
        int n = sc.nextInt();
        int prices[] = new int[n];
        for(int i=0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        MaxProfit obj = new MaxProfit();
        System.out.println( "Max Profit is "+ obj.maxProfit(prices));
    }
}
