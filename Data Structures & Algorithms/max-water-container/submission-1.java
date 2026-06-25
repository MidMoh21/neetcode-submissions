class Solution {
    public int maxArea(int[] arr) {
           int n = arr.length;
           int l = 0 ; 
           int r = n-1;
           int res = 0;
           while(l<r){
                int length = (r-l);
                int height = Math.min(arr[r],arr[l]);
                res = Math.max(res , length * height);
                if(arr[r] >= arr[l]) l++;
                else r--;
           }
           return res;
    }
}
