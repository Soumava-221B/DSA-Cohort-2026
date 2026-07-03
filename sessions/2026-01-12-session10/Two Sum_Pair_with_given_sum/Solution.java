class Solution {
    boolean twoSum(int arr[], int target) {
        if (arr.length < 2) return false;

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return true;
            } if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
    return false;
}