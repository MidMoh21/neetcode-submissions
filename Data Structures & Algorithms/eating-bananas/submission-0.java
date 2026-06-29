class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l = 1;
        int r = 0;

        for (int num : piles) {
            r = Math.max(r, num);
        }
        int res = r;
        while (l <= r) {
            int k = l + (r - l) / 2;
            int hours = 0;
            for (int num : piles) {
                hours += (int) Math.ceil((double) num / k);
            }
            if (hours <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return res;

    }
}
