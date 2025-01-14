class Solution {
    public int buyChoco(int[] prices, int money) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++){
            if(prices[i]<a){
                b=a;
                a=prices[i];
            }
            else if (prices[i]<b){
                b=prices[i];
            }
        }
        if (money<(a+b)){return money;}
        money=money-(a+b);
        return money;
    }
}