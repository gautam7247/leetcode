class Solution {
    public boolean isPalindrome(int x) {
       long rev=0;
       int ma=x;
       long rem;
        if(x<0){
            return false;
        }
       while(x>0){
           rem=x%10;
            rev=rev*10+rem;
            x=x/10;
       }
       if(rev==ma){
        return true;
       }
       else{
       return false;
       } 
    }
}