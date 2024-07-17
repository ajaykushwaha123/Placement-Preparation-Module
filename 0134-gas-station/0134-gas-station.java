class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totaldiff = 0;
        int fuel = 0;
        int index = 0;
        for(int i = 0 ;i < gas.length; i++){
            int diff = gas[i]-cost[i];
            totaldiff += diff;
            fuel += diff;
            if(fuel < 0){
                index = i+1;
                fuel = 0;
            }
        }
        return (totaldiff < 0) ? -1 : index;
        
    }
}