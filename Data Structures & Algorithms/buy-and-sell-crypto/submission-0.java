class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int res = 0;
        int l = 0;
        for(int r = 1; r<n; r++){
            int sub = prices[r] - prices[l];
            if(sub > 0){
                res = Math.max(sub , res);
            }else{
                l = r ;
            }
        }
        return res;
    }
}
