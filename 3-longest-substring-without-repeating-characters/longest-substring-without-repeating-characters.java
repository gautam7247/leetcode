class Solution {
    public int lengthOfLongestSubstring(String s) {
     int[] hash=new int[256];
     Arrays.fill(hash,-1);
     int l,r,maxlen,len=0;
     r=0;
     l=0;
     maxlen=0;
     int n=s.length();
     while(r<n){
        if(hash[s.charAt(r)]!=-1){
            if(hash[s.charAt(r)]>=l){
              l=hash[s.charAt(r)]+1;
            }
            }
        hash[s.charAt(r)]=r;
        
        len=r-l+1;
        maxlen=Math.max(maxlen,len);
        r++;

     }
    return maxlen;
    
    }
}