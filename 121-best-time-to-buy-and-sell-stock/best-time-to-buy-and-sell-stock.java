class Solution {
    public int maxProfit(int[] arr) {
      int profit=0;
      int bestShell=-1;
      int bestBuy=arr[0];
      for(int i=0;i<arr.length;i++){
       if(arr[i]<bestBuy){
        bestBuy=arr[i];
        }
        bestShell=arr[i]-bestBuy;
        if(bestShell>profit){
            // profit=arr[i]-bestBuy;
            profit=bestShell;
        }
        bestShell=0;
      }
      return profit;
    }
}