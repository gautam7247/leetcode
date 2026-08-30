class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int totalGas = 0;
        int tank = 0;
        int start = 0;
        
        for (int i = 0; i < gas.length; i++) {
            
            int diff = gas[i] - cost[i];
            
            totalGas += diff;
            tank += diff;
            
            // Current start se aage nahi ja sakte
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }
        
        // Total gas sufficient hai ya nahi
        if (totalGas >= 0) {
            return start;
        }
        
        return -1;
    }
}