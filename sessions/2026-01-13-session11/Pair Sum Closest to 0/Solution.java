class Solution {
    public static int closestToZero(int arr[]) {
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int closestSum = Integer.MAX_VALUE;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
            }
            else if (Math.abs(sum) == Math.abs(closestSum)) {
                closestSum = Math.max(closestSum, sum);
            }

            if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return closestSum;
    }
}