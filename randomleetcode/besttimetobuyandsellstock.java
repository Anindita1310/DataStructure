public class besttimetobuysellstock {
    public int maxProfit(int[]prices){
        int buy1 = Integer.MIN_VALUE;
        int sell1=0;
        int buy2=Integer.MIN_VALUE;
        int sell2=0;
        for(int price:prices){
            buy1=Math.max(buy1,-price);
            sell1=Math.max(sell1,buy1+price);
            buy2=Math.max(buy2,sell1-price);
            sell2=Math.max(sell2,buy2+price);
        }
        return sell2;


    }
    public static void main(String[] args) {
        besttimetobuysellstock ob=new besttimetobuysellstock();
        int[] prices = {1,2,3,4,5};
        System.out.println("Max profit is "+ob.maxProfit(prices));
        int[] prices1 = {3,3,5,0,0,3,1,4};
        System.out.println("Max profit is "+ob.maxProfit(prices1));
    }
    
}
