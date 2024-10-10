class Solution {
    public int maxWidthRamp(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[stack.peek()] > arr[i]) {
                stack.push(i);
            }
        }
        
        int max = 0;
      
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                max = Math.max(max, i - stack.pop());
            }
        }
        return max;
    }
}