public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;

        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int maxSum = sum;

        int leftPointer = B - 1;
        int rightPointer = n - 1;

        for (int i = 0; i < B; i++) {
            sum -= A[leftPointer--];

            sum += A[rightPointer--];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}