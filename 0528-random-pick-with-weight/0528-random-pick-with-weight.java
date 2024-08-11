class Solution {

    TreeMap<Double, Integer> map;
    Random random;

    public Solution(int[] w) {
        random = new Random();
        map = new TreeMap<>();
        int sum = Arrays.stream(w).reduce(0, (a, b) -> a + b);
        int currSum = 0;
        for (int i = 0; i < w.length; ++i) {
            currSum += w[i];
            map.put((double) currSum / sum, i);
        }
    }
    
    public int pickIndex() {
        return map.ceilingEntry(random.nextDouble()).getValue();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */