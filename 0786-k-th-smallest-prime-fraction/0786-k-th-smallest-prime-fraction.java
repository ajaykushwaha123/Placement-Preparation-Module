class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        double left = 0.0, right = 1.0;
        int[] result = new int[2];

        while (right - left > 1e-9) {
            double mid = (left + right) / 2.0;
            int[] fraction = findFraction(arr, mid);

            if (fraction[0] == k) {
                return new int[] {fraction[1], fraction[2]};
            } else if (fraction[0] < k) {
                left = mid;
            } else {
                right = mid;
                result[0] = fraction[1];
                result[1] = fraction[2];
            }
        }

        return result;
    }

    private int[] findFraction(int[] arr, double target) {
        int count = 0, numerator = 0, denominator = 1;
        double maxFraction = 0.0;

        for (int i = 0, j = 1; i < arr.length - 1; i++) {
            while (j < arr.length && arr[i] > target * arr[j]) {
                j++;
            }

            if (j == arr.length) {
                break;
            }

            count += arr.length - j;
            double fraction = (double) arr[i] / arr[j];
            if (fraction > maxFraction) {
                maxFraction = fraction;
                numerator = arr[i];
                denominator = arr[j];
            }
        }

        return new int[] {count, numerator, denominator};
        
    }
}