class Solution {
    public int mySqrt(int x) {
      int st=0,end=x;
      int ans=-1;
      while(st<=end){
        int mid=st+(end-st)/2;
        long value=(long)mid*mid;
        if(value==x){
            return mid;
        }
        else if(value<x){
            ans=mid;
            st=mid+1;
        }
        else{
            end=mid-1;
        }
      }  
      return ans;
    }
}