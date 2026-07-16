class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] freq = new int[26];
        int l =0;
        int answer = 0; // will return it
        int maxFreq = 0;
        for(int r = 0; r < s.length();r++){
            
            freq[s.charAt(r) - 'A']++ ;
            if(freq[s.charAt(r)-'A'] > maxFreq) maxFreq = freq[s.charAt(r) - 'A'];
            int window = r-l+1;
            int tmp = window - maxFreq;
            while(tmp>k){
                freq[s.charAt(l) - 'A']-- ;
                l++;
                window = r-l+1;
                tmp = window - maxFreq;
            }
            answer = Math.max(answer ,window);
            
        }
        return answer;
    }
}
