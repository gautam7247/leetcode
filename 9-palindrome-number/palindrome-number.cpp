class Solution {
public:
    bool isPalindrome(int x) {
     long long  int rev=0;
       int ma=x;
       int rem;
        if(x<0){
            return 0;
        }
       while(x>0){
           rem=x%10;
            rev=rev*10+rem;
            x=x/10;
       }
       if(rev==ma){
        return 1;
       }
       else{
       return 0;
       }
    }
};