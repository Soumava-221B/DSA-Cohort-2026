class Solution {
    int countPairs(int arr[], int target) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int count = 0;

        while (left < right) {

            if (arr[left] + arr[right] < target) {
                count += right - left;

                left++;
            } 
            else {
                right--;
            }
        }

        return count;
    }
}
