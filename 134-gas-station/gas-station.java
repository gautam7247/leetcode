class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    int total_Gas=0;  
    int total_Cost=0;
    for(int i=0;i<gas.length;i++){
        total_Gas+=gas[i];
        total_Cost+=cost[i];
    }
    if(total_Gas<total_Cost){
        return -1;
    }
    int start=0;
        int CurrGas=0;

    for(int i=0;i<gas.length;i++){
        CurrGas=CurrGas+gas[i]-cost[i];
        if(CurrGas<0){
            start=i+1;
            CurrGas=0;

        }
    }
    return start;
    }
}