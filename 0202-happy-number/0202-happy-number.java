class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            n = sum(n);
        }
        return true;
    }
    
    public int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += Math.pow(n%10,2);
            n = n/10;
        }
        return sum;
    }
}