class Solution {
    public int pivotInteger(int n) {
  int leftValue = 1;
        int rightValue = n;
        int sumLeft = leftValue;
        int sumRight = rightValue;

        if (n == 1) return n;

        while (leftValue < rightValue) {
            
            if (sumLeft < sumRight) {
                sumLeft += ++leftValue;
            } else {
                sumRight += --rightValue;
            }
            if (sumLeft == sumRight && leftValue + 1 == rightValue - 1) {
                return leftValue + 1;
            }
        }

        return -1; 
    }
}