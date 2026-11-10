class Solution {
    public int[] searchRange(int[] arr, int x) {
        int[] a=new int[2];
        int n=arr.length;
        int st=0;
        int end=n-1;
        int first=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                first=mid;
                st=mid+1;
            }
            else if(arr[mid]<x){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    
          st=0;
            end=n-1;
        int second =-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==x){
                second=mid;
                end=mid-1;
            }
            else if(arr[mid]<x){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        a[0]=second;
        a[1]=first;
        return a;
    }
}