class Solution {
    static void swap(int []arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public void sortColors(int[] arr) {
      int st=0,mid=0;
      int end=arr.length-1;
      while(mid<=end){
        if(arr[mid]==0){
            swap(arr,st,mid);
            mid++;
            st++;
        }
        else if(arr[mid]==1){
            mid++;
        }
       else{

            swap(arr,mid,end);
            end--;
       }
      }

    }
}